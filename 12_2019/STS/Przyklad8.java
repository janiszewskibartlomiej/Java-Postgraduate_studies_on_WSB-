package blok8;

import java.util.ArrayList;

public class Przyklad8 {

	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("a");
		al1.add("b");
		System.out.println(al1);
		String z = al1.get(0);
		System.out.println(z);
		System.out.println(al1.get(1));
	}

}