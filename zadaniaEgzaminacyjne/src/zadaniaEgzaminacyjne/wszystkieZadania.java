package zadaniaEgzaminacyjne;

import java.util.ArrayList;

public class wszystkieZadania {

	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//zadanie 1
		
		int x = 4;
		String y = "5";
		System.out.println("zadanie nr 1\n" + " wynik: " + x+y+"\n");

		
		// zadanie 2

		int xx = 7, yy = 9, zz = 11;
		zz = xx = yy;
		System.out.println("zadanie nr 2 \n z: " + zz + "\n");
		
		
		// zadanie 3
		
		String s1 = "abc";
		String s2 = "def";
		s1 = s2;
		System.out.println("zadanie nr 3 \n s1: " + s1 + "\n");
		
		
		// zadanie 4
		
		int xxx = 1999;
		System.out.println("zadanie nr 4 \n " + xxx%2 + "\n");
		
		
		// zadanie 5
		
		Double x5 = 2.0;
		System.out.println("zadanie nr 5 \n " + (x5*2*2 == Math.pow(x5, 3)) + "\n");
		
		
		// zadanie 6
		
		int x6 = 5;
		x6 = -3;
		x6 += -3;
		System.out.println("zadanie nr 6 \n " + x6 + "\n");

		
		// zadanie 7
		
		int i = 10;
		System.out.println("zadanie nr 7 \n " + (i += --i) + "\n");
	
		// zadanie 8
		
		int i8 = 10;
		System.out.println("zadanie nr 8 \n " + (--i8 + -i8) + "\n");
		
		// zadanie 9
		
		int i9 = 10;
		System.out.println("zadanie nr 9 \n " + (i9 += (--i9 + -i9)) + "\n");
		
		// zadanie 10
		
		System.out.println("zadanie nr 10 \n " + (2==2 && 3==3 && 4==4) + "\n");
		
		
		// zadanie 11
		
		int i11 = 1;
		
		while (i11<3) {
			i11++;
		}
		System.out.println("zadanie nr 11 \n" + i11 + "\n");
		
		
		// zadanie  12
		int j = 0;
		for (int i12 = 4; i12 > 2; i12--) {
			j = i12;
		}
		System.out.println("zadanie nr 12 \n " + (j) + "\n");
		
		
		// zadanie 13
		
		ArrayList<String> lista = new ArrayList<>();
		lista.add(0, "a");
		lista.add(0, "b");
		lista.add(0, "a");
		System.out.println("zadanie nr 13 \n" + lista + "\n");
		
	
		// zadanie 14
		
		ArrayList<String> a14 = new ArrayList<String>();
		a14.add("a");
		a14.add("b");
		System.out.println("zadanie nr 14 \n" + a14.get(0) + "\n");

		
		// zadnaie 15
		
		ArrayList<String> a15 = new ArrayList<String>();
		a15.add("a");
		a15.add("a");
		a15.add("b");
		a15.add("c");
		a15.add("c");
		
		System.out.println("zadanie nr 15 \n" + a15.size() + " "+a15+ "\n");
		
			// moje zadanie 
		System.out.println("zadanie moje na ++i --");
		int moje = 10;
		System.out.println("- moje: " + -moje + "\n");
		System.out.println("-- moje: " + --moje + "\n");
		moje = 10;
		System.out.println("+moje: " + (+moje) + "\n");
		System.out.println("++moje: " + (++moje) + "\n");
		moje = 10;
		System.out.println("moje++: " + (moje++) + "\n");
		System.out.println("moje++: " + (moje++) + "\n");
		moje = 10;
		System.out.println("moje--: " + (moje--) + "\n");
		
	}


	

	
}
