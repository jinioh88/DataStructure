package array;

public class ArrayUtil {
    private int count = 0;
    private int[] intArray;
    private int[] intArray2 = {1, 2, 3, 4, 5};

    public ArrayUtil() {
    }

    public ArrayUtil(int count) {
        intArray = new int[count];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
    }

    private static final String[] data = {
                "Kingcome",
                "Rice, Master. Eugene",
                "Williams, Mr. Charles Eugene",
                "Vander Planke, Mrs. Julius (Emelia Maria Vandemoortele)",
                "Masselmani, Mrs. Fatima",
                "Fynney, Mr. Joseph J",
                "Beesley, Mr. Lawrence",
                "McGowan, Miss. Anna \"Annie\"",
                "Sloper, Mr. William Thompson",
                "Palsson, Miss. Torborg Danira",
                "Asplund, Mrs. Carl Oscar (Selma Augusta Emilia Johansson)",
                "Emir, Mr. Farred Chehab",
                "Fortune, Mr. Charles Alexander",
                "Dwyer, Miss. Ellen \"Nellie\"",
                "Todoroff, Mr. Lalio"
    };

    public int findM(String[] data) {
        for(String s : data) {
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == 'M') {
                    count ++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        ArrayUtil au = new ArrayUtil();
        System.out.println(au.findM(data));
    }
}
