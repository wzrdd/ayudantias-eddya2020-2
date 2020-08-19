import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int fib_recursivo = fibRecursivo(n);
        int fib_iterativo = fibIterativo(n);

        System.out.println("Recursivo: " + fib_recursivo);
        System.out.println("Iterativo: " + fib_iterativo);
    }

    public static int fibRecursivo(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;

        return fibRecursivo(n - 1) + fibRecursivo(n - 2);
    }

    public static int fibIterativo(int n){
        if(n == 0) return 0;

        int current = 1;
        int prev = 0;

        for(int i = 1; i < n; i++){
            int temp = current;
            current += prev;
            prev = temp;
        }

        return current;
    }
}
