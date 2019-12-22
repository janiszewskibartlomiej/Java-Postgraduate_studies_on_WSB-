package blok8;

import java.util.HashMap;
import java.util.Map;

public class Przyklad36 {

	public static void main(String[] args) {
		Map<Integer, String> hm = new HashMap<>();
		hm.put(1, "a");
		hm.put(1, "a");
		hm.put(2, "b");
		// System.out.println(hm);
		System.out.println(hm.containsKey(1));
		System.out.println(hm.containsKey(9));
	}

}
