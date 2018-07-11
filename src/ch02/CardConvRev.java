package ch02;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class CardConvRev {
    static int cardConvR(int x, int r, Queue<Character> queue) {
        int digit = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do{
            queue.add(dchar.charAt(x%r));
            x /= r;
        }while(x!=0);

        return digit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no;
        int cd;
        int dno;
        int retry;
        Queue<Character> q = new LinkedList<>();

        System.out.println("10진수를 기수로 변경");
        do{
            do{
                System.out.println("변환 하는 정수 : ");
                no = sc.nextInt();
            }while(no<0);

            do{
                System.out.println("기수 : ");
                cd = sc.nextInt();
            }while(cd<2 || cd >36);

            dno = cardConvR(no, cd, q);

            for(char c : q){
                System.out.println(c);
            }

            System.out.println("한번 더?(1 / 0)");
            retry = sc.nextInt();
        }while(retry==1);
    }
}
