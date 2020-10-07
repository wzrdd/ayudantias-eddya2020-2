public class MergeList {
  static class Node{
    public int val;
    public Node next = null;

    Node(int v, Node n){
      val = v;
      next = n;
    }
  }

  static class LinkedList{
    public static Node head = null;

    public void insert(int v){
      Node new_node = new Node(v, head);
      head = new_node;
    }

    public void print(){
      Node tmp = head;
      while(tmp != null){
        System.out.print(tmp.val + " ");
        tmp = tmp.next;
      }
      System.out.println("");
    }

    public boolean isEmpty(){
      return head == null;
    }

    // Sorting
    public void sort(){
      head = sort(head);
    }

    // 18 -> 15 -> 13 -> null
    // 9 -> 8 -> 6 -> null
    public Node sort(Node h){
      if(h == null || h.next == null){
        return h;
      }

      Node mid = getMid(h);
      Node nextToTheMiddle = mid.next;
      mid.next = null;

      Node left = sort(h);
      Node right = sort(nextToTheMiddle);

      return merge(left, right);
    }

    public static Node merge(Node left, Node right){
      if(left == null){
        return right;
      }
      else if(right == null){
        return left;
      }

      if(left.val <=  right.val){
        left.next = merge(left.next, right);
        return left;
      }
      else if(right.val < left.val){
        right.next = merge(left, right.next);
        return right;
      }

      return head; // dummy
    }

    public static Node getMid(Node h){
      if(h == null) return null;

      Node slow = h;
      Node fast = h;

      while(fast.next != null && fast.next.next != null){
        slow = slow.next;
        fast = fast.next.next;
      }

      return slow;
    }
  }
  public static void main(String[] args) {
    LinkedList ll = new LinkedList();
    int[] arr = { 6, 8, 9, 13, 15, 18 };

    for(int a : arr) ll.insert(a);

    System.out.println("Sin ordenar: ");
    ll.print();
    System.out.println("Ordenado: ");
    ll.sort();
    ll.print();
  }
}
