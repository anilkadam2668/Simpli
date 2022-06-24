package Contolflow_assignments;

import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=sc.nextLine();
		System.out.println("Enter 1st number");
		int num1=sc.nextInt();
		System.out.println("Enter 2nd number");
		int num2=sc.nextInt();
		//System.out.println("Enter your name");
		//String name=sc.nextLine();
		System.out.println("Addition of two numbers:"+(num1+num2));
		System.out.println("Name is:"+name);
		sc.close();

	}

}
