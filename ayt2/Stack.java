/*
  Implementación simple de un Stack de enteros.
  TDA: LIFO (Last In, First Out)
  ** Tiempos de complejidad **
  Inserción: O(1)
  Acceso: O(1)
  Eliminar elemento: O(1)
  Búsqueda (Existencia): Tiempo O(n) y Espacio O(n)
*/

class Stack{
    private class Node{
        private int val;
        private Node next;

        private Node(int value){
            val = value;
        }
    }

    private Node top;

    public boolean isEmpty(){
        return top == null;
    }

    // Devuelve el valor del elemento que está más arriba
    public int peek(){
        return top.val;
    }

    // Agrega un elemento al stack
    public void push(int val){
        Node tmp = new Node(val);

        tmp.next = top;
        top = tmp;
    }

    // Remueve y devuelve el valor del elemento que está más arriba
    public int pop(){
       int tmp = top.val;

       top = top.next;

       return tmp;
    }
}
