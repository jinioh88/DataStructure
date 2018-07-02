public class MaxNum {
    static int max4(int a, int b, int c, int d){
        int max = 0;
        max = a;
        if(b>max){
            max = b;
        }
        if(c>max){
            max = c;
        }
        if(d>max){
            max = d;
        }

        return max;
    }

    static int min3(int a, int b, int c){
        int min = 99;

        if(a<min)
            min = a;
        if(b<min)
            min = b;
        if(c<min)
            min = c;

        return min;
    }

    static int ga(int a, int b){
        int result = 0;
        result = ((a+b)/2)*(a+b);

        return result;
    }

    static int jari(int a){
        int count = 1;
        a /= 10;
        while(a>0){
            count++;
            a /=10;
        }
        return count;
    }

    public static void main(String[] args){
        System.out.println(jari(123444));
    }
}
