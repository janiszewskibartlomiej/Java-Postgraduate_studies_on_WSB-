package zajeciaCzwarte;

import java.util.ArrayList;
import java.util.Iterator;

public class zadania_podczas_zajec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//zadanie1
		
		ArrayList<String> cars = new ArrayList<>();
			cars.add("Volvo");
			System.out.println("");
			System.out.println("Zadanie 1");
			System.out.println(cars);
			String x = "BMW";
			cars.add(x);
			System.out.println(cars);
			System.out.println(cars.add("Ford")); //true
			System.out.println(cars);
			
			
		//zadanei2
			
			cars.add(2, "Audi");
			System.out.println("");
			System.out.println("Zadanie 2");
			System.out.println(cars);
			
		//zadanie 3
		
		ArrayList<String> cars2 = new ArrayList<String>();
		cars2.add("fiat");
		cars2.add("Seat");
		cars2.add("Kia");
		System.out.println("");
		System.out.println("Zadanie 3");
		System.out.println(cars2);
		cars.addAll(cars2);
		System.out.println(cars);
		
		//zadanie 4
		
		ArrayList<String> cars3 = new ArrayList<String>();
		cars3.add("Honda");
		cars3.add("Peugeot");
		System.out.println("");
		System.out.println("Zadanie 4");
		System.out.println(cars3);
		cars.addAll(3, cars3);
		System.out.println(cars);
		
		//zadanie 5
		
		System.out.println("");
		System.out.println("zadanie 5");
		cars3.clear();
		System.out.println(cars3);
		
		
		//zadanie 6
		
		System.out.println("");
		System.out.println("zadanie 6");
		System.out.println(cars.contains("Seat"));
		System.out.println(cars.contains("Mercedes"));
		System.out.println(cars.contains("Ford"));
		
		//zadanie 7
		
		System.out.println("");
		System.out.println("zadanie 7");
		System.out.println(cars.get(1));
		System.out.println(cars.indexOf("Kia"));
		
		//zadanie 8
		
				System.out.println("");
				System.out.println("zadanie 8");
				System.out.println(cars.isEmpty());
				System.out.println(cars3.isEmpty());
				
		//zadanie 9
		
				System.out.println("");
				System.out.println("zadanie 9");
				Iterator<String> it = cars.iterator();
				while (it.hasNext()) {
					String tmp = it.next();
					System.out.println(tmp);}
					
		//zadanie 10
								
				System.out.println("");
				System.out.println("zadanie 10");
				cars.add("Kia");
				cars.add("Ford");
				System.out.println(cars);
				System.out.println(cars.lastIndexOf("Kia"));
				int xx = cars.lastIndexOf("Ford");
				cars.remove(xx);
				System.out.println(cars);
				cars.remove("Kia");
				System.out.println(cars);
				
		//zadanie 11
				
				System.out.println("");
				System.out.println("zadanie 11");
				ArrayList<String> cars4 = new ArrayList<String>();
				cars4.add("Volvo");
				System.out.println(cars4);
				System.out.println(cars);
				cars.removeAll(cars4);
				System.out.println(cars);
				
		//zadanie 12
				
				System.out.println("");
				System.out.println("zadanie 12");
				System.out.println(cars);
				cars.set(0, "Bentley");
				System.out.println(cars);
				System.out.println(cars.size());
				System.out.println(cars.subList(0, 3));
				
		//zadanie 13
				
				System.out.println("");
				System.out.println("zadanie 13");
				Object[] tablica1 = new String[cars.size()];
				System.out.println(tablica1);
				tablica1 = cars.toArray();
				System.out.println(tablica1);
				
				for (int i = 0; i < tablica1.length; i++) {
					System.out.println(tablica1[i]);
				}
		
	}

}
