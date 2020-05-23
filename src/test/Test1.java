package test;

public class Test1 {
    public String solution(int[] data) {
        boolean desendable = true;
        boolean asendable = true;
        for(int i = 0; i < data.length - 1; i++) {
            if(data[i] > data[i+1]) {
                asendable = false;
            } else if(data[i+1] > data[i]) {
                desendable = false;
            }
        }

        String result = "";
        if(desendable) {
            result = "descending";
        } else if (asendable) {
            result = "ascending";
        } else {
            result = "mixed";
        }

        return result;
    }

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        System.out.println(test1.solution(new int[] {1, 2, 3, 4, 5, 6}));
        System.out.println(test1.solution(new int[] {6, 5, 4, 3, 2, 1}));
        System.out.println(test1.solution(new int[] {1, 2, 3, 7, 4, 5, 6}));
    }
}
