package a1;

import java.util.Scanner;

/* Zoe Linga / 220610960
 * 
 *  Q5: This program reads an arbitrary number of integers between 0-50
 *  and tallies each time a number is inputed, then outputs how many times
 *  each number has been inputed.
 *  
 */

public class IntegerCounter {

	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        
		//values array is for "max" numbers inputed
        int values[] = new int [10], count[] = new int [51], count1 = 0;
        
        //for inputting numbers and tallying scores
        for (int i = 0; i < values.length; i++) {
        
		System.out.println("Input an integer from 0 - 50: ");
		
		values[i] = scan.nextInt();
		
		//when input is greater than 50 or less than 0, asks for new number
		while (values[i] < 0 || values[i] > 50) {
			
			System.out.println("Please input a number less than 51/greater than -1");
			
			values[i] = 0;
			values[i] = scan.nextInt();
		}
		
		count[values[i]]++;
		
        }
        
        System.out.println("\nHere are the number of occurences from 0 - 50: \n");
        
        //outputs numbers and amount of times each number has been outputted
        for (int i = 0; i <= 50; i++) {
        	
        	System.out.println(i + ":\t" + count[i]);
        }
        
        scan.close();
	}
}
