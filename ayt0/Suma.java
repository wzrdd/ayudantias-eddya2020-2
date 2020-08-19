import java.util.Scanner;

/* Enunciado: Recibir N números desde la consola y mostrar la suma de todos los elementos.
 
   Una solución más simple sería 

   int suma = 0

   for(int i = 0; i < n; i++){
    suma += sc.nextInt();
   }

   System.out.println(suma);
*/
public class Suma{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    int suma = 0;
    for(int i : arr){
      // suma = suma + i;
      suma += i;

      // Esto se puede usar para mostrar los números que se van sumando 
      //
      // System.out.print(i + " ");
    }

    System.out.println(suma);
  }
}
