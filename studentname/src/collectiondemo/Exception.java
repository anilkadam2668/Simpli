package collectiondemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException 
	{
		
		//File f1=new File("path of file");
		//FileInputStream fs=new FileInputStream(f1);
		
		System.out.println("Program starts....:");
		Thread.sleep(3000);
		System.out.println("Program ends......:");
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter valid index number b/w 0 to 3");
		int index=sc.nextInt();
		int arr[]= {10,20,30,40};
		try {
			System.out.println("Value is: "+arr[index]);
			
		} catch (java.lang.ArrayIndexOutOfBoundsException j) {
			System.out.println("Enter valid index otherwise you will get exception as:"+ j.getMessage());
		}
		
		
	
		
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Please enter valid Two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println("Addition is: "+(a+b));
		System.out.println("Multiplication is: "+(a*b));
		try {
			System.out.println("Division is: "+(a/b));
			}catch(java.lang.ArithmeticException j)//getting exception from console
			{
				System.out.println("Please enter number other than zero other wise you will get exeption as: "+j.getMessage());
			}finally//commonly statement want to run to execute at every program
			{
				System.out.println("Thank you!");
			}
		System.out.println("Substraction is: "+(a-b));
		sc.close();*/
		
	}

}
