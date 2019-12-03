package blok6;

public class Zadanie4 {

	public static void main(String[] args) {
		Samochod sam = new Samochod();
		Motorowka motorowka = new Motorowka();
		Motor motor = new Motor();
		System.out.println(sam.sprawdzKolor()); // czerwony
		System.out.println(motorowka.sprawdzKolor()); // czerwony
		System.out.println(motor.sprawdzKolor()); // czerwony
		sam.sprawdzIloscKol(); // 4
		motorowka.sprawdzIloscKol(); // 0
		motor.sprawdzIloscKol(); // 2
	}

}

class Pojazd {
	public void sprawdzIloscKol() {
		}
	public String sprawdzKolor() {
	return "czerwony";
	}
}

class Samochod extends Pojazd {
	public void sprawdzIloscKol() {
		System.out.println(4);
	}
}

class Motorowka extends Pojazd {
	public void sprawdzIloscKol() {
		System.out.println(0);
		}
}

class Motor extends Pojazd {
	public void sprawdzIloscKol() {
		System.out.println(2);
	}
}