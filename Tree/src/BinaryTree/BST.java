package BinaryTree;

public class BST<Key extends Comparable<Key>,Value> {
	public Node root;
	public Node getRoot() {return root;}
	public BST(Key newId, Value newName) {
		root = new Node(newId, newName);
		
	}
}
;