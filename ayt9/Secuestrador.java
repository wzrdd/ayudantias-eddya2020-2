import java.util.*;

public class Secuestrador {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		// <String, Frecuencia>
		HashMap<String, Integer> mp = new HashMap<>();

		for(int i=0; i < n; i++){
			String str = sc.next();
			if(mp.containsKey(str)){
				mp.put(str, mp.get(str) + 1);
			}else{
				mp.put(str, 1);
			}
		}

		boolean answer = true;
		for(int i=0; i < m; i++){
			String str = sc.next();
			if(mp.containsKey(str)){
				if(mp.get(str) == 1){
					mp.remove(str);
				} else {
					mp.put(str, mp.get(str) - 1);
				}
			} else {
				answer = false;
				break;
			}
		}

		System.out.println(((answer) ? "Si" : "No"));
	}
}
