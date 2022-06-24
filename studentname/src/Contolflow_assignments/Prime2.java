package Contolflow_assignments;

import java.util.Scanner;

public class Prime2 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int num1=sc.nextInt();
		if((num1%2==0 || num1/1==0 || (num1==2)))
		{
			System.out.println("Is not prime");
		}
		else
		{
			System.out.println("is a prime number");
			
		}
		

	}

}
