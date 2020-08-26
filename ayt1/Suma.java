import java.util.Scanner;

/*
  Enunciado: Entregar la suma de los N primeros números naturales.
             Donde N es un número entregado por consola.

  Ej:
  N = 5
  1 + 2 + 3 + 4 + 5 = 15
  N = 10
  1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55
*/

public class Suma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }

        int iterative = iterativeSum(arr);
        int recursive = recursiveSum(arr, 0, 0);

        System.out.println("Iterative: " + iterative);
        System.out.println("Recursive: " + recursive);
    }

    public static int iterativeSum(int[] arr){
        int acc = 0;

        for (int i = 0; i < arr.length; i++) {
            acc += arr[i];
        }

        return acc;
    }

    public static int recursiveSum(int[] arr, int index, int acc){
        if(index == arr.length){
            return acc;
        }
        else{
            return recursiveSum(arr, index + 1, acc + arr[index]);
        }
    }
}
