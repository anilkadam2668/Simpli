package package1;


import First.Animalinterface;

public class Runner2 {

	public static void main(String[] args) {
		
		Animalinterface obj=new Dog2();
		
	       //here obj is base class refrence variable
	       //it can be assigned object of child class
	       //this is called as dynamic  method dispatch
	       //also called as runtime polymorphism
	       
	    obj.eat();//eat method of dog class called
		   
	    Animalinterface obj1= new Cat2();
	    obj1.eat();
		
		

	}

}
