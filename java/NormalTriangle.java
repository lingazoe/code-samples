package a1;

/* Zoe Linga / 220610960
 * 
 *  Q3b: This program outputs a normal right triangle using nested loops
 */

public class NormalTriangle {

	public static void main(String[] args) {
		
		//prints right triangle with nested for loop
		for (int i = 0; i < 10; i++) {
			
			for (int j = 0; j < i + 1; j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
