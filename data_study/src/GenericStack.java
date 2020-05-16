import java.util.LinkedList;
import java.util.List;

public class GenericStack<E> {
    private final List<E> values;

    public GenericStack() {
        values = new LinkedList<>();
    }

    public void push(final E element) {
        values.add(0, element);
    }

    public E pop() {
        if(values.isEmpty()) {
            return null;
        }

        return values.remove(0);
    }

    public static GenericStack<A> pushAllA(final List<A> listOfA) {
        final GenericStack<A> stack = new GenericStack<>();
        for(A a : listOfA) {
            stack.push(a);
        }

        return stack;
    }
}
