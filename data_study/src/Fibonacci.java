import java.util.*;

/*
** 피보나치 수열은 보통 0, 1 로 시작한다.
 */
public class Fibonacci {
    public static List<Integer> fibonacci(int n) {
        if(n < 0) {
            throw new IllegalArgumentException("n must not be less than zero");
        }

        if(n == 0) {
            return new ArrayList<>();
        }

        if(n == 1) {
            return Arrays.asList(0);
        }

        if(n == 2) {
            return Arrays.asList(0, 1);
        }

        final List<Integer> seq = new ArrayList<>();
        seq.add(0);
        n--;
        seq.add(1);
        n--;

        while(n > 0) {
            int a = seq.get(seq.size() - 1);
            int b = seq.get(seq.size() - 2);
            seq.add(a + b);
            n--;
        }

        return seq;
    }

    private Map<Integer, Integer> fibCache = new HashMap<>();

    public int fibN(int n) {
        if(n < 0) {
            throw new IllegalArgumentException("n must not be less than zero");
        }

        fibCache.put(0, 0);
        fibCache.put(1, 1);

        return recursiveCachedFibN(n);
    }

    private int recursiveCachedFibN(int n) {
        if(fibCache.containsKey(n)) {
            return fibCache.get(n);
        }

        int value = recursiveCachedFibN(n - 1) + recursiveCachedFibN(n - 2);
        fibCache.put(n, value);

        return value;
    }
}
