package queue;

import java.util.*;

public class QueueEx<E> {
    private List<E> queue = new LinkedList<>();
    private Queue<E> queue1 = new LinkedList();
    private Queue<E> queue2 = new ArrayDeque();

    public void add(E data) {
        queue.add(data);
    }

    public E peek() {
        return queue.get(0);
    }

    public int size() {
        return queue.size();
    }

    public E poll() {
        return queue.remove(0);
    }

    public List<E> getQueue() {
        return queue;
    }

    public void remove() {
        queue.remove(0);
    }

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

        System.out.println("====================");

        List<Integer> queue4 = ex.getQueue();
        queue4.add(1);
        queue4.add(2);
        queue4.add(3);

        System.out.println(ex.peek());
        System.out.println(ex.size());

        System.out.println(ex.poll());
        System.out.println(ex.size());

        ex.remove();
        System.out.println(ex.size());
    }
}
