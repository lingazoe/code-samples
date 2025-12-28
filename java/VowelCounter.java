package a1;

import java.util.Scanner;

/* Zoe Linga / 220610960
 * 
 *  Q4: This program reads a string from the user and counts the amount of each 
 *  lowercase vowels and counts the amount of constants. Then outputs the amount for each 
 *  vowel and the amount of constants.
 *  
 */

public class VowelCounter {

	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        
		int aCount = 0, eCount = 0, iCount = 0, oCount = 0, uCount = 0, constCount = 0;
		
		String line;
		
        System.out.println("Input a string: ");
		
		line = scan.nextLine();
		
		//determining each if a vowel is present and tallys (as well as constants) (ignores spaces)
		for (int i = 0; i < line.length(); i++) {
			
			if (line.charAt(i) == 'a') {
				
				aCount++;
			}
			
			else if (line.charAt(i) == 'e') {
				
				eCount++;
			}
			
			else if (line.charAt(i) == 'i') {
				
				iCount++;
			}
			
			else if (line.charAt(i) == 'o') {
				
				oCount++;
			}
			
			else if (line.charAt(i) == 'u') {
				
				uCount++;
			}
			
			else if ((line.charAt(i) == ' ')){
				
				continue;
			}
			
			else {
				
				constCount++;
			}
		}
		
		//outputs the amount of times each vowel appears, and the total constant counts
		System.out.println("\nThe string " + line + " has: \n");
		System.out.println(aCount + " A(s)");
		System.out.println(eCount + " E(s)");
		System.out.println(iCount + " I(s)");
		System.out.println(oCount + " O(s)");
		System.out.println(uCount + " U(s)");
		System.out.println(constCount + " Constant(s)");
	}
}
