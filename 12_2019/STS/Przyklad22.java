package blok8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Przyklad22 {

	public static void main(String[] args) {
		List<Integer> al2 = new ArrayList<>();
		al2.add(1);
		al2.add(2);
		al2.add(3);
		al2.add(4);
		al2.add(5);
		al2.add(6);
		System.out.println(al2);
		Collections.reverse(al2);
		System.out.println(al2);
	}

}
