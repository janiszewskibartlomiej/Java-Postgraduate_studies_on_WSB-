package blok8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;


public class Zadania_JCF {

	public static void main(String[] args) {
	
	//ArrayList
		
	//Zadanie 1
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		System.out.println("Zadanie 1");
		System.out.println(cars);
		
	//Zadanie 2
		cars.add(2, "Audi");
		System.out.println("");
		System.out.println("Zadanie 2");
		System.out.println(cars);
		
	//Zadanie 3
		ArrayList<String> cars2 = new ArrayList<String>();
		cars2.add("Fiat");
		cars2.add("Seat");
		cars2.add("Kia");
		System.out.println("");
		System.out.println("Zadanie 3");
		System.out.println(cars2);
		cars.addAll(cars2);
		System.out.println(cars);
		
	//Zadanie 4	
		ArrayList<String> cars3 = new ArrayList<String>();
		cars3.add("Honda");
		cars3.add("Peugeot");
		System.out.println("");
		System.out.println("Zadanie 4");
		System.out.println(cars3);
		cars.addAll(3, cars3);
		System.out.println(cars);
		
	//Zadanie 5
		cars3.clear();
		System.out.println("");
		System.out.println("Zadanie 5");
		System.out.println(cars3);
		
	//Zadanie 6
		System.out.println("");
		System.out.println("Zadanie 6");
		System.out.println(cars.contains("Seat"));
		System.out.println(cars.contains("Mercedes"));
		System.out.println(cars.contains("Honda"));
		
	//Zadanie 7
		System.out.println("");
		System.out.println("Zadanie 7");
		System.out.println(cars.get(1));
		System.out.println(cars.indexOf("Kia"));
		System.out.println(cars);
		
	//Zadanie 8
		System.out.println("");
		System.out.println("Zadanie 8");
		System.out.println(cars.isEmpty());
		System.out.println(cars3.isEmpty());
	
	//Zadanie 9
		System.out.println("");
		System.out.println("Zadanie 9");
		Iterator<String> it = cars.iterator();
		while (it.hasNext()) {
			String a = it.next();
			System.out.println(a);
		}
		
	//Zadanie 10
		System.out.println("");
		System.out.println("Zadanie 10");
		cars.add("Kia");
		cars.add("Ford");
		System.out.println(cars.lastIndexOf("Kia"));
		System.out.println(cars);
		int a = cars.lastIndexOf("Ford");
		System.out.println(cars.remove(a));
		//System.out.println(cars.remove(cars.lastIndexOf("Ford")));
		System.out.println(cars);
		System.out.println(cars.remove("Kia"));
		System.out.println(cars);
		
	
	//Zadanie 11
		System.out.println("");
		System.out.println("Zadanie 11");
		ArrayList<String> cars4 = new ArrayList<String>();
		cars4.add("Volvo");
		System.out.println(cars4);
		System.out.println(cars);
		System.out.println(cars.removeAll(cars4));
		System.out.println(cars);
		
	//Zadanie 12
		System.out.println("");
		System.out.println("Zadanie 12");		
		System.out.println(cars);
		cars.set(0, "Bentley");
		System.out.println(cars);
		System.out.println(cars.size());
		System.out.println(cars.subList(0, 3));
		
	//Zadanie 13
		System.out.println("");
		System.out.println("Zadanie 13");
		Object[] tablica1 = new String[cars.size()];
		tablica1 = cars.toArray();
		
		for(Object s : tablica1)
		System.out.println(s);
		
	//Zadanie 14
		System.out.println("");
		System.out.println("Zadanie 14");
		System.out.println(cars);
		Collections.sort(cars);
		System.out.println(cars);
		Collections.shuffle(cars);
		System.out.println(cars);
		Collections.reverse(cars);
		System.out.println(cars); 
		Collections.rotate(cars, 2);
		System.out.println(cars);
		Collections.swap(cars, 2, 3);
		System.out.println(cars);
		Collections.replaceAll(cars, "Kia", "Opel");
		System.out.println(cars);
		System.out.println(cars2);
		Collections.fill(cars2, "Ferrari");
		System.out.println(cars2);
		
	//Zadanie 15
		System.out.println("");
		System.out.println("Zadanie 15");
		System.out.println(Collections.indexOfSubList(cars, cars4));
		Collections.replaceAll(cars4, "Volvo", "Opel");
		System.out.println(cars4);
		System.out.println(Collections.indexOfSubList(cars, cars4));
		System.out.println(Collections.lastIndexOfSubList(cars, cars4));
		
	
	//Set
		
	//Zadanie 16
		System.out.println("");
		System.out.println("");
		System.out.println("Set");
		System.out.println("");
		System.out.println("Zadanie 16");
		
		Set<String> zwierz = new HashSet<>();
		zwierz.add("kot");
		System.out.println(zwierz);
		zwierz.add("kot");
		zwierz.add("kot");
		System.out.println(zwierz);
		
		ArrayList<String> zwierzeta = new ArrayList<>();
		zwierzeta.add("kot");
		zwierzeta.add("pies");
		zwierzeta.add("papuga");
		zwierz.addAll(zwierzeta);
		System.out.println(zwierz);
		System.out.println(zwierz.contains("pies"));
		System.out.println(zwierz.containsAll(zwierzeta));
		zwierz.remove("papuga");
		System.out.println(zwierz);
		zwierz.removeAll(zwierzeta);
		System.out.println(zwierz);
		
		
	//Map
		
	//Zadanie 17
		System.out.println("");
		System.out.println("");
		System.out.println("Map");
		System.out.println("");
		System.out.println("Zadanie 17");
		
		Map<Integer, String> kolory = new HashMap<>();
		kolory.put(1, "niebieski");
		kolory.put(2, "zielony");
		kolory.put(3, "czerwony");
		System.out.println(kolory);
		
		System.out.println(kolory.containsKey(3));
		System.out.println(kolory.containsValue("zielony"));
		System.out.println(kolory.get(1));
		
		System.out.println(kolory.keySet());
		Set<Integer> si = kolory.keySet();
		System.out.println(si);
		
		Collection<String> c = kolory.values();
		System.out.println(c);
		Set<String> s1 = new HashSet<>();
		s1.addAll(c);
		System.out.println(s1);
		
	
	//Queue
		
	//Zadanie 18
		System.out.println("");
		System.out.println("");
		System.out.println("Queue");
		System.out.println("");
		System.out.println("Zadanie 18");
		
		Queue<String> kolejka = new LinkedList<String>();
		System.out.println(kolejka.offer("pierwszy"));
		System.out.println(kolejka.offer("drugi"));
		System.out.println(kolejka);
		System.out.println(kolejka.peek());
		System.out.println(kolejka);
		System.out.println(kolejka.poll());
		System.out.println(kolejka);
		System.out.println(kolejka.peek());
		System.out.println(kolejka);
		System.out.println(kolejka.poll());
		System.out.println(kolejka);
		System.out.println(kolejka.peek());
	}

}
