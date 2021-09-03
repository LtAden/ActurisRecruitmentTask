package controler;

import java.util.Scanner;


/*
 * All inputs are handled from this scanner
 * */
public class ScannerControler {

	private static Scanner scan = new Scanner(System.in);

	public static String getInput() {
		return scan.nextLine();
	}
	
	
}
