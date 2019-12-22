package blok8;

import java.util.ArrayList;

public class Przyklad5 {

	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("a");
		al1.add("d");
		System.out.println(al1);
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("b");
		al2.add("c");
		al1.addAll(1, al2); // al1.addAll(0, al2);
		System.out.println(al1);
//		al2.set(0, "x");
//		System.out.println(al1);
//		System.out.println(al2);

	}

}
