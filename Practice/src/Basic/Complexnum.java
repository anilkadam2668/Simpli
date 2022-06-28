package Basic;

import java.util.Scanner;

public class Complexnum {
	
	public  Object show(int a, int b, int c, int d) {
        
		int e=a+b;
		
		String g="i";
		
		int f=c+d;
		
		String l=f+g;
		
		System.out.println("Complex Num is: "+e+"+"+l);
		return l;
		
		
	}

	public static void main(String[] args, Object object) {
		Complexnum comp=new Complexnum ();
		
//		Scanner sc=new Scanner(System.in);
//		
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		
//		int c=sc.nextInt();
//		int d=sc.nextInt();
		
		Object z=comp.show(10, 4, 5, 5);
		System.out.println(z);
		
		
		
		
		
		
		
		
		
		

	}

}
