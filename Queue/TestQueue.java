public class TestQueue {
    public static void main(String[] args){
        Queue<Integer> q = new Queue<Integer>();
        q.dequeue();
        q.enqueue(1);
        q.enqueue(2);

        System.out.println(q.dequeue());;
        System.out.println(q.dequeue());;
        System.out.println(q.dequeue());;
        System.out.println(q.dequeue());;
    }
}
