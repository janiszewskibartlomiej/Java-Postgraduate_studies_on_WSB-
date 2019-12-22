package blok8;

import java.util.ArrayList;

public class Przyklad3 {

	public static void main(String[] args) {
		
		ArrayList<String> lista = new ArrayList<>();
		 lista.add(0, "a");
		 System.out.println(lista);
		 lista.add(1, "b");
		 System.out.println(lista);

		 ArrayList<String> lista1 = new ArrayList<>();
		 lista1.add("a");
		 lista1.add("c");
		 System.out.println(lista1);
		 lista1.add(1, "b");
		 System.out.println(lista1);	
		 lista1.add(1, "b");
		 System.out.println(lista1);
	}

}
