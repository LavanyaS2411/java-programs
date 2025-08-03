package PSNA;

public class Reverseastring {

	public static void main(String[] args) {
		String a = "Alphabet";
		int reverse = a.length();
		String reversed ="";
		for(int i=reverse-1;i>=0;i--) {
			reversed+=a.charAt(i);
			
		}
		System.out.println(reversed);
	}

}
