package blok8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Przyklad30 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("a");
		al.add("a");
		al.add("a");
		System.out.println(al);
		Set<String> s1 = new HashSet<>();
		s1.addAll(al);
		System.out.println(s1);
	}

}
