package blok5;

public class Przyklad_ifElse {

	public static void main(String[] args) {
		String stan_skupienia_wody = "gazowy"; // staly , ciekly , gazowy
		
		if (stan_skupienia_wody == "staly") {
			System.out.println("staly");
		} else if (stan_skupienia_wody == "ciekly") {
			System.out.println("ciekly");
		} else if (stan_skupienia_wody == "gazowy") {
			System.out.println("gazowy");
		} else {
			System.out.println("BLAD. Cos poszlo nie tak. Sprobuj jeszcze raz.");
		}

	}

}
