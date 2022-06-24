package Contolflow_assignments;

import java.util.Scanner;

public class Prime_demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter >1 number");
		int num=sc.nextInt();
		int prim = 1; 
		for(int i=2; i<=11; i++)
		{
			prim=num/i;
		}
		if (prim==0)
		{
			System.out.println("Is a prime number");
		}
		else 
		{
			System.out.println("Is not prime number");
		}

	}

}
