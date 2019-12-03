package blok6;

//public class Przyklad7 {
//
//	public static void main(String[] args) {
//		
////		System.out.println(2/0);
////	}
//		try {
//			System.out.println(2 / 0);
//		} catch (ArithmeticException ae) {
//			System.out.println("ArithmeticException: " + ae.getMessage());
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			}
//		}
//}

public class Przyklad7 {

	public static void main(String[] args) {
		try {
			System.out.println(2 / 0);
		} catch (Exception e) {
			System.out.println("Wykonam sie tylko jesli wystapi blad");
			System.out.println("Exception: " + e.getMessage());
		} finally {
			System.out.println("Czy jest blad czy nie i tak sie wykonam");
		}
	}
}
