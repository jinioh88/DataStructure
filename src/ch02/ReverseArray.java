package ch02;

import java.util.Scanner;

public class ReverseArray {
    static void swap(int[] a, int i1, int i2) {
        for(int n : a) {
            System.out.print(n+" ");
        }
        System.out.println("교환");
        int t = a[i1];
        a[i1] = a[i2];
        a[i2] = t;
    }

    static void reverse(int[] a) {
        int n = (a.length)/2;
        for(int i=0; i<n;i++) {
            System.out.println("교환");
            swap(a,i,a.length-i-1);
        }
    }

    static int sumArr(int[] a) {
        int sum = 0;
        for(int n : a) {
            sum += n;
        }
        return sum;
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();

        int[] x = {1,2,3};
        System.out.println(sumArr(x));
//        for(int i=0; i<num;i++) {
//            x[i] = sc.nextInt();
//        }
//
//        for(int n : x){
//            System.out.println(n);
//        }
//
//        reverse(x);
//        System.out.println("-----");
//
//        for(int n : x){
//            System.out.print(n+" ");
//        }
//        System.out.println("끝");
    }
}
