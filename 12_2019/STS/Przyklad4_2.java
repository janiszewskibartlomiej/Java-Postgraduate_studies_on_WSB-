package blok8;

import java.util.ArrayList;

public class Przyklad4_2 {

	public static void main(String[] args) {
		ArrayList<Zwierze> al = new ArrayList<>();
		Zwierze z1 = new Zwierze();
		al.add(z1);
		System.out.println(al);
		ArrayList<Pies> alPies = new ArrayList<Pies>();
		Pies p1 = new Pies();
		alPies.add(p1);
		al.addAll(alPies);
		System.out.println(al);
	}
}

class Zwierze {
	int wiek;
	}

class Pies extends Zwierze {
}