package blok5;

public class Zadanie2 {

	public static void main(String[] args) {
		int odLiczbyWlacznie = 1;
		int doLiczbyWlacznie = 10;
		int suma = podajSumeLiczbWZakresieOdDo(odLiczbyWlacznie, doLiczbyWlacznie);
		System.out.println("suma: " + suma);
//		System.out.println("suma: " + suma(odLiczbyWlacznie, doLiczbyWlacznie));

	}
	
	public static int podajSumeLiczbWZakresieOdDo(int odLiczbyWlacznie, int doLiczbyWlacznie) {
		int wynik = 0;
		while (odLiczbyWlacznie <= doLiczbyWlacznie) {
		wynik+=odLiczbyWlacznie;
		odLiczbyWlacznie++;
		}
		return wynik;
		}
//		
//	public static int suma(int x, int y) {
//		return podajSumeLiczbWZakresieOdDo(x, y);
//		}

}
