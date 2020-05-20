package stack;

import array.ArrayUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackEx<T> {
    private final List<T> stack = new ArrayList();

    public void push(T data) {
        stack.add(data);
    }

    public T pop() {
        return stack.remove(stack.size() - 1);
    }

    public T peek() {
        return stack.get(stack.size() - 1);
    }

    public List<T> getStack() {
        return stack;
    }

    public int size() {
        return stack.size();
    }

    public boolean empty() {
        return stack.isEmpty();
    }

    public T search(int index) {
        if(index > stack.size()) {
            return null;
        }

        return stack.get(index);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.peek());
        System.out.println(stack.size());

        System.out.println(stack.pop());
        System.out.println(stack.size());

        System.out.println(stack.empty());
        System.out.println(stack.search(1));
        System.out.println(stack.search(3));

        System.out.println("========================");

        StackEx<Integer> stackEx = new StackEx<>();
        stackEx.push(1);
        stackEx.push(2);
        stackEx.push(3);

        System.out.println(stackEx.peek());
        System.out.println(stackEx.size());

        System.out.println(stackEx.pop());
        System.out.println(stackEx.size());

        System.out.println(stackEx.empty());
        System.out.println(stackEx.search(1));
        System.out.println(stackEx.search(3));
    }
}
