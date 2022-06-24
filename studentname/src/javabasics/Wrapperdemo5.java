package javabasics;

public class Wrapperdemo5 
{
	public static void main(String[]args)
	{
		
		//string to integer conversion
		String s1="100";
		System.out.println(s1+100);//100100
		
		int num=Integer.parseInt(s1);//number format exception
		System.out.println("String to integer:"+(num+100));//200
		
		//String to boolean
		String s2="true";
		System.out.println(s2);
		
		boolean b1=Boolean.parseBoolean(s2);
		System.out.println("string to boolean is:"+s2);
		
		//String to double
		String d1="49.50";
		System.out.println(d1);
		
		double d2=Double.parseDouble(d1);
		System.out.println("string to double:"+d2);
		
		//String to float
		String f1="100";
		System.out.println(f1);
		
		float f2=Float.parseFloat(f1);
		System.out.println("string to float:"+f2);
		
		//String to special character
		String c1="anil";
		System.out.println(c1);
		
		char c2=c1.charAt(1);
		System.out.println("string to char:"+c2);
		
		
	//primitive to object(string)
		
		//int to string
		int si1=200;
		System.out.println(si1+100);
		String si2=String.valueOf(si1);
		System.out.println("int to string:"+si2+100);
		
		//double to string
		double sd1=50.67;
		System.out.println(sd1+10);
		String sd2=String.valueOf(sd1);
		System.out.println("double to sting:"+sd2+10);
		
		//float to string
		float sf1=100;
		System.out.println(sf1+50);
		String sf2=String.valueOf(sf1);
		System.out.println("float to string:"+sf2+55);
		
		//character to string
		char sc1=97;
		System.out.println(sc1);
		String sc2=String.valueOf(sc1);
		System.out.println("character to string :"+sc2);
		
		//boolean to string
		boolean sb1=true;
		System.out.println(sb1);
		String sb2=String.valueOf(sb1);
		System.out.println("boolean to string:"+sb2);
		}
}
