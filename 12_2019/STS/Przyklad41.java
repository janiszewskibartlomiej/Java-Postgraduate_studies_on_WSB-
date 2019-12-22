package blok8;

import java.util.LinkedList;
import java.util.Queue;

public class Przyklad41 {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		// dodaj jeœli mo¿liwe
		System.out.println(q.offer(1));
		System.out.println(q);
		System.out.println(q.offer(2));
		System.out.println(q);
		// zwróæ pierwszy element z listy (jeœli istnieje)
		System.out.println(q.peek());
		System.out.println(q);
		// usuñ
		System.out.println(q.poll());
		System.out.println(q);
		// zwróæ pierwszy element z listy (jeœli istnieje)
		System.out.println(q.peek());
		System.out.println(q);
		// usuñ
		System.out.println(q.poll());
		// null
		// zwróæ pierwszy element z listy (jeœli istnieje)
		System.out.println(q.peek());
		System.out.println(q);
		// usuñ
		System.out.println(q.poll());

	}

}
