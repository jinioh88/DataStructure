package sort;

import java.util.*;

public class BubbleSort<T> {
    public List<Integer> sort(Integer... data) {
        boolean isFirst = true;
        List<Integer> list = new LinkedList<>(Arrays.asList(data));

        for(int i = 0; i < list.size() -1; i++) {
            for(int j = 0; j < list.size() - i - 1; j++) {
                if(list.get(j) > list.get(j+1)) {
                    isFirst = false;
                    int t1 = list.get(j);
                    int t2 = list.get(j+1);
                    list.remove(j);
                    list.add(j, t2);
                    list.remove(j+1);
                    list.add(j+1, t1);
                }

            }
            if(isFirst) {
                break;
            }
        }

        return list;
    }

    public static void main(String[] args) {
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        List<Integer> result = bubbleSort.sort(1, 6, 3, 4, 2, 5);
        for(Integer data : result) {
            System.out.println(data);
        }
    }
}
