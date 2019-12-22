package blok8;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Przyklad40 {

	public static void main(String[] args) {
		Map<Integer, String> hm = new HashMap<>();
		hm.put(1, "a");
		hm.put(1, "a");
		hm.put(2, "b");
		Collection<String> c = hm.values();
		System.out.println(c);
		Set<String> s1 = new HashSet<>();
		s1.addAll(c);
		System.out.println(s1);
	}

}
