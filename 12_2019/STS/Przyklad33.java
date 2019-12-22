package blok8;

import java.util.HashSet;
import java.util.Set;

public class Przyklad33 {

	public static void main(String[] args) {
		Set<String> s1 = new HashSet<>();
		s1.add("a");
		s1.add("b");
		s1.add("c");
		System.out.println(s1);
		s1.remove("c");
		System.out.println(s1);
	}

}
