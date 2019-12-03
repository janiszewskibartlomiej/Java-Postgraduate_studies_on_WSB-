package blok6;

public class Zadanie3 {

	public static void main(String[] args) {
		Kapiel k = new Kapiel();
		k.ileMamPlynu();
		k.dolejPlyn(60);
		k.ileMamPlynu();
		k.dolejPlyn(140);
		k.ileMamPlynu();
		k.ileMamSzamponu();
		k.dolejSzamponu(20);
		k.ileMamSzamponu();
		k.dolejSzamponu(30);
		k.ileMamSzamponu();
	}

}

class Kapiel {
	PlynDoKapieli pkp;
	Szampon sz;
	Kapiel() {
		pkp = new PlynDoKapieli();
		sz = new Szampon();
		}
	
	public void dolejPlyn(int ile) {
		System.out.println("Dolano p³ynu do kapieli: " + pkp.wylejIlosc(ile));
		}

	public void ileMamPlynu() {
		System.out.println("Stan plynu do kapieli: " + pkp.sprawdzIloscPlynu());
		}

	public void dolejSzamponu(int ile) {
		System.out.println("Dolano szamponu: " + sz.wylej(ile));
		}	

	public void ileMamSzamponu() {
		System.out.println("Stan szamponu: " + sz.sprawdzIloscSzamponu());
		}
}


class PlynDoKapieli {
	private int ilosc;
	PlynDoKapieli() {
	this.ilosc = 100;
	}
	public int wylejIlosc(int ilosc) {
		if (this.ilosc == 0) { // nie mam z czego wylac
			return 0;
		}
		int ileDoWydania = 0;
		if (ilosc >= this.ilosc) {
			ileDoWydania = this.ilosc;
			this.ilosc = 0;
		} else if (ilosc < this.ilosc) {
			ileDoWydania = ilosc;
			this.ilosc -= ilosc;
		}
		return ileDoWydania;
	}
	public int sprawdzIloscPlynu() {
		return ilosc;
	}
}

class Szampon {
	private int ilosc;
	Szampon() {
		this.ilosc = 100;
		}
	public int wylej(int ilosc) {
		if (this.ilosc == 0) {
			return 0;
		}
		int ileDoWylania = 0;
		if (ilosc > this.ilosc) {
			ileDoWylania = this.ilosc;
		} else if (ilosc <= this.ilosc) {
			ileDoWylania = ilosc;
			this.ilosc -= ilosc;
		}
		return ileDoWylania;
		}
	public int sprawdzIloscSzamponu() {
			return ilosc;
		}
}
		