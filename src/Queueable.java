public interface Queueable<Integer> {
    public boolean isEmpty();
    public int front();
    public int rear();
    public void enqueue(int n);
    public int dequeue();
    public boolean isFull();
}
