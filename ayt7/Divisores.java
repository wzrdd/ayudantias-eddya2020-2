import java.util.*;

class Divisores {
	// O(sqrt(n))
	public static int contarDivisores(int num) {
		int contador = 0;

		for (int i = 1; i < Math.sqrt(num); i++) {
			if (num % i == 0)
				contador += 2;
		}

		if (Math.pow(Math.floor(Math.sqrt(num)), 2) == num) {
			contador++;
		}

		return contador;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[][] = new int[n][2];

		for (int i = 0; i < n; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = contarDivisores(arr[i][0]);
		}

		Arrays.sort(arr, (a, b) -> b[1] - a[1]);

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i][0] + " ");
		}
	}
}
