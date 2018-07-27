import java.util.NoSuchElementException;

public class DList <E> {
    protected DNode head, tail;
    protected int size;
    public DList() {
        head = new DNode(null,null,null);
        tail = new DNode(null, head, null);
        head.setNext(tail);
        size = 0;
    }

    // p가 가리키는 노드 앞에 삽입
    public void insertBefore(DNode p, E newItem) {
        DNode t = p.getPrevious();
        DNode newNode = new DNode(newItem, t, p);
        p.setPrevious(newNode);
        t.setNext(newNode);
        size++;
    }

    // p가 가리키는 노드 뒤에 삽입
    public void insertAfter(DNode p, E newItem) {
        DNode t = p.getNext();
        DNode newNode = new DNode(newItem, p, t);
        t.setPrevious(newNode);
        p.setNext(newNode);
        size++;
    }

    public void delete(DNode x) {
        if(x==null)
            throw new NoSuchElementException();
        DNode f = x.getPrevious();
        DNode r = x.getNext();
        f.setNext(r);
        r.setPrevious(f);
        size--;
    }
}
