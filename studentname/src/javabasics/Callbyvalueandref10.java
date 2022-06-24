package javabasics;

public class Callbyvalueandref10 {

	public void show(int num)
	{
		System.out.println("Hello");
		System.out.println(num);
	}
	public void callbyref(Callbyvalueandref10 c) //c=c1 or you can write any char it will assign itself
	{
		c.show(50);
	}
	public static void main(String[] args) 
	{
		 Callbyvalueandref10 c1=new  Callbyvalueandref10();
		 c1.show(10);
		
	// Call by reference
		 c1.callbyref(c1);
	}

}
