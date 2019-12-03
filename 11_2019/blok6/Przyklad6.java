package blok6;

public class Przyklad6 {

	public static void main(String[] args) {
		Maluch_2 m = new Maluch_2();
		m.zwiekszPredkosc(3);
		m.zmniejszPredkosc(1);
		m.uzyjKlaksonu();
	}

}

interface Pojazd_2 {
	public void zwiekszPredkosc(int oIle);
	public void zmniejszPredkosc(int oIle);
}

class Maluch_2 implements Pojazd_2 {
	
	public void zwiekszPredkosc(int oIle) {
		System.out.println("zwiekszylem o : " + oIle);
		}

	public void zmniejszPredkosc(int oIle) {
		System.out.println("zmniejszylem o : " + oIle);
		}
	
	public void uzyjKlaksonu() {
		System.out.println("honk honk");
		}
}