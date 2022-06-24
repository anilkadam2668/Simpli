package javabasics;

import corejava.Animal;

public class Runnerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Animal obj=new Dog();
       //here obj is base class refrence variable
       //it can be assigned object of child class
       //this is called as dynamic  method dispatch
       //also called as runtime polymorphism
       
       obj.eat();//eat method of dog class called
	   
       Animal obj1=new Cat();
       obj1.eat();
	
	}
	

}
