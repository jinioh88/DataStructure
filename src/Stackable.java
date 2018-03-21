public interface Stackable<Integer> {
    public boolean isEmpty();
    public boolean isFull();
    public void push(int n);
    public int pop();
}
