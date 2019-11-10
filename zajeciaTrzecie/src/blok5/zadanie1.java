package blok5;

public class zadanie1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double liczbaPunktow = 99.0;
		wydrukujOcene(liczbaPunktow);
	
	}
	public static void wydrukujOcene(Double liczbaPunktow) {
		if (liczbaPunktow < 50) {
			System.out.println("Ocena: 2.0");
	} else if (liczbaPunktow > 50 && liczbaPunktow < 60) {
		System.out.println("Ocena: 3.0");
	} else if (liczbaPunktow > 60 && liczbaPunktow < 70) {
		System.out.println("Ocena: 3.5");
	} else if (liczbaPunktow > 70 && liczbaPunktow < 80) {
		System.out.println("Ocena: 4.0");
	} else if (liczbaPunktow > 80 && liczbaPunktow < 90) {
		System.out.println("Ocena: 4.5");
	} else if (liczbaPunktow >= 90) {
		System.out.println("Ocena: 5.0");
	} else {
		System.out.println("Błąd coś poszło nie tak");
	}
	}
}
