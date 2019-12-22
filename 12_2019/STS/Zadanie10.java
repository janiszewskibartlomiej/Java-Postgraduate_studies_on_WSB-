package blok8;

import java.util.ArrayList;

public class Zadanie10 {

	public static void main(String[] args) {
		ArrayList<Double> arr = new ArrayList<>();
		arr.add(1.0);
		arr.add(2.0);
		arr.add(3.0);
		
		for (int i = 0; i < arr.size(); i++) {
		arr.set(i, Math.pow(arr.get(i), 2.0));
		}
		System.out.println(arr);
	}

}
