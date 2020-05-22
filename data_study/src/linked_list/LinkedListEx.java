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

    public void print() {
        if(head == null) {
            System.out.println("데이터 없음!");
        }

        Node<Integer> now = head;
        System.out.println(now.getData());
        while(now.getNext() != null) {
            now = now.getNext();
            System.out.println(now.getData());
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        if(head == null) {
            return 0;
        }

        int count = 1;
        Node<Integer> now = head;
        while(now.getNext() != null) {
            count++;
            now = now.getNext();
        }

        return count;
    }

    public boolean contains(int data) {
        Node<Integer> now = head;
        if(data == now.getData()) {
            return true;
        }

        while(now.getNext() != null) {
            now = now.getNext();
            if(data == now.getData()) {
                return true;
            }
        }

        return false;
    }

    public void remove(int index) {
        Node<Integer> now = head;
        if(index == 0) {
            head = now.getNext();
        }

        Node<Integer> prev = now;
        now = now.getNext();
        for(int i = 1; i <index; i++) {
            prev = now;
            now = now.getNext();
        }

        prev.setNext(now.getNext());
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
        System.out.println(ex.isEmpty());

        ex.add(1);
        ex.add(2);
        ex.add(3);
        ex.add(1, 5);
        ex.add(1, 4);
        ex.print();

        System.out.println(ex.isEmpty());
        System.out.println(ex.size());
        System.out.println(ex.contains(1));
        System.out.println(ex.contains(8));

        System.out.println("==================");
        ex.remove(1);
        ex.print();
    }
}
