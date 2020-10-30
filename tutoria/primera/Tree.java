import java.util.*;

public class Tree {
	static class Node {
		int value;
		Node left, right;

		Node(int v, Node l, Node r) {
			value = v;
			left = l;
			right = r;
		}
	}

	static class BT {
		Node root;

		public BT(Node r) {
			root = r;
		}

		public void insertLevelOrder(ArrayList<Integer> arr, Node node, int i) {
			if (i < arr.size()) {
				Node temp = new Node(arr.get(i));
				node = temp;
				node.left = insertLevelOrder(arr, node.left, 2 * i + 1);
				node.right = insertLevelOrder(arr, node.right, 2 * i + 2);
			}

			root = node;
		}

		// imprime en inorder
		public void print() {
			print(root);
		}

		// Preorder [root, left, right]
		// inorder [left, root, right]
		// postorder [left, right, root]
		private void print(Node node) {
			if (node == null)
				return;

			System.out.print(node.value + " ");
			print(node.left);
			print(node.right);
		}

		// https://www.geeksforgeeks.org/write-a-c-program-to-find-the-maximum-depth-or-height-of-a-tree/
		// Max Height
		public int getHeight() {
			return getHeight(root);
		}

		private int getHeight(Node node) {
			if (node == null)
				return 0;
			else {
				int lDepth = getHeight(node.left);
				int rDepth = getHeight(node.right);

				return Math.max(lDepth, rDepth) + 1;
			}
		}

		public boolean search(int key) {
			return search(root, key);
		}

		private boolean search(Node node, int key) {
			if (node == null)
				return false;
			if (node.value == key) {
				return true;
			}

			boolean left = search(node.left, key);
			boolean right = search(node.right, key);

			return (left || right);
		}
	}

	public static void main(String[] args) {
		// https://www.geeksforgeeks.org/tree-traversals-inorder-preorder-and-postorder/
		// https://www.geeksforgeeks.org/print-leaf-nodes-left-right-binary-tree/
		Node left = new Node(2, new Node(4, null, null), null);
		Node right = new Node(3, new Node(5, new Node(6, null, null), new Node(7, null, null)),
				new Node(8, new Node(9, null, null), new Node(10, null, null)));
		Node root = new Node(1, left, right);

		BT tree = new BT(root);

		tree.print();
	}
}
