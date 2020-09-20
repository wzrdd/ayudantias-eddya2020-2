import java.util.*;

public class Faltante {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int suma_input = 0;

        for(int i = 0; i < n - 1; i++){
            suma_input += sc.nextInt();
        }

        System.out.println((n * n + n)/2 - suma_input);
    }
}
