package blok8;

import java.util.HashSet;
import java.util.Set;

public class Przyklad34 {

	public static void main(String[] args) {
		Set<String> s0 = new HashSet<>();
		s0.add("a");
		s0.add("b");
		
		Set<String> s1 = new HashSet<>();
		s1.add("a");
		s1.add("b");
		s1.add("c");
		
		s1.removeAll(s0);
		System.out.println(s1);
	}

}
