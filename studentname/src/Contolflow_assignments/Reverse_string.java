package Contolflow_assignments;

import java.util.Scanner;

public class Reverse_string {

	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to reverse the sentecnce or words");
        
        //Stores the reverse of given string 
        String Actual = sc.nextLine();
	    String Reverse="";
	    
	    //Iterate through the string from last and add each character to variable reversedStr 
	    for (int i =Actual.length()-1; i >= 0 ; i--)
	    {
	    	Reverse = Reverse + Actual.charAt(i);
	    }
	    
	    //Displays the reverse of given string  
	    System.out.println("Reverse of the string: " + Reverse);
	}

	
	
	
}
