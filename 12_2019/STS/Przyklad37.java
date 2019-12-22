package blok8;

import java.util.HashMap;
import java.util.Map;

public class Przyklad37 {

	public static void main(String[] args) {
		Map<Integer, String> hm = new HashMap<>();
		hm.put(1, "a");
		hm.put(1, "a");
		hm.put(2, "b");
		// System.out.println(hm);
		System.out.println(hm.containsValue("a"));
		System.out.println(hm.containsValue("z"));
	}

}
