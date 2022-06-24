package controlflow;

import java.util.Scanner;

public class A_to_Z_print {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter char");
		char c1=sc.nextLine().charAt(0);//Method chaining
		if(c1>='a' && c1<='z' || c1>='A' && c1<='Z')
		{
			System.out.println("its alphabet");
		}else
		{
			System.out.println("its not an alphabet");
		}

	}

}
