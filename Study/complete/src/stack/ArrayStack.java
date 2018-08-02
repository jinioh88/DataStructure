package stack;

import java.util.EmptyStackException;

public class ArrayStack <E> {
    private E s[];
    private int top;

    public ArrayStack() {
        s = (E[]) new Object[1];
        top = -1;
    }

    public int size() {
        return top+1;   // 0부터 시작하므로 +1 한다.
    }

    public boolean isEmpty() {
        return (top==-1);
    }

    public E peek() {
        if(isEmpty())
            throw new EmptyStackException();
        return s[top];
    }

    public void push(E newItem) {
        if(size()==s.length)
            resize(2*s.length);
        s[++top] = newItem;
    }

    private void resize(int len) {
        Object[] temp = new Object[len];
        for(int i=0;i<len;i++) {
            temp[i] = s[i];
        }
        s = (E[]) temp;
    }

    public E pop() {
        if(isEmpty())
            throw new EmptyStackException();
        E item = s[top];
        s[top--] = null;
        if(size()>0 && size()==s.length/4)
            resize(s.length/2);
        return item;
    }
}
