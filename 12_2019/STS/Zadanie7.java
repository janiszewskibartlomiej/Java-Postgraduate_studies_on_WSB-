package blok8;

import java.util.ArrayList;

public class Zadanie7 {

	public static void main(String[] args) {
		ArrayList<Double> skladki = new ArrayList<Double>();
		skladki.add(3.14);
		skladki.add(1.414);
		skladki.add(2.718);
		ArrayList<Double> skladki2 = new ArrayList<Double>();
		skladki2.add(1.73);
		skladki2.add(2.23);
		
		//a)
		 skladki.addAll(skladki2);
		 System.out.println(skladki);
		// b)
		 skladki.addAll(0, skladki2);
		 System.out.println(skladki);
	}

}
