package linked_list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
    private Node head;
    private Node now;

    public LinkedListEx() {
        this.head = null;
    }

    public void add(Integer data) {
        if(head == null) {
            head = new Node(0);
            now = new Node(data);
            head.setNext(now);
        } else {
            while(head.getNext() != null) {
                now = head.getNext();
            }

            now.setNext(new Node(data));
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1, 5);
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println(list.contains(1));
        list.remove(1);
        list.addAll(List.of(4, 6));

        System.out.println("=============================");

        LinkedListEx ex = new LinkedListEx();
        ex.add(1);
        ex.add(2);
        ex.add(3);
        System.out.println(ex.head.getData());
        System.out.println(ex.head.getNext().getData());
        System.out.println(ex.head.getNext().getNext().getData());
    }
}
