package oop;
//Multiple inheritance 
public class b_HDFC implements Bank1,Bank2//bank1 bank2 are parent and HDFC
{
	public void custinfo()
	{
		System.out.println("Display all data");
	}

	public static void main(String[] args)
	{
		//Two scenario are valid in interface
		Bank1 b1=new b_HDFC();//You can't access only interface(parent) method to create an object. interface can't be instantiate
		b1.deposit();
		b1.withdraw();
		b1.rateofinterest(); 
		
		b_HDFC h1=new b_HDFC();
		h1.deposit();
		h1.withdraw();
		h1.rateofinterest();
		h1.custinfo();

	}

	@Override
	public void withdraw() {
		System.out.println("Up t 10k");
		
	}

	@Override
	public void deposit() {
		System.out.println("Up to 15k");
		
	}

	@Override
	public void rateofinterest() {
		System.out.println("HDFC bank prividing 9% interest") ;
		
	}

	@Override
	public void loan() {
		
		System.out.println("Rate of interest is 3%");
		
	}

}
