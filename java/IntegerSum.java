package a1;

import java.util.Scanner;

/* Zoe Linga / 220610960
 * 
 *  Q1: This program reads an integer value and outputs the
 *  sum of all even integers between 2 and the input value.
 */

public class IntegerSum {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num, sum = 0; //variables
		
		System.out.println("Input an integer that is greater than 2: ");
		
		num = scan.nextInt();
		
		//when input is less than 2, asks for another number
		while (num < 2) {
			
			System.out.println("Error. Please enter a number greater than 2: ");
			num = scan.nextInt();
		}
		
		//add all of the even numbers until the chosen integer
		for (int i = 0; i < num; i++) {
			
			sum = sum + i*2;
		}
		
		System.out.print(sum);
		
		scan.close();
	}
}
