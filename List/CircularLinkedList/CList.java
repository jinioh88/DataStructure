package CircularLinkedList;

import SingleLinkedList.Node;

public class CList <E> {
  private Node last; // 리스트의 마지막 가리킴
  private int size;
  public CList() {
    last = null;
    size = 0;
  }
  
  public void insert(E newItem) {
    Node newNode = new Node(newItem, null);
    if(last == null) {
      newNode.setNext(newNode);
      last = newNode;
    } else {
      newNode.setNext(last.getNext());
      last.setNext(newNode);
    }
    size++;
  }
  
  public Node delete() {
    Node x = last.getNext();
    if(x==last) 
      last = null;
    else {
      last.setNext(x);
      x.setNext(null);
    }
    size--;
    return x;
  }
}
