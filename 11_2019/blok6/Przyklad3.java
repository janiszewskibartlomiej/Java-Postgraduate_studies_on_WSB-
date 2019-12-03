package blok6;

public class Przyklad3 {

	public static void main(String[] args) {
		SamochodA sam = new SamochodA();
		System.out.println(sam.toString());
		sam.uruchom();
		System.out.println(sam.toString());
		sam.zgas();
		System.out.println(sam.toString());
	}

}

class Silnik {
	boolean uruchomiony;
}

class SamochodA { // klasa
	private Silnik s = new Silnik(); // obiekt
	
	public void uruchom() {
		s.uruchomiony = true;
		}
	
	public void zgas() {
		s.uruchomiony = false;
		}
	public String toString() {
		return String.valueOf(s.uruchomiony);
		}
}