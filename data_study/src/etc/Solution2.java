package etc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution2 {
    public static String solution(String[] participant, String[] completion) {
        List<String> partList = new ArrayList<>(Arrays.asList(participant));
        List<String> comList = new ArrayList<>(Arrays.asList(completion));

        partList.removeIf(comList::contains);

        String answer = partList.get(0);

        return answer;
    }

    public static void main(String[] args) {
        String[] part = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] comp = {"josipa", "filipa", "marina", "nikola"};
        System.out.println(solution(part, comp));
    }
}
