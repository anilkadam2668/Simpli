package controlflow;

import java.util.Scanner;

public class Nestedif_02 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter char");
		char c1=sc.nextLine().charAt(0);//Method chaining
		if(c1=='a'|| c1=='e'|| c1=='i'|| c1=='o'|| c1=='u')
		{
			System.out.println("Its vowel");
		}
		else
		{
			System.out.println("Its not vowel");
		}
		//String data=sc.nextLine();
		//char c1=data.charAt(0);
		//char c1='d';
		/*if (c1=='a')
		{
			System.out.println("its vowel");
		}
		else if (c1=='e')
		{
			System.out.println("Its vowel");
		}
		else if(c1=='i')
		{
			System.out.println("Its vowel");
		}
		else if(c1=='o')
		{
			System.out.println("Its vowel");
		}
		else if(c1=='u')
		{
			System.out.println("Its vowel");
		}
		else
		{
			System.out.println("Its not vowel");
		}*/
		
	}
}
