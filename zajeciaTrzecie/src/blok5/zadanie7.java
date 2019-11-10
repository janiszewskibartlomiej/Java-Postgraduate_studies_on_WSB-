package blok5;

public class zadanie7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String metoda = "GET";
		System.out.println(sprawdzMetode(metoda));
	}
	
	public static String sprawdzMetode(String metoda) {
		if (metoda == "POST") 
			return "OK";
		
			else {
				return "Metoda niedozwolona";
			}
			
		}
		
		
	}


