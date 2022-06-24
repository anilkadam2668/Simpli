package Contolflow_assignments;

import java.util.Scanner;

public class Assignment11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter browser name");
		String s1[]= {"IE","chrome","Safari"};
		String data=sc.next();
		for(String i:s1)
		{
			System.out.println(i);
		}
		boolean browser1=s1[0].equals(data);
		boolean browser2=s1[1].equals(data);
		boolean browser3=s1[2].equals(data);
		
		/*String s2="chrome";
		String s3="Firefox";
		String s4="Safari";
		boolean browser1=s1.equals(s3);
		boolean browser2=s1.equals(s2);
		boolean browser3=s1.equals(s4);*/
		if(browser1==true)
		{
			System.out.println("Its valid browser1: ");
		}
		else if(browser2==true)
		{
			System.out.println("Its valid browser2:");
		}
		else if(browser3==true)
		{
			System.out.println("Its valid browser3:");
		}
		else if(browser3==true)
		{
			System.out.println("Its valid browser");
		}
			else
			{
				System.out.println("Its not valid browser");
		}
		
	}

}
