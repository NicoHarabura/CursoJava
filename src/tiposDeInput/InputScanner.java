package tiposDeInput;

import java.util.Scanner; 

public class InputScanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int i = scan.nextInt();
		scan.close();
	}
	
	
}
