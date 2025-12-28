package a1;

import java.util.Scanner;

/* Zoe Linga / 220610960
 * 
 *  Q2: This program reads a string from the user and 
 *  outputs each character once per line.
 */

public class StringLine {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String line; //user input
		
        System.out.println("Input a string: ");
		
		line = scan.nextLine();
		
		//prints each character with charAt
		for (int i = 0; i < line.length(); i++) {
			
			System.out.println(line.charAt(i));
		
		}
	}
}
