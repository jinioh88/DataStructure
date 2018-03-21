/*
    큐 : 처음들어간게 먼저 나오는 구조
    어디에쓰이나 : 입력 순서가 중요한 경우 사용 됨. 운영체제 스케줄러..
    큐 명세
     1) 요소를 삽입 삭제 할 수 있다. 가장 먼저 들어간게 먼저 나온다.
     2) 현재 front에 저장된 요소를 확인 할 수 있다.
     3) 현재 rear에 저장된 요소를 확인 할 수 있다.
     4) 큐가 가득차면 공간을 두배로 확장 후 삽입한다.
     5) 빈 큐는 꺼낼 수 없다.

**/
public class Queue implements Queueable<Integer>{

    private int capaciry;
    private int front;
    private int rear;
    private int[] elements;

    public Queue(){
        this(6);
    }

    public Queue(int capaciry) {
        this.capaciry = capaciry;
        this.front = 0;
        this.rear = 0;
        this.elements = (int[]) new int[capaciry];
    }

    @Override
    public boolean isEmpty() {
        return front == rear;
    }

    @Override
    public int front() {
        return elements[front];
    }

    @Override
    public int rear() {
        return elements[rear];
    }

    @Override
    public void enqueue(int n) {
        if(isFull()) {
            System.out.println("Queue is Full!");
        } else {
            // 순환 되서 capacity로 나머지값 처리 해줌.
            elements[rear++ % capaciry] = n;
        }
    }

    @Override
    public int dequeue() {
        int res;
        if(isEmpty()){
            System.out.println("Queue is Empty!");
        } else {
            res = front();
            front = (++front)%capaciry;
        }
        return res;
    }

    @Override
    public boolean isFull() {
        return capaciry == rear+1;
    }
}
