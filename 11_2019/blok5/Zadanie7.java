package blok5;

public class Zadanie7 {

	public static void main(String[] args) {
		String metoda = "GET";
		System.out.println(sprawdzMetode(metoda));
	}

	public static String sprawdzMetode(String metoda) {
		if (metoda == "GET" || metoda == "PUT" || metoda == "DELETE") {
		return "Metoda niedozwolona.";
		}
		return "OK";
		}
}
