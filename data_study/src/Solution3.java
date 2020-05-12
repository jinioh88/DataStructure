import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution3 {
    public static boolean solution(String[] phone_book) {
        boolean answer = true;

        List<String> phones = new ArrayList<>(Arrays.asList(phone_book));

        for(int i = 0; i < phone_book.length; i++) {
            String temp = phone_book[i];
            phones.removeIf(p -> p.equals(temp));
            if(phones.stream().anyMatch(p -> p.startsWith(temp))) {
                answer = false;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] phones = {"119", "119272745637", "789"};
        System.out.println(solution(phones));
    }
}
