package list;

import java.util.NoSuchElementException;

public class SList <E> {
    protected Node head;
    private int size;
    public SList() {
        head = null;
        size = 0;
    }

    public int search(E target) {
        Node p = head;
        for(int k=0; k<size; k++) {
            if(target==p.getItem()) {
                return k;
            }
            p = p.getNext();
        }
        return -1;  // 탐색 실패
    }

    public void insertFront(E newItem) {
        head = new Node(newItem, head);  // 새로운 노드를 우선 head가 가리키고 있던거 가리키게 하고, head는 새 노드를 바라보도록 한다.
        // 삽입 전
        // head -> 노드1 -> 노드2
        // 삽입 후
        // head -> newNode -> 노드1 -> 노드2
        size++;
    }

    public void insertAfter(E newItem, Node p) {
        p.setNext(new Node(newItem, p.getNext()));
        size++;
    }

    public void deleteFront() {
        if(isEmpty())
            throw new NoSuchElementException();
        head = head.getNext();
        size--;
    }

    // p가 가리키는 다음 노드 삭제
    public void deleteAfter(Node p) {
        if(p==null)
            throw new NoSuchElementException();
        Node t = p.getNext();
        p.setNext(t.getNext());
        t.setNext(null);
        size--;
    }

    private boolean isEmpty() {
        if(head.getNext()==null)
            return true;
        return false;
    }

}
