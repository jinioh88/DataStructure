package sort;

import linked_list.LinkedListEx;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class InsertionSort {
    public List<Integer> sort(Integer[] data) {
        List<Integer> list = new LinkedList<>(Arrays.asList(data));

        for(int i = 0; i < list.size() - 1; i++) {
            int temp = list.get(i+1);
            for(int j = i + 1; j > 0; j--) {
                if(list.get(j-1) > temp) {
                    int temp2 = list.get(j-1);

                    list.remove(j-1);
                    list.add(j-1, temp);
                    list.remove(j);
                    list.add(j, temp2);
                }
            }
        }

        return list;
    }

    public static void main(String[] args) {
        InsertionSort sort = new InsertionSort();
        List<Integer> result = sort.sort(new Integer[]{6, 6, 0, 3, 2, 4, 1, 5});
        for(Integer data : result) {
            System.out.println(data);
        }
    }
}
