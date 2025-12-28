//****************************************************
// LingaZoeA3Q2.java     Author: Zoe Linga     SN: 220610960
//
// A program that places 10 queens on 10 x 10 chess board in such a way that one queen is to be
// in each row. 
//
// It asks the user to enter the columns that contain queens in the 10 rows. 
//
// The program then places the queens in these columns (one per row) and prints the board. 
//****************************************************

import java.util.Scanner;

public class TenQueens {

	public static void main(String[] args) {
		
		String board[][] = new String[10][10];
		Scanner scan = new Scanner(System.in);
		
		int row, column = 0; 
		
		//create the 10 x 10 board with " . "
		for (int i = 0; i < 10; i++) {
			
			for (int j = 0; j < 10; j++) {
				
				board[i][j] = " . ";
			}
		}
		
		//ask user 10 times to enter the column number and puts " Q " in that area within the row and column
		for (row = 0; row < 10; row++) {
			
			System.out.println("Please enter columns to put queen");
			
			column = scan.nextInt();
			
			board[row][column] = " Q ";
		}
		
		scan.close();
		
		//outputs the board once again with the new " Q "
		for (int i = 0; i < 10; i++) {
			
			for (int j = 0; j < 10; j++) {
				
				System.out.print(board[i][j]);
			}
			
			System.out.println();
		}
	}
}
