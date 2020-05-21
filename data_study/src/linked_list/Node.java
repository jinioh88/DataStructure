package linked_list;

public class Node<T> {
    private T data;
    private Node next;

    public T getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}
