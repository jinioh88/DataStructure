package ch02;

import java.util.Scanner;

public class CardConvRev {
    static int cardConvR(int x, int r, char[] d) {
        int digit = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do{
            d[digit++] = dchar.charAt(x%r);
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
        char[] cno = new char[32];

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

            dno = cardConvR(no, cd, cno);

            for(int i = dno-1; i>=0; i--) {
                System.out.println(cno[i]);
            }

            System.out.println("한번 더?(1 / 0)");
            retry = sc.nextInt();
        }while(retry==1);
    }
}
