import java.util.*;

public class ParOrdenado {
  public static void main(String[] args) {
    Integer[] primeros = {18, 7, 3, 26, 46, 98, 106, 107};
    Integer[] segundos = {13, 17, 92, 2, 1, 22, 33, 67};

    Par[] pares = new Par[primeros.length];

    for(int i = 0; i < primeros.length; i++){
      pares[i] = new Par(primeros[i], segundos[i]);
    }

    Arrays.sort(pares, (a, b) -> b.first - a.first);

    for(Par p : pares) System.out.println(p.first + " - " + p.second);
  }
}

class Par{
  int first;
  int second;

  Par(int f, int s){
    first = f;
    second = s;
  }
}
