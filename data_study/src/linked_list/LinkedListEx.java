package linked_list;

import javax.xml.crypto.Data;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
    private Node<Integer> head;

    public void add(int data) {
        if(head == null) {
            head = new Node<>(data);
        } else {
            Node<Integer> now = head;
            while(now.getNext() != null) {
                now = now.getNext();
            }

            now.setNext(new Node(data));
        }
    }

    public void add(int index, int data) {
        if(head == null) {
            return ;
        }

        Node<Integer> now = head;
        for(int i = 0; i < index - 1; i++) {
            now = now.getNext();
        }

        Node<Integer> nowData = new Node<>(data);
        nowData.setNext(now.getNext());
        now.setNext(nowData);
    }

    public static void main(String[] args) {
//        List<Integer> list = new LinkedList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(1, 5);
//        for(int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//        System.out.println(list.isEmpty());
//        System.out.println(list.size());
//        System.out.println(list.contains(1));
//        list.remove(1);
//        list.addAll(List.of(4, 6));

//        System.out.println("=============================");

        LinkedListEx ex = new LinkedListEx();
        ex.add(1);
        ex.add(2);
        ex.add(3);
        ex.add(1, 5);
        ex.add(1, 4);
        System.out.println(ex.head.getData());
        System.out.println(ex.head.getNext().getData());
        System.out.println(ex.head.getNext().getNext().getData());
        System.out.println(ex.head.getNext().getNext().getNext().getData());
        System.out.println(ex.head.getNext().getNext().getNext().getNext().getData());
    }
}
