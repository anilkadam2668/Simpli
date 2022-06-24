package javabasics;

import package1.person;

public class Person2 extends person{

	public static void main(String[] args) {
		Calculator c1=new Calculator();
		double res2=c1.multiply(2.7, 4);
		System.out.println(res2);
		}
}

class Calculator{
	int sum(int num1, int num2){//Void method didn't return any value
		int num3=num1+num2;
		return num3;
	}
	//method overloading depends upon number type of parameter
	double multiply(double num1, double num2){
		print();
	  double num3= (num1*num2);
	  return num3;
	}
	
	
		
	}
}
