package Contolflow_assignments;

import java.util.Scanner;

public class larg3num {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int x,y,z;
	System.out.println("Eneter 1st diffrent number");
	x=sc.nextInt();
	System.out.println("Eneter 2nd diffrent number");
    y=sc.nextInt();
    System.out.println("Eneter 3rd diffrent number");
    z=sc.nextInt();
    
    if (x>=y && x>=z)
    {
    	System.out.println("X is greater than y & z");
    }
    else if(y>=x && y>=z)
    {
    	System.out.println("y is greater than x & z");
    }
    else if(z>=x && z>=y)
    {
    	System.out.println("z is greater than x and y");
    }
	}

}
