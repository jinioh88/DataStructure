public class Node <Key extends Comparable<Key>,Value> {
    private Key id;
    private Value name;
    private Node left, right;

    public Node(Key id, Value name) {
        this.id = id;
        this.name = name;
        this.left = null;
        this.right = null;
    }

    public Key getKey() {
        return id;
    }

    public void setKey(Key id) {
        this.id = id;
    }

    public Value getValue() {
        return name;
    }

    public void setValue(Value name) {
        this.name = name;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
