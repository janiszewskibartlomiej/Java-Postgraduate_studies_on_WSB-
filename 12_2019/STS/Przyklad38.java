package blok8;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Przyklad38 {

	public static void main(String[] args) {
		Map<Integer, String> hm = new HashMap<>();
		hm.put(1, "a");
		hm.put(1, "a");
		hm.put(2, "b");
		// System.out.println(hm);
		System.out.println(hm.get(1));
		System.out.println(hm.get(9));
		
		Set<Integer> si = hm.keySet();
		System.out.println(si);
	}

}
