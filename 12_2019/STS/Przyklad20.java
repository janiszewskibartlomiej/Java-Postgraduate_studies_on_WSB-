package blok8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Przyklad20 {

	public static void main(String[] args) {
		 List<String> al = new ArrayList<String>();
		 al.add("a");
		 al.add("z");
		 al.add("c");
		
		 System.out.println(al);
		 Collections.sort(al);
		 System.out.println(al);
		
		 List<Integer> al2 = new ArrayList<>();
		 al2.add(3);
		 al2.add(2);
		 al2.add(1);
		
		 System.out.println(al2);
		 Collections.sort(al2);
		 System.out.println(al2);
	}

}
