package blok8;

import java.util.ArrayList;

public class Przyklad15 {

	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("a");
		al1.add("b");
		al1.add("c");
		al1.add("d");
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("d");
		System.out.println(al1.removeAll(al2));
		System.out.println(al1);
	}

}
