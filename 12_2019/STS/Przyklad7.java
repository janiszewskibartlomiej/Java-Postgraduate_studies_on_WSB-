package blok8;

import java.util.ArrayList;

public class Przyklad7 {

	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("a");
		al1.add("b");
		System.out.println(al1);
		System.out.println(al1.contains("a"));
		System.out.println(al1.contains("x"));
	}

}
