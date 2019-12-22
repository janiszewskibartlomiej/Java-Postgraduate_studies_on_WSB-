package blok8;

import java.util.ArrayList;

public class Zadanie5 {

	public static void main(String[] args) {
		ArrayList<Lato> al = new ArrayList<Lato>();
		al.add(new Lato());
		System.out.println(al.get(0).a.length);

	}

}

class Lato {
String[] a = {"a","b"};
}
