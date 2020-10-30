import java.util.*;

class Node {
	public int value;
	public Node left;
	public Node right;

	public Node(int v) {
		value = v;
		left = null;
		right = null;
	}
}

class BinarySearchTree {
	public Node root;

	public BinarySearchTree() { root = null; }
	public boolean isEmpty() { return root == null; }

	public void insertRec(int newValue) {
		if (root == null) {
			root = new Node(newValue);
			return;
		}

		insertRec(root, newValue);
	}

	private Node insertRec(Node node, int newValue) {
		if (node == null) {
			return new Node(newValue);
		}

		if (newValue < node.value) {
			node.left = insertRec(node.left, newValue);
		} else {
			node.right = insertRec(node.right, newValue);
		}

		return node;
	}

	public void printKLevel(int level){
		printKLevel(root, level);
	}

	private void printKLevel(Node node, int level) {
		if (node == null) return;

		if (level == 0) {
			System.out.print(node.value + " ");
			return;
		} else {
			printKLevel(node.left, level - 1);
			printKLevel(node.right, level - 1);
		}
	}

/*
	public void PreOrder() {
		PreOrder(root);
	}

	private void PreOrder(Node node) {
		if (node == null)
			return;

		System.out.print(node.value + " ");
		PreOrder(node.left);
		PreOrder(node.right);
	}
	*/
}



public class Nivel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int level = sc.nextInt();

		BinarySearchTree BST = new BinarySearchTree();

		for (int i = 0; i < n; i++) {
			BST.insertRec(sc.nextInt());
		}

		BST.printKLevel(level);
	}
}
