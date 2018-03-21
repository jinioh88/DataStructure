import java.net.SocketTimeoutException;

/*
    Stack의 목적 : 컴퓨터 실행 흐르믕ㄹ 제어하기 위해 만들어진 자료구조
    스택 명세 : 1) 요소를 삽입하고 꺼낼 수 있다. 마지막에 넣은 요소가 가장 먼저 나온다.
              2) 스택이 가득 차면 요소를 삽입할 수 없다.
              3) 비어있으면 꺼낼 수 없다 .
**/
public class Stack<Integer> implements Stackable<Integer>{
    private int capacity;
    private int top;
    private int[] elements;

    public Stack(){
        this(5);
    }

    public Stack(int capacity){
        this.capacity = capacity;
        this.top = -1;
        this.elements = new int[capacity];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public boolean isFull() {
        return capacity == top+1;
    }

    @Override
    public void push(int n) {
        if(isEmpty()){
            System.out.println("Stack is Full!");
        } else {
            elements[++top] = n;
        }
    }


    @Override
    public int pop() {
        int res = 0;
        if(isEmpty()){
            System.out.println("Stack is Empty!");
        } else {
            res = elements[top--];
        }
        return res;
    }

}
