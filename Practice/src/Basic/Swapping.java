package Basic;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		 int A,B,C;
		 A=sc.nextInt();
		 System.out.println("Before swap:A "+A);
		 
	     B=sc.nextInt();
		 System.out.println("Before swap:B "+B);
		 
		 C=A;
		 A=B;
		 B=C;
		 
		 System.out.println("After swap:A= "+A);
		 System.out.println("After swap:B= "+B);
		 
	 

	}

}
