import java.util.*;

//  Time Complexity: O(n log n)
// Space Complexity: O(n)

public class Inversion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] array = new int[n];

		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}

		MergeSort ms = new MergeSort();
		System.out.println(ms.mergeSort(array));

		sc.close();
	}

	private static class MergeSort {
		private long swaps = 0;

		public long mergeSort(int[] array) {
			int[] aux = new int[array.length];
			mergeSort(array, aux, 0, array.length - 1);
			return swaps;
		}

		private void mergeSort(int[] array, int[] aux, int start, int end) {
			if (start < end) {
				int mid = (start + end) / 2;
				mergeSort(array, aux, start, mid);
				mergeSort(array, aux, mid + 1, end);
				merge(array, aux, start, mid, end);
			}
		}

		private void merge(int[] array, int[] aux, int start, int mid, int end) {
			for (int i = start; i <= end; i++) {
				aux[i] = array[i];
			}

			int curr = start;
			int left = start;
			int right = mid + 1;

			while (left <= mid && right <= end) {
				if (aux[left] <= aux[right]) {
					array[curr++] = aux[left++];
				} else {
					// La parte importante.
					swaps += mid + 1 - left;
					array[curr++] = aux[right++];
				}
			}

			while (left <= mid) {
				array[curr++] = aux[left++];
			}
		}
	}
}
