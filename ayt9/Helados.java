import java.util.*;

public class Helados {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			HashMap<Integer, Integer> map = new HashMap<>();
			int[] arr = new int[y];

			for (int j = 0; j < y; j++) {
				int aux = sc.nextInt();
				map.put(aux, j);
				arr[j] = aux;
			}

			for(int j = 0; j < y; j++){
				int complemento = x - arr[j];
				if(map.containsKey(complemento) && map.get(complemento) != j){
					System.out.println(j + " " map.get(complemento));
					j == y;
					break;
				}
			}

		}
	}
}
