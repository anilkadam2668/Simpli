package controlflow;

import java.util.Scanner;

public class Switchcasedemo_05 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 0 to 5 numbers");
		int num=sc.nextInt();
		switch(num)
		{
		case 0:
			System.out.println("zero");
			break;
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		case 6:
			System.out.println("Six");
			break;
			default:
				System.out.println("Other than 0 to 5 number");



		}

	}

}
