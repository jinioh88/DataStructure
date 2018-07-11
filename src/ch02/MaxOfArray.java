package ch02;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArray {
    static int maxOf(int[] a) {
        int max = a[0];

        for(int i=1;i<a.length;i++) {
            if(a[i]>max)
                max = a[i];
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int num = random.nextInt(10)+1;
        System.out.println("사람 수 :"+num);

        int[] height = new int[num];

        for(int i=0; i<num; i++) {
            height[i] = 100 + random.nextInt(90);
            System.out.println(height[i]);
        }
        System.out.println("-----------------");
        System.out.println(maxOf(height));
    }
}
