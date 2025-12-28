import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		
		int a[] = new int [4];
		
		Scanner scan = new Scanner (System.in);
		
		for (int i = 0; i < a.length; i++) {
		
		System.out.println("Please give integer positive number: ");
		
		int input = scan.nextInt();
		
		while (input < 0) {
			
			System.out.println("Please give integer positive number: ");
			input = scan.nextInt();
		}
		
		a[i] = input;
		
		}

		System.out.print("\nUnsorted: ");
		
		for (int i = 0; i < a.length; i++) {
			
		System.out.print(a[i] + " ");
		
		}
		
		System.out.println();
		
		for (int i = 0; i < a.length - 1; i++) {
			
			System.out.print("\nIteration " + i + " Output is ");
			
			for (int j = 0; j < a.length - 1-i; j++) {
				
				if (a[j] > a[j + 1]) {
					
					int temp  = a[j];
					
					a[j] = a[j + 1];
					
					a[j + 1] = temp;
				
			   }
         	}
			
			for(int k = 0; k < a.length; k++) {
				
				System.out.print(a[k] + " ");
				
	}
			
		}			
	
		System.out.print("\n\nSorted: ");
		
		for (int l = 0; l < a.length; l++) {
			
			System.out.print(a[l] + " ");
			
		}

		scan.close();

		}
	}










