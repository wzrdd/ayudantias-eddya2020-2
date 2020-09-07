static boolean hasCycle(SinglyLinkedListNode head) {
  SinglyLinkedListNode conejo = head, tortuga = head;

  while(conejo != null && conejo.next != null){
    conejo = conejo.next.next;
    tortuga = tortuga.next;

    if(conejo == tortuga) return true;
  }

  return false;
}
