package controlflow;

import java.util.Scanner;

public class PerformanceSwitchcase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the employee number");
		int i1=sc.nextInt();
		switch(i1)
		{
		case 1:
			System.out.println("Poor performance");
			break;
		case 2:
			System.out.println("Need to improve");
			break;
		case 3:
			System.out.println("Good performance");
			break;
		case 4:
			System.out.println("Excellent performance");
			break;
		case 5:
			System.out.println("Employee of the year");
			break;
		default:
			System.out.println("Not defined");
		}

	}

}
