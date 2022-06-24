package oop;
//final class demo// we can't extend that class by other class
class Demo
{
	 int x=100;//we can't update variable data if we use "final" key word before int.
	
	public void show()//we can't override final method// If we write "final" keyword before void the method can't be duplicate
	{
		 System.out.println("This is show method");
	}
}

public class Finalkeword extends Demo//demo parent
{

public void show()
{
	 System.out.println("This is child show method");
}

	public static void main(String[] args)
	{
		Finalkeword f1=new Finalkeword();
		//f1.x=220// we can update the x value if we not used final keyword
		 System.out.println(f1.x);
		 f1.show();
	}
	

}

