package controlflow;

import java.util.Scanner;

public class Equal_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		switch(num)
		{
		case 10:
			System.out.println("this number equal to :100");
			break;
		case 50:
			System.out.println("this number equal to :500");
			break;
		case 80:
			System.out.println("this number equal to :100");
			break;
			default:
				System.out.println("its none of matching number");
		}

	}

}
