package zajeciaDrugie;

import com.sun.net.httpserver.Authenticator.Result;

public class Kalkulator {
	
		static String model = "ZX11";
		String kolor;
		
		double dodaj(double liczba1, double liczba2) {
			return liczba1 + liczba2;
		}
		
		double odejmij(double liczba1, double liczba2) {
			return liczba1 - liczba2;
		}

		double podziel(double liczba1, double liczba2) {
			return liczba1 / liczba2;
		}
}

	


