//****************************************************
// LingaZoeA3Q3.java     Author: Zoe Linga     SN: 220610960
//
// A program that reads 8 positive integers from the user and stores them in an array
// 
// Then, it finds the position (or index) of the maximum and minimum values in the array and 
// swap them (move the max element to the position of the min and move the min element to the position of the max). 
//
// Then it calculates the median of the elements of this array (for this step an ascending order sort should be done 
// before calculating the median). 
// 
// Then run the code again and see its output for integer array of size 7.
//****************************************************

import java.util.Scanner;

public class ArrayPractice {

	public static void main(String[] args) {
		
		int posNoLength = 8;
		
		int posNo[] = new int[posNoLength];
		
		int maxmin = 0, posMax = 0, posMin = 0;
		int realmax = 0, realmin = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("The array length is: " + posNoLength + "\n");
		
		//asks the user to input an non negative integer and inputs each value in the posNo array
		for (int i = 0; i < posNoLength; i++) {
			
			System.out.println("Please input a value for the array: ");
			
			int no = scan.nextInt();
			
			while (no < 0) {
				
				System.out.println("Please input a positive value: ");
				
				no = scan.nextInt();
			}
			
			posNo[i] = no;
		}
		
		scan.close();
		
		//outputs the array in order
		System.out.println("\nBefore swapping the min max, the array is");
		
		for (int i = 0; i < posNoLength; i++) {
			
			System.out.print(posNo[i] + "   ");
		}
		
		//finding the biggest number
		for (int i = 0; i < posNoLength; i++) {
			
			if (posNo[i] > maxmin) {
				
				maxmin = posNo[i];
				posMax = i;	
				realmax = posNo[i];
			}
		}
		
		System.out.println("\n\nThe max is " + maxmin + " and its location is " + posMax);
		
		//finding the smallest number
		for (int i = 0; i < posNoLength; i++) {
			
			if (posNo[i] < maxmin) {
				
				maxmin = posNo[i];
				posMin = i;	
				realmin = posNo[i];
			}
		}
		
		System.out.println("The max is " + maxmin + " and its location is " + posMin);
		
		//swap the places of the minimum and maximum
		posNo[posMax] = realmin;
		posNo[posMin] = realmax;
		
		System.out.println("\nAfter swapping the min max, the array is");
		
		for (int i = 0; i < posNoLength; i++) {
			
			System.out.print(posNo[i] + "   ");
		}
		
		//sorting the array in ascending order
		System.out.print("\n\nThe array sorted in Ascending Order: ");
		
		for (int i = 0; i < posNoLength; i++) {  
			
			for (int j = i + 1; j < posNoLength; j++) { 
				
				int checker = 0;  
				
				if (posNo[i] > posNo[j]) {  
					
					checker = posNo[i];  
	
					posNo[i] = posNo[j];  
					
					posNo[j] = checker;  
					
				}  
			}
			
		//prints the sorted element of the array  
		System.out.print(posNo[i] + " ");  
	}  
		
		//calculate and output the median of the array
		if (posNoLength == 8) 
			
			System.out.println("\n\nThe median is: " + (posNo[3] + posNo[4]) / 2.0 );
		
		else
			System.out.println("\n\nThe median is: " + posNo[3]);	
	}
}
