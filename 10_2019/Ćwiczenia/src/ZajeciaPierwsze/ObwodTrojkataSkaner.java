package ZajeciaPierwsze;

import java.util.Scanner;
public class ObwodTrojkataSkaner {
	
	public static int getInt() {
		return new Scanner(System.in).nextInt();
}

	public static void main(String[] args) {
	int x,y,z;
	
	int obwodTrojkata;
	
	System.out.println("Podaj pierwszy bok tr�jkata");
	x= getInt();
	System.out.println("Podaj drugi bok tr�jkata");
	y= getInt();
	System.out.println("Podaj trzeci bok tr�jkata");
	z= getInt();
	obwodTrojkata = x + y + z;
	System.out.println("Obw�d tr�jkata o tych bokach wynosi " + obwodTrojkata);
	}
	
}
