import java.util.*;

public class Stats {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		// <Deporte, frecuencia>
		HashMap<String, Integer> mp = new HashMap<>();
		mp.put("football", 0);

		for(int i=0; i < n; i++){
			sc.next();

			String deporte = sc.next();

			if(mp.containsKey(deporte)){
				mp.put(deporte, mp.get(deporte) + 1);
			} else{
				mp.put(deporte, 1);
			}
		}

		int mayor = Integer.MIN_VALUE;
		String mayor_deporte = "";

		for(String str : mp.keySet()){
			if(mp.get(str) > mayor){
				mayor = mp.get(str);
				mayor_deporte = str;
			}
		}

		System.out.println(mayor_deporte);
		System.out.println(mp.get("football"));
	}
}
