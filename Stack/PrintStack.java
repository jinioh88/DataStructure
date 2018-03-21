public class PrintStack {
    public static void main(String[] args){
        Stack<Integer> s = new Stack<Integer>();
        s.pop();
        s.push(1);
        s.push(19);
        System.out.println(s.pop());

    }
}
