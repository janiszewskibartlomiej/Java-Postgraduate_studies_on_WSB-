package blok8;

import java.util.HashMap;
import java.util.Map;

public class Przyklad35 {

	public static void main(String[] args) {
		Map<Integer, String> hm = new HashMap<>();
		hm.put(1, "a");
		hm.put(1, "c");
		hm.put(2, "c");
		System.out.println(hm);
	}

}
