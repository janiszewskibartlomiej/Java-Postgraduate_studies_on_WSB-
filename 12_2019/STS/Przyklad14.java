package blok8;

import java.util.ArrayList;

public class Przyklad14 {

	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("a");
		al1.add("b");
		al1.add("c");
		al1.add("d");
		al1.add("a");
		System.out.println(al1);
		System.out.println(al1.remove("a"));
		System.out.println(al1);
		
		
		ArrayList<Integer> al2 = new ArrayList<>();
		al2.add(1);		
		al2.add(0);
		System.out.println(al2);
		System.out.println(al2.remove(0));
		System.out.println(al2);
	}

}
