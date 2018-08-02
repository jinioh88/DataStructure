package list;

import java.util.NoSuchElementException;

public class CList <E> {
    private Node last;
    private int size;
    public CList() {
        last = null;
        size = 0;
    }

    public void insert(E newItem) {
        Node newNode = new Node(newItem, null);
        if(last==null) {
            newNode.setNext(newNode);
            last = newNode;
            // last가 가리키는 노드의 다음 노드가 newNode가 되도록
            // last -> node1 -> newNode -> node2 -> ...
        } else {
            newNode.setNext(last.getNext());
            last.setNext(newNode);
        }
        size++;
    }

    public Node delete() {
        if(isEmpty())
            throw new NoSuchElementException();
        Node x = last.getNext();   // 첫노드
        if(x==last)
            last = null;
        else {
            last.setNext(x.getNext());
            x.setNext(null);
        }
        size--;
        return x;
    }

    private boolean isEmpty() {
        if(last.getNext()==null)
            return true;
        return false;
    }
}
