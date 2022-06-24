package javabasics;

import java.util.Scanner;

public class Runtimeparameterpass11 {
	public void show(int n)//n=num 
	{
		System.out.println("Age is:"+n);
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
		int num=sc.nextInt();
		//System.out.println(num);
		Runtimeparameterpass11 r1=new Runtimeparameterpass11();
		r1.show(num);
		sc.close(); 
	}
}
