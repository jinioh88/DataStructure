package ch02;

public class IntArray {
    public static void main(String[] args) {
        int[] a = new int[5];

        a[1] =  37;
        a[2] = 20;

        for(int n : a) {
            System.out.println(n);
        }

        int[] b = {1,2,3,4,5}; // 초기화
        int[] c = new int[] {1,2,3,4,5};
        int[] d = c.clone();
    }
}
