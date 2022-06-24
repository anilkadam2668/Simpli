package controlflow;

import java.util.Scanner;

public class Interview20 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Hollow Rhombus Pattern Rows = ");
		int rows = sc.nextInt();
		
		System.out.println("Printing Hollow Rhombus Star Pattern");
		
		for (int i = 1 ; i <= rows; i++ ) 
		{
			for (int j = 1 ; j <= rows - i; j++ ) 
			{
				System.out.print(" ");
			}
			for (int k = 1 ; k <= rows; k++ ) 
			{
				if (i == 1 || i == rows || k == 1 || k == rows) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	}


