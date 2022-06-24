	package oop;

class a
{
	public void m1()
	{
		System.out.println("Parent method m1");
	}
}
class b extends a//a is parent and b is child--->single level inheritance
{
	public void m2()
	{
		System.out.println("Child method m2");
	}
}
class c extends b
{
	  public void m3()//b is Parent and c is child--->Multi lvl inheritance
		{
		System.out.println("Subchild method m3()");
		
	}
}
class d extends a//a is a parent and d is child--->Hierarchical inheritance
{
	public void m4()
	{
		System.out.println("Subchild method m4()");
	}
}
public class Inheritancedemo_33 {

	public static void main(String[] args) {
		//Scenario1; Child class ref and child class object
		//Parent+Child
		b b1=new b();
		b1.m1();
		b1.m2();
		
		//Scenario2: Parent class ref and Parent class object
		//only Parent
		a a1=new a();
		a1.m1();

		//Senario3: Parent class ref and child class object
		//only parent methods
		
		a a2=new b();
		a2.m1();
		
		//Scenario4: Child class ref and parent class method
		//Invalid scenario
		//b b2=new a();
		

		//Scenario1; Child class ref and child class object
		//Parent+Child
		c c1=new c();
		c1.m1();
		c1.m2();
	    c1.m3();
	    
	  //Scenario2: Parent class ref and Parent class object
	  //only Parent
	    b B1=new b();
	    B1.m1();
	    B1.m2();
	    
	  //Senario3: Parent class ref and child class object
	  //only parent methods
	    b B2=new c();
	    B2.m1();
	    B2.m2();
	    
	    
	    
		
	}

}
