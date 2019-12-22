package blok8;

import java.util.ArrayList;
import java.util.Iterator;

public class Przyklad11_2 {

	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("a");
		al1.add("b");
		al1.add("c");
		al1.add("d");
		Iterator<String> it = al1.iterator();
		while (it.hasNext()) {
		//String tmp = it.next();
		//System.out.println(tmp);
		System.out.println(it.next());
		
		}
	}

}
