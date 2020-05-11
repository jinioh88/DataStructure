import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static List<String> fizzBuzz(final int n) {
        final List<String> toReturn = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            final String word = toWord(3, i, "Fizz") + toWord(5, i ,"Buzz");

            if(word.isEmpty()) {
                toReturn.add(Integer.toString(i));
            } else {
                toReturn.add(word);
            }
        }

        return toReturn;
    }

    private static String toWord(final int divisor, final int value, final String word) {
        return value % divisor == 0 ? word : "";
    }
}
