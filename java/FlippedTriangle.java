package a1;

/* Zoe Linga / 220610960
 * 
 *  Q3a: This program outputs an upside down triangle using nested loops
 */

public class FlippedTriangle {

	public static void main(String[] args) {
		
		//for loop to create triangle
		for (int i = 0; i < 10; i++) {
			
			for (int j = i; j < 10; j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
