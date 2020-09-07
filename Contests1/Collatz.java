import java.util.Scanner;

public class Collatz {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    long n = sc.nextLong();

    System.out.print(n + " ");
    while(n != 1){
      n = (n % 2 == 1) ? 3*n + 1 : n/2;

      System.out.print(n + " ");
    }
  }
}
