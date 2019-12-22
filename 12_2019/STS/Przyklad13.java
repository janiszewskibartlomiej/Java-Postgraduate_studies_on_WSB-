package blok8;

import java.util.ArrayList;

public class Przyklad13 {

	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("a");
		al1.add("b");
		al1.add("c");
		al1.add("d");
		al1.add("a");
		System.out.println(al1);
		System.out.println(al1.remove(4));
		System.out.println(al1);
	}

}
