package javabasics;

import java.util.Scanner;

public class Assignment12
{
	public void addition(int a, int b)
	{
	int add=a+b;
	System.out.println("Addition is:"+ add);
	}
		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Assignment12 n=new Assignment12();
		System.out.println("enter name:");
		String s1=sc.nextLine();
		System.out.println("user name is:"+s1);
		n.addition(10,10);
		
		// for 2 data parameter passing
		/*System.out.println("enter num1 n1`: ");
		int n1=sc.nextInt();
		System.out.println("enter num1 n1`: ");
		int n2=sc.nextInt();
		n.addition(n1, n2);*/
		
		
		
		}
}
