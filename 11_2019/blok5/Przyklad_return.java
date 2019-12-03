package blok5;

public class Przyklad_return {

	public static void main(String[] args) {
		System.out.println(zgadnijLiczbe(49));
	}
	
	public static String zgadnijLiczbe(int liczba) {
		int l=49;
		if(liczba>l) {
			return "za duzo";
		}
		if (liczba<l) {
			return "za malo";
		}
		return "zgadl(e|a)s";
		
	}
}
