import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Rotacion {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int rotacion = sc.nextInt();
    Queue<Integer> q = new LinkedList<>();

    for(int i = 0; i < rotacion; i++){
      q.add(sc.nextInt());
    }

    for(int i = 0; i < n - rotacion; i++){
      System.out.print(sc.nextInt() + " ");
    }

    while(!q.isEmpty()){
      System.out.print(q.poll() + " ");
    }
  }
}
