package blok8;

import java.util.ArrayList;

public class Zadanie8 {

	public static void main(String[] args) {
		ArrayList<Ptak> ptaki = new ArrayList<>();
		Kura kura1 = new Kura();
		Kaczka kaczka1 = new Kaczka();
		ptaki.add(kura1);
		System.out.println(ptaki);
	}
}

class Ptak {	
	
}
		
class Kura extends Ptak {
		}

		
class Kaczka extends Ptak {
		}
