package Contolflow_assignments;

import java.util.Scanner;

public class Armstrong_number_cube_root_additon {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
        int num=sc.nextInt(), rem,sum=0, arms=num;
        while(num>0)
        {
        	rem=num%10;
        	num=num/10;
        	sum=sum+rem*rem*rem;
        
        }
        System.out.println(sum);
	    if(arms==sum)
	    {
	    	System.out.println(arms+" is an armstrong");
	    }else
	    {
	    	System.out.println(arms+" is not an armstrong");
	    }
	}

}
