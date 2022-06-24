package oop;

public class Abstract_implimented extends Abstract_demo
{
	public void display()
	{
		System.out.println("This is child method");
	}

	public static void main(String[] args)
	{
		//Scenario 1=Child class ref and child class object
		Abstract_implimented a1=new Abstract_implimented();
		a1.accept();
		a1.display();
		a1.show();
		
		//Scenario 2: Parent class ref and child class object
		
		Abstract_demo a2=new Abstract_implimented();
		a2.accept();
		a2.show();
		
		//Scenario 3: Parent ref and Parent object==Invalid scenario
		
		//Abstract_demo a3= new Abstract_demo();
		
		//Scenario 4:Child ref and parent object==invalid
		
		//Abstract_implimented a4= new Abstract_demo();
		
		
		
	}

	@Override
	public void show() 
	{
		System.out.println("Updated by child");
		
	}

}
