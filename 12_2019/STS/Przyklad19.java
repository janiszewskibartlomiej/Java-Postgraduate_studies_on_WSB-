package blok8;

import java.util.ArrayList;
import java.util.List;

public class Przyklad19 {

	public static void main(String[] args) {
		String[] tablica = new String[3];
		tablica[0] = "a";
		tablica[1] = "b";
		tablica[2] = "c";
		 
		List<String> al = new ArrayList<String>();
		 al.add("a");
		 al.add("b");
		 al.add("c");
		
		 Object[] tablica1 = new String[al.size()];
		 tablica1 = al.toArray();
		
		 for(Object s : tablica1)
		 System.out.println(s);
	}

}
