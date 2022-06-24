package Contolflow_assignments;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		 int num=sc.nextInt(), rem,sum=0, pnum=num;
        while(num>0)
        {
        	rem=num%10;
        	num=num/10;
        	sum=sum*10+rem;
        }
        
        System.out.println("Reverse number of "+ pnum + " is "+sum);
        if(pnum==sum)
        {
        	System.out.println("The pnum is palindrome " +pnum);
        }
        else
        {
        	System.out.println("The pnum is not palindrome " +pnum);
        }
	}

}
