package blok6;

public class Zadanie2 {

	public static void main(String[] args) {
		Szkolenie sz = new Szkolenie(20);
		System.out.println(sz.liczbaUczestnikow);
	}

}

class Szkolenie {
	int liczbaUczestnikow;
	Szkolenie(int x) {
		this.liczbaUczestnikow = x;
		}
}