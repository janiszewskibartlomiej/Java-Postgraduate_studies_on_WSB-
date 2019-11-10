package blok5;

public class zadanie9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int liczba = 1;
		dzienTygodnia(liczba);
	}
	public static void dzienTygodnia(int liczba) {
		switch (liczba) { 
		case 1 : System.out.println("Poniedziałek"); 
		break;
		case 2 : System.out.println("Wtorek"); 
		break; 
		case 3 : System.out.println("Środa"); 
		break; 
		case 4 : System.out.println("Czwartek"); 
		break; 
		case 5 : System.out.println("Piątek"); 
		break; 
		case 6 : System.out.println("Sobota"); 
		break; 
		case 7 : System.out.println("Niedziela"); 
		break; 
		default: System.out.println("Błąd"); 
		}
	}
}
