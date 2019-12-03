package blok5;

public class Przyklad_switch2 {

	public static void main(String[] args) {
		String s = "trzy";
		
		switch (s) {
			case "jeden": System.out.println("1");
				break;
			case "dwa": System.out.println("2");
				break;
			case "trzy": System.out.println("3");
				break;
		
			default: System.out.println("");
			
//			default:
//			throw new IllegalArgumentException("Unexpected value: " + s);
		}
	}

}
