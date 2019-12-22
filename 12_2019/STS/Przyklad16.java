package blok8;

import java.util.ArrayList;

public class Przyklad16 {

	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("a");
		al1.add("b");
		al1.add("c");
		al1.add("d");
		System.out.println(al1.set(0, "z")); // zwraca wartoœæ sprzed zmiany
		System.out.println(al1);
	}

}
