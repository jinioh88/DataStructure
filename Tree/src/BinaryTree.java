import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree<Key extends Comparable<Key>> {
	private Node root;
	public BinaryTree() {root = null;}
	public Node getRoot() {
		return root;
	}
	public void setRoot(Node root) {
		this.root = root;
	}
	
	public boolean isEmpty() {return root==null;}
	
	// 전위 순회
	public void preorder(Node n) {
		if(n!=null) {
			System.out.print(n.getKey()+" ");
			preorder(n.getLeft()); // 양쪽 노드 순
			preorder(n.getRight());
		}
	}
	
	// 중위 순회
	public void inorder(Node n) {
		if(n!=null) {
			inorder(n.getLeft());
			System.out.print(n.getKey()+" ");
			inorder(n.getRight());
		}
	}
	
	// 후위 순위
	public void postorder(Node n) {
		if(n!=null) {
			postorder(n.getLeft());
			postorder(n.getRight());
			System.out.print(n.getKey()+" ");
		}
	}
	
	// 레벨 순회
	public void levelorder(Node root) {
		Queue<Node> q = new LinkedList<Node>();
		Node t;
		q.add(root);
		while(!q.isEmpty()) {
			t = q.remove(); // 가장 앞에꺼 제거
			System.out.print(t.getKey()+" ");
			if(t.getLeft()!=null)
				q.add(t.getLeft());
			if(t.getRight()!=null)
				q.add(t.getRight());
		}
	}
	
	// 트리 노드 수
	public int size(Node n) {
		if(n==null)
			return 0;
		else
			return(1+size(n.getLeft())+size(n.getRight()));
	}
	
	// n을 루트로 하는 높이
	public int hight(Node n) {
		if(n==null)
			return 0;
		else
			return (1+Math.max(hight(n.getLeft()), hight(n.getRight())));
	}
	
	// 두 트리 동일성 검사
	public static boolean isEqual(Node n, Node m) {
		if(n==null || m==null) {
			return m==n;
		}
		
		if(n.getKey().compareTo(m.getKey())!=0) {
			return false;
		}
		
		return (isEqual(n.getLeft(),m.getLeft())&&isEqual(n.getRight(),m.getRight()));
	}
}
