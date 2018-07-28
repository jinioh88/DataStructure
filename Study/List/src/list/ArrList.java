package list;

import java.util.NoSuchElementException;

public class ArrList<E> {
    private E a[];
    private int size;

    public ArrList() {
        a = (E[]) new Object[1];
        size = 0;
    }

    public E peek(int k) {
        if(size==0){
            throw new NoSuchElementException();
        }
        return a[k];
    }

    // 삽입은 배열의 마지막 항목에 삽입하는 경우와,
    public void insertLast(E newItem) {
        if(size==a.length)
            resize(2*a.length);
        a[size++] = newItem;
    }

    // 삽입 k번째 항목에 삽입하는 두가지가 있다.
    public void insert(E newItem, int k) {
        if(size==a.length)
            resize(2*a.length);
        for(int i=size-1;i>=k;i--)
            a[i+1] = a[i];
        a[k] = newItem;
        size++;
    }

    private boolean isEmpty() {
        if(a.length==0)
            return true;
        return false;
    }

    public E delete(int k) {
        if(isEmpty())
            throw new NoSuchElementException();
        E item = a[k];
        for(int i=k;i<size;i++)
            a[i] = a[i+1];
        size--;

        if(size>0 && size==a.length/4)
            resize(a.length/2);
        return item;
    }

    private void resize(int newSize) {
        Object[] t = new Object[newSize];
        for(int i=0;i<size;i++) {
            t[i] = a[i];
        }
        a = (E[]) t; // a가 t를 가리키게
    }
}
