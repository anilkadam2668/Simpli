package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class A_Input_read {

	public static void main(String[] args) throws IOException
	        
	    {
	        Scanner sc=new Scanner(System.in);
	        
	        System.out.println("Please enter your name");
	        String name=sc.next();
	        
	        System.out.println("Please enter a number");
	        int num=sc.nextInt();
	        
	        System.out.println("Please enter a floating number");
	        float flt=sc.nextFloat();
	        
	        System.out.println("your name is: "+name);
	        System.out.println("Selcted number is: "+num);
	        System.out.println("Selected floating number is: "+flt);
	       
	        
	        
	        
	        
	        
	        
	        
	       
	        
	        
	        
	    }
}

//Enter data using BufferReader
//BufferedReader reader = new BufferedReader(
//    new InputStreamReader(System.in));
//
//// Reading data using readLine
//String name = reader.readLine();
//
//// Printing the read line
//System.out.println(name);