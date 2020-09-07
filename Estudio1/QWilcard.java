import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class QWilcard {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Queue<String> q = new LinkedList<>();
    String str = sc.next();

    // Caso borde donde el string no tiene ningún '?'
    if(str.indexOf('?') == -1)
      return;

    q.add(str);

    int index;

    while(!q.isEmpty()){
      String tmp = q.poll();

      index = tmp.indexOf('?');

      if(index != -1){
        tmp = tmp.substring(0, index) + '0' + tmp.substring(index + 1);
        q.add(tmp);

        tmp = tmp.substring(0, index) + '1' + tmp.substring(index + 1);
        q.add(tmp);
      }
      else{
        System.out.println(tmp);
      }
    }
  }
}
