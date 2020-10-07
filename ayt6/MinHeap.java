import java.util.*;

public class MinHeap {
  public static void main(String[] args) {
    Integer[] arr = {18, 7, 3, 26, 46, 98, 106, 107};

    // Por defecto es un min-heap
    PriorityQueue<Integer> pq = new PriorityQueue<>();

    // Max-Heap
    // PriorityQueue<Integer> pq;
    // pq = new PriorityQueue<>((a, b) -> b - a);

    for(Integer a : arr) pq.add(a);

    while(!pq.isEmpty()){
      System.out.println(pq.poll() + " ");
    }
  }
}
