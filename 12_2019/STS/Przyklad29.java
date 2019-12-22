package blok8;

import java.util.HashSet;
import java.util.Set;

public class Przyklad29 {

	public static void main(String[] args) {
		 Set<String> s1 = new HashSet<>();
		 s1.add("a");
		 System.out.println(s1);
		 s1.add("a");
		 s1.add("a");
		 System.out.println(s1);
	}

}
