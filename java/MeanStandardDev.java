package a1;

import java.util.Scanner;

/* Zoe Linga / 220610960
 * 
 *  Q6: This program computes the mean and standard deviation from 50 integers,
 *  with the max value being 100. Outputs the mean and standard deviation.
 */

public class MeanStandardDev {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		final int MAX_COUNT = 50; //the amount of times a user can enter a value
		
		float mean = 0, stDev = 0;
		
		float values[] = new float [MAX_COUNT]; //where user input is stored
		
		//asks user to input 50 numbers
		for (int i = 0; i < MAX_COUNT; i++) {
			
			System.out.println("Input an integer that is less than 100: ");
			
			values[i] = scan.nextInt();
			
			//when input is more than 100, asks for new numbers
			while (values[i] > 100) {
				
				System.out.println("Please enter a number less than 100");
				
				values[i] = 0;
				
				values[i] = scan.nextInt();
			}
			
			//adding all the values inputed
			mean = mean + values[i];
		}
		
		//finalizing mean
		mean = mean/MAX_COUNT;
		
		//determining the standard deviation via equation
		for (int i = 0; i < MAX_COUNT; i++) {
			
			stDev = stDev + (float) Math.pow((values[i] - mean), 2);
		}
		
		//finalizing standard deviation
		stDev = (float) Math.sqrt(stDev);
		stDev = stDev/MAX_COUNT;
		
		System.out.println("\nMean:\t" + mean);
		System.out.println("Standard Deviation:\t" + stDev);
		
		scan.close();

	}

}
