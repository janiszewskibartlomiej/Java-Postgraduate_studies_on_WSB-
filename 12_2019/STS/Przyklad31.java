package blok8;

import java.util.HashSet;
import java.util.Set;

public class Przyklad31 {

	public static void main(String[] args) {
		Set<String> s1 = new HashSet<>();
		System.out.println(s1.contains("a"));
		s1.add("a");
		System.out.println(s1.contains("a"));
	}

}
