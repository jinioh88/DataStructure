package stack;

public class main {
    public static void main(String[] args) {
        ArrayStack<String> stack = new ArrayStack<>();
        stack.push("hello");
        System.out.println(stack.peek());
    }
}
