package blok8;

import java.util.ArrayList;

public class Przyklad18 {

	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("a");
		al1.add("b");
		al1.add("c");
		al1.add("d");
		System.out.println(al1.subList(1, 3)); // 1,2 - zawarte w podliœcie, 3 – nie zawarty
	}

}
