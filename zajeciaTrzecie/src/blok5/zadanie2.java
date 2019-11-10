package blok5;

public class zadanie2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int liczbaPierwsza = 1;
		int liczbaDruga = 3;
		int suma = sumaLiczb(liczbaPierwsza, liczbaDruga); //musi byc wywoalnie metody ponizszej
		System.out.println("Wynik = " + suma);
		}
		
		private static int sumaLiczb(int liczbaPierwsza, int liczbaDruga) {
			// TODO Auto-generated method stub
			int wynik = 0;
			while (liczbaPierwsza <= liczbaDruga) {
				wynik += liczbaPierwsza;
				liczbaPierwsza++;
				
				}
			
			return wynik;
		}
			

}
