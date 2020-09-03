/*
  Implementación simple de una Queue de enteros.
  TDA: FIFO (First In , First Out)
  ** Tiempos de complejidad **
  Inserción al último: O(1)
  Acceso al primer elemento: O(1)
  Búsqueda (Existencia): O(n) [Necesitando memoria auxiliar. Space complexity O(n)]
  Eliminar elemento:
    * En cualquier parte: O(n) [También memoria auxiliar: O(n)]
    * Eliminar el primero: O(1)
*/

class Queue{
    private class Node{
        private int val;
        private Node next;

        private Node(int value){
            val = value;
        }
    }

    private Node head;
    private Node tail;

    public boolean isEmpty(){
        return head == null;
    }

    // Devuelve el valor del primer elemento (el que está en head)
    public int peek(){
        return head.val;
    }

    // Agrega un elemento al final (el que estará en tail)
    public void add(int value){
        Node tmp = new Node(value);

        if(tail != null){
            tail.next = tmp;
        }

        tail = tmp;

        if(head == null){
            head = tmp;
        }
    }

    // Remueve el primer elemento (head) y lo devuelve.
    public int poll(){
        int tmp = head.val;

        head = head.next;

        if(head == null){
            tail = null;
        }

        return tmp;
    }
}
