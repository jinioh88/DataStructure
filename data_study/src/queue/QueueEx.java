package queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueEx<E> {
    private Queue<E> queue1 = new LinkedList();
    private Queue<E> queue2 = new ArrayDeque();

    public static void main(String[] args) {
        QueueEx ex = new QueueEx();
        Queue<Integer> queue = ex.queue1;
        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println(queue.peek());
        System.out.println(queue.size());

        System.out.println(queue.poll());
        System.out.println(queue.size());

        queue.remove();
        System.out.println(queue.size());

        Queue<Integer> queue3 = ex.queue2;
        queue3.add(1);
        queue3.add(2);
        queue3.add(3);
    }
}
