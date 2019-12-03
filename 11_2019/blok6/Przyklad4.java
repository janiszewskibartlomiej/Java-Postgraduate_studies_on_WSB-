package blok6;

public class Przyklad4 {

	public static void main(String[] args) {
		Kot k = new Kot();
		k.dajGlos();
		k.spij();
		
		Pies pies = new Pies();
		pies.dajGlos();
		pies.spij();
		
		Ptaszek p = new Ptaszek();
		p.dajGlos();
		p.spij();
		

	}
}

class Zwierz {
	public void dajGlos() {
		System.out.println("bla bla");
	}
	public void spij() {
		System.out.println("Spi...");
		}
}

class Pies extends Zwierz {
	public void dajGlos() {
		System.out.println("Hau hau");
		}
}

class Kot extends Zwierz {
	public void dajGlos() {
		System.out.println("Miau");
		}
}

class Ptaszek extends Zwierz {
}



