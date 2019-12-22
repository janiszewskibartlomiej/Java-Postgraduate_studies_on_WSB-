package blok8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Przyklad32 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("a");
		al.add("b");
		// al.add("z");
		Set<String> s1 = new HashSet<>();
		s1.add("a");
		s1.add("b");
		s1.add("c");
		System.out.println(s1.containsAll(al));
	}

}
