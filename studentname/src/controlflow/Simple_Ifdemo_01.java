package controlflow;

import java.util.Scanner;

public class Simple_Ifdemo_01 {

	public static void main(String[] args)
	{
    System.out.println("Program Starts.....");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your age");
	int age=sc.nextInt();
    if (age>=18)
    {
    	System.out.println("Age is valid");
    }
    else
    {
    	 System.out.println("Age is not valid");
    }
    System.out.println("Program ends.....");
	}

}
