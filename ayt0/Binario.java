import java.util.*;

public class Binario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        imprimirTodasLasCombinaciones("", n);
    }
    /*
     Parte desde un string vacío y en cada llamada a la función
     se vuelve a llamar a la función agregándole un '0' o un '1'.
     La primera llamada genera 2 strings, la segunda genera 2 strings
     desde cada string anterior y cada vez que se vuelve a hacer
     se multiplica por 2, como repetimos esto n veces
     la cantidad de combinaciones es 2^n combinaciones.

     ""

     "0"
     "1"

     "0" -> "00" y "01"
     "1" -> "10" y "11"
   */
    static void imprimirTodasLasCombinaciones(String str, int n){
        if(str.length() == n){
            System.out.println(str);
            return;
        }

        imprimirTodasLasCombinaciones(str + '0', n);
        imprimirTodasLasCombinaciones(str + '1', n);
    }
}
