package SingleLinkedList;

import java.util.NoSuchElementException;

public class SingleLList <E> {
  protected Node head;  // 첫 노드
  private int size;
  public SingleLList() {
    head = null;
    size = 0;
  }
  
  // 처음 부터 찾는다.
  public int search(E target) {
    Node p = head;
    for(int k=0;k<size;k++) {
      if(target==p.getItem())
        return k;
      p = p.getNext();
    }
    return -1;
  }
  
  public void insertFront(E newItem) {
    head = new Node(newItem,head);
    size++;
  }
  
  public void insertAfter(E newItem, Node p) {
    p.setNext(new Node(newItem,p.getNext()));
    size++;
  }
  
  public void deleteFront() {
    if(isEmpty()) throw new NoSuchElementException();
    head = head.getNext();
    size--;
  }
  
  public void deleteAfter(Node p) {
    if(p==null) throw new NoSuchElementException();
    Node t = p.getNext();
    p.setNext(t.getNext());
    t.setNext(null);
    size--;
  }

  private boolean isEmpty() {
    if(size==0)
      return true;
    return false;
  }
}
 