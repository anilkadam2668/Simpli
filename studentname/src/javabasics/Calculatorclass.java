package javabasics;

public class Calculatorclass {

	public static void main(String[] args) {// written public its due to accessible to jvm for execution. main is first method
		Calculator c1=new Calculator();
		
		c1.sum(10, 5);
		
		int res1=c1.sum(10, 10);
		System.out.println(res1);
		
		double res2=c1.multiply(2.7, 4);
		System.out.println(res2);
		
		int res3=c1.multiply(2);
		System.out.println(res3);
		
		int res4=c1.diffrence(5, 2);
		System.out.println(res4);
		
		byte b=(byte)1000;//explicit casting
		int i=(int)10.0;
		
		int result=c1.convert_string_int("123");
		System.out.println(result);
		System.out.println(((Object)result).getClass().getSimpleName());//Variable type check after execution of code
		
		String result1=c1.int_to_str(10);
		System.out.println("str is: "+result1);
		System.out.println(((Object)result1).getClass().getSimpleName());
		
		
		int a=65;
		char c=(char)a;
		System.out.println("Char is: "+c);
		
		}
}

class Calculator{
	int sum(int num1, int num2){//Void method didn't return any value
		int num3=num1+num2;
		return num3;
	}
	//method overloading depends upon number type of parameter
	double multiply(double num1, double num2){
	  double num3= (num1*num2);
	  return num3;
	}
	int multiply(int num1){
		return (num1*num1);
	}
	int diffrence(int num1, int num2) {
		 int num3=num1-num2;
		 return num3;
	}
	int division(int num1, int num2){
		int num3=num1/num2;
		return num3;
		}
	int convert_string_int(String input) {
		int result=Integer.parseInt(input);
		return result;
		
	}
	
	String int_to_str(int input){
		String result1=String.valueOf(input);
		return result1;
	}
}
