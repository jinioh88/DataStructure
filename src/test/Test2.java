package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test2 {
    private Integer[] data = {5, 6, 7, 8, 9};

    public int solution(int data1, int data2) {
        List<Integer> sumList = new ArrayList<>();
        for(int i = 0; i < data.length - 2; i ++) {
            for(int j = i + 1; j < data.length - 1; j++) {
                for(int k = j + 1; k < data.length; k++) {
                    int sum = data[i] + data[j] + data[k];
                    if(sum <= data2) {
                        sumList.add(sum);
                    }
                }
            }
        }

        return sumList.stream().max(Integer::compare).orElse(-1);
    }

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        System.out.println(test2.solution(5, 21));
    }
}
