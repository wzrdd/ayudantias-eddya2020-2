import java.util.*;

public class Entropia {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n];

		for(int i=0; i < n; i++){
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);

		int min_gap = Integer.MAX_VALUE;

		for(int i=0; i < n - 1; i++){
			if(Math.abs(arr[i] - arr[i + 1]) < min_gap)
				min_gap = Math.abs(arr[i] - arr[i + 1]);
		}

		Queue<Integer> q = new ArrayList<>();
		for(int i = 0; i < n - 1; i++){
			if(Math.abs(arr[i] - arr[i+1]) == min_gap){
				q.add(arr[i]);
				q.add(arr[i+1]);
			}
		}

		while(!q.isEmpty()){
			System.out.print(q.poll() + " ");
		}
	}
}
