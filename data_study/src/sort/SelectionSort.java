package sort;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SelectionSort {
    public List<Integer> sort(Integer[] data) {
        List<Integer> list = new LinkedList<>(Arrays.asList(data));

        for(int i = 0; i < list.size() -1; i++) {
            int min = list.get(i);
            int index = i; // 비교해서 작은게 없으면 현재 위치가 제일 작은 값 위치.
            for(int j = i + 1; j < list.size(); j++) {
                if(min > list.get(j)) {
                    min = list.get(j);
                    index = j;
                }
            }
            int reverseData = list.get(i);
            list.remove(i);
            list.add(i, min);
            list.remove(index);
            list.add(index, reverseData);
        }

        return list;
    }

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        List<Integer> result = selectionSort.sort(new Integer[]{6, 6, 2, 1, 3, 5, 4});

        for(Integer data : result) {
            System.out.println(data);
        }
    }
}
