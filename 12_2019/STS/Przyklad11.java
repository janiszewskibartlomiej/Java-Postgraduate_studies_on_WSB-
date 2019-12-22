package blok8;

import java.util.ArrayList;
import java.util.Iterator;

public class Przyklad11 {

	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<String>();
		 al1.add("a");
		 al1.add("b");
		 al1.add("c");
		 al1.add("d");
		Iterator<String> it = al1.iterator();
		 System.out.println(it.hasNext()); // ustawiam siê przed pierwszym elementem i sprawdzam czy element pierwszy istnieje
		 System.out.println(it.next()); // zwróæ element
		 System.out.println(it.hasNext());
		 System.out.println(it.next());
		 System.out.println(it.hasNext());
		 System.out.println(it.next());
		 System.out.println(it.hasNext());
		 System.out.println(it.next());
		 System.out.println(it.hasNext());
		 System.out.println(it.next());
	}

}
