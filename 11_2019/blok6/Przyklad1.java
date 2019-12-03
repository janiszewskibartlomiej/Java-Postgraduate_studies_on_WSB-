package blok6;

public class Przyklad1 {

	public static void main(String[] args) {
//		 Zima z = new Zima();
		 Zima z = new Zima("Idzie wiosna!");

	}

}

class Zima {
	public Zima() {
		System.out.println("Witaj Zimo!");
	}
	Zima(String komunikat){
		System.out.println(komunikat);
	}
}