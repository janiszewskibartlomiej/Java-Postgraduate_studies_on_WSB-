package ZajeciaPierwsze;

import java.util.Scanner;
public class SlowaWOdwrotenjKolejnosci {

	public static String getString() {
			return new Scanner(System.in).next();
	}

		public static void main(String[] args) {
		String x,y,z;
		
		
		System.out.println("Podaj pierwszy parametr");
		x= getString();
		System.out.println("Podaj drugi parametr");
		y= getString();
		System.out.println("Podaj trzeci parametr");
		z= getString();
		
		System.out.println(z + "\n" + y + "\n" +x);
		}
		
	}


