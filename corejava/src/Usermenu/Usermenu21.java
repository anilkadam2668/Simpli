package Usermenu;

import java.util.Scanner;

public class Usermenu21 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int select=1;
		
		while(select!=4) {
		System.out.println("Choose from these option");
		System.out.println("1. Add a user specifier file");
		System.out.println("2. delete a user specified file");
		System.out.println("3.search a user specified file");
		System.out.println("4. Quit");//if while bracket will not close it will run infinite loops
		
		
		
		
		
		 select=input.nextInt();
		
		switch(select) {
		case 1:
			System.out.println("option 1 selected");
			break;
		case 2:
			System.out.println("option 2 selected");
			break;
		case 3:
			System.out.println("option 2 selected");
		case 4:
			System.exit(0);
			break;
			default:
				System.out.println("wrong option");
		}
		}

	}

}
