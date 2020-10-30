class Node {
	public Integer val;
	public Node next;

	public Node(int data, Node next) {
		this.val = data;
		this.next = next;
	}
}

class LinkedList {
	public Node head = null, tail = null;

	LinkedList() {
	}

	LinkedList(Node n) {
		head = tail = n;
	}

	public void insert(int v) {
		if (head == null) {
			head = tail = new Node(v, head);
			return;
		}

		Node new_node = new Node(v, null);
		tail.next = new_node;
		tail = new_node;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void print() {
		Node tmp = head;
		for (int i = 0; tmp != null; tmp = tmp.next, ++i) {
			if (i == 0) System.out.print(tmp.val);
			else System.out.print(" " + tmp.val);
		}
		System.out.print("\n");
	}
}
