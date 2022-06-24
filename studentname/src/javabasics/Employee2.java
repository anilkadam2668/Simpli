package javabasics;

public class Employee2 
{
	//Data
	int sallory=10000;
	String name="Amogh";
	
	//Method
	public void display()
	{
		int roll=77;
		System.out.println("Role no is: "+roll);
		System.out.println("Employee sallory: "+ sallory);
		System.out.println("Employee name: "+ name);
	}
		public static void main(String[] args)
		{
		//Create to access all data and method
			Employee2 E1=new Employee2();
			E1.display();
			E1.sallory=15000;
			E1.name="Abishek";
			System.out.println(("New Employee sallory:" +E1.sallory) + ("\nNew employee Name: "+E1.name));
	}

}
