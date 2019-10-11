package ZajeciaPierwsze;

import java.util.Scanner;
public class ObwodTrojkataSkaner {
	
	public static int getInt() {
		return new Scanner(System.in).nextInt();
}

	public static void main(String[] args) {
	int x,y,z;
	
	int obwodTrojkata;
	
	System.out.println("Podaj pierwszy bok trójkata");
	x= getInt();
	System.out.println("Podaj drugi bok trójkata");
	y= getInt();
	System.out.println("Podaj trzeci bok trójkata");
	z= getInt();
	obwodTrojkata = x + y + z;
	System.out.println("Obwód trójkata o tych bokach wynosi " + obwodTrojkata);
	}
	
}
