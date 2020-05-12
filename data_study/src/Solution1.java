import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1 {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer;

        List<Integer> indexList = new ArrayList<>();
        for(int i = 0; i < commands.length; i++) {
            int[] newArr
                    = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(newArr);
            indexList.add(newArr[commands[i][2] - 1]);
        }

        answer = indexList.stream().mapToInt(i -> i).toArray();

        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,5,2,6,3,7,4};
        int[][] arr2 = {{2,5,3},{4,4,1},{1,7,3}};

        int[] solution = solution(arr1, arr2);
        for(Integer i : solution) {
            System.out.println(i);
        }
    }
}
