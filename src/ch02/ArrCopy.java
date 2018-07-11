package ch02;

public class ArrCopy {
    static void copy(int[] a, int[] b) {
        for(int i=0; i<a.length; i++) {
            b[i] = a[i];
        }
    }

    static void rcopy(int[] a, int[] b) {
        for(int i=0; i<b.length; i++) {
            a[i] = b[b.length-i-1];
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        int[] b = new int[a.length];

        copy(a,b);

        for(int n : b){
            System.out.println(n);
        }

        System.out.println();

        rcopy(a,b);

        for(int n : a){
            System.out.println(n);
        }
    }
}
