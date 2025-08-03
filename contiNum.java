package PSNA;

public class contiNum {

	public static void main(String[] args) {
		 int rows = 3;   // Number of rows
	        int num = 1;    // Starting number

	        for (int i = 1; i <= rows; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(num);
	                num++;
	            }
	            System.out.println();
	        }	    
	}
}
