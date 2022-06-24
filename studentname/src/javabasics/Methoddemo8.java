package javabasics;

public class Methoddemo8 {

	public void accept() //*Requires object to call it (Instance)*
	{
		System.out.println("This is instance method");
	}
    public static void display() // *Without object we can call it*
    {
    	System.out.println("this is static method");
    }
    public static void main(String[] args)
    {
    	//To call instance method
    	Methoddemo8 m1=new Methoddemo8();
    	m1.accept();
    	
    	//To call static method
    	Methoddemo8.display();
    	
       // m1.display();// Wrong call it will display output but with yellow under line
    	
    }
}

