package test;

import java.util.Stack;

public class Test3 {
    public String solution(int[] data) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int cnt = 1;

        for(int i = 0; i < data.length; i++) {
            int num = data[i];

            for(int j = cnt; j <= num; j++) {
                stack.push(j);
                sb.append("+");
                cnt++;
            }

            if(stack.pop() == num) {
                sb.append("-");
            } else {
                System.out.println("error");
                return "";
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Test3 test3 = new Test3();
        System.out.println(test3.solution(new int[] { 4, 3, 6, 8, 7, 5, 2, 1 }));
    }
}
