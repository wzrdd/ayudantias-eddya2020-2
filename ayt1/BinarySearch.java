import java.util.Scanner;
/*
	Enunciado: Dado un arreglo de números, implementar una función que devuelva
	el índice en el que se encuentra cierto elemento usando búsqueda binaria.

	Ej: Con el conjunto {1, 3, 4, 5, 7, 10, 13}
	Si se le entrega el número 3, devuelve 1.
	Si se le entrega el númreo 7, devuelve 4.
*/

public class BinarySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// search O(lg(n))
		// insert O(lg(n))
		int[] arr = {1, 3, 4, 5, 7, 10, 13};

		Arrays.sort(arr, (a, b) -> b - a);
		HashMap<Key, Value>;
		HashSet<Value>;

		//int wanted = sc.nextInt();

		int iterative = iterativeBinarySearch(arr, 7);
		int recursive = recursiveBinarySearch(arr, 7, 0, arr.length);

		System.out.println("Iterative: " + iterative);
		System.out.println("Recursive: " + recursive);
	}

	public static int iterativeBinarySearch(int[] arr, int wanted){
		int index = -1;
		int low = 0;
		int high = arr.length;

		while(low <= high){
			int mid = (low + high) / 2;

			if(arr[mid] < wanted){
				low = mid + 1;
			} else if(arr[mid] > wanted){
				high = mid - 1;
			} else{
				index = mid;
				break;
			}
		}

		return index;
	}

	public static int recursiveBinarySearch(int[] arr, int wanted, int low, int high){
		if(high < low){
			return -1;
		}

		int mid = (low + high) / 2;

	if(arr[mid] == wanted) return mid;

		if(arr[mid] > wanted){
			return recursiveBinarySearch(arr, wanted, low, mid - 1);
		} else if(arr[mid] < wanted){
			return recursiveBinarySearch(arr, wanted, mid + 1, high);
		}
	}
}
