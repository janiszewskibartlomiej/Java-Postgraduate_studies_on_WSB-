package blok5;

public class Przyklad_switch {

	public static void main(String[] args) {
		int x = 10;
		
		switch (x) {
		case 1: System.out.println("jeden");			
			break;
		case 2: System.out.println("dwa");			
			break;
		case 3: System.out.println("trzy");			
			break;
		case 4: System.out.println("cztery");			
			break;

		//default: System.out.println("");
		default:
			throw new IllegalArgumentException("Unexpected value: " + x);
		}
	

	}

}
