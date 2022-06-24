package Contolflow_assignments;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter >0 number");
		int num=sc.nextInt();
		int fact=1;//for big numbers we have to use long and double
        for(int i=num; i>=1; i--)
        {
        	fact=fact*i;
        }
        System.out.println(num+" factorial is: "+fact);
	}
	

}
