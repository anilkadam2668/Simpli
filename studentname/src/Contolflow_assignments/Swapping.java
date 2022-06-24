package Contolflow_assignments;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num1=sc.nextInt();
        int num2=sc.nextInt()
        System.out.println("Enter number=" +num1+" num2="+num2);
	    int num3=num1;
	    num3=num2;
	    num2=num1;
	    System.out.println("Enter number num1=" +num1+" num2="+num2);*/
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter first number :a");
		a=sc.nextInt();
		System.out.println("Enter second number :b");
        b=sc.nextInt();
        System.out.println("Before swap number a=" +a+" b="+b);
       /* a=a+b;
        b=a-b;
        a=a-b;*/
         c=a;
         a=b;
         b=c;
        System.out.println("After swap number a=" +a+" b="+b);
	}

}
