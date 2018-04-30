
public class ArrayQueue <E> {
	private E[] q;
	private int front, rear, size;
	public ArrayQueue() {
		q = (E[])new Object[2];
		front = rear = size = 0;
	}
	
	public int size() {return size;}
	public boolean isEmpty() {return (size==0);}
	
	public void add(E newItem) {
		if((rear+1)%q.length==front)
			resize(2*q.length);
		
		rear = (rear+1)%q.length;
		q[rear] = newItem;
		size++;
	}
}
