package blok6;

public class Przyklad2 {

	public static void main(String[] args) {
		Czlowiek cz = new Czlowiek (5);
		
		System.out.println(cz.wiek);
	}

}

class Czlowiek {
	int wiek;
	public Czlowiek(int wiek) {
		this.wiek = wiek;
	}
}