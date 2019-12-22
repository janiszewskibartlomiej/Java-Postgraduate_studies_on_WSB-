package blok8;

import java.util.ArrayList;

public class Przyklad4 {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<>();
		lista.add("a");
		lista.add("b");
		lista.add("c");
		ArrayList<String> lista2 = new ArrayList<>();
		lista2.add("d");
		lista2.add("e");
		lista2.add("f");
		lista.addAll(lista2);
		System.out.println(lista);
		// [a, b, c, d, e, f]

	}

}
