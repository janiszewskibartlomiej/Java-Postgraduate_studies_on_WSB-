package blok6;

public class Przyklad5 {

	public static void main(String[] args) {
		Maluch m = new Maluch();
		m.zwiekszPredkosc(3);
		m.zmniejszPredkosc(1);
	}
}

interface Pojazd_1 {
	public void zwiekszPredkosc(int oIle);
	public void zmniejszPredkosc(int oIle);
}

class Maluch implements Pojazd_1 {
	
	public void zwiekszPredkosc(int oIle) {
		System.out.println("zwiekszylem o : " + oIle);
}

	public void zmniejszPredkosc(int oIle) {
	System.out.println("zmniejszylem o : " + oIle);
	}
}