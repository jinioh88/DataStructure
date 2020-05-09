
import org.junit.Test;

import java.util.*;
import java.util.Queue;

import static org.junit.Assert.*;

public class ListTest {
    @Test
    public void sortInts() {
        final int[] numbers = {-3, -5, 1, 7, 4, -2};
        final int[] expected = {-5, -3, -2, 1, 4, 7};

        Arrays.sort(numbers);
        assertArrayEquals(expected, numbers);
        String s;
    }

   @Test
   public void customSorting() {
        final List<Integer> numbers = Arrays.asList(4, 7, 1, 6, 3, 5, 4);
        final List<Integer> expected = Arrays.asList(7, 6, 5, 4, 4, 3, 1);

       Collections.sort(numbers, new ReverseNumbericalOrder());
       assertEquals(expected, numbers);
   }

   @Test
    public void arrayDefinitions() {
        final int[] integers = new int[3];
        final boolean[] bools = {false, true, true, false};
        final String[] strings = new String[] {"one", "two"};

        final Random r = new Random();
        final String[] randomArrayLength = new String[r.nextInt(100)];
   }

   @Test
    public void arrayCopy() {
        int[] integers = {0, 1, 2, 3, 4};

        int[] newIntegersArray = new int[integers.length + 1];
        System.arraycopy(integers, 0, newIntegersArray, 0, integers.length);
        integers = newIntegersArray;
        integers[5] = 5;

        assertEquals(5, integers[5]);
    }

    @Test
    public void queueInsertion() {
        final Queue<String> queue = new LinkedList<>();
        queue.add("first");
        queue.add("second");
        queue.add("third");

        assertEquals("first", queue.remove());
        assertEquals("second", queue.remove());
        assertEquals("third", queue.peek());
        assertEquals("third", queue.remove());
    }

    @Test
    public void createTree() {
        final SimpleTree<Integer> root = new SimpleTree<>(7, null, null);
        root.insert(3);
        root.insert(9);
        root.insert(10);

        assertTrue(root.search(10));
        assertEquals(Integer.valueOf(10), root.getRight().getRight().getValue());
    }
}
