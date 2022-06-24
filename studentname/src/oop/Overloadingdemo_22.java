package oop;

public class Overloadingdemo_22 {
	public void add()
	{
		int a=100, b=200;
		System.out.println("Addition of a&b:"+(a+b));
	}
	//Rule1 pass number of Arguments
	public void add(int a, int b)
	{
		System.out.println("Addition of a&b:"+(a+b));
	}
	//Rule2 change type of argument
	public void add(double a, int b)
	{
		System.out.println("Addition of A&b:"+(a+b));
	}
	//Rule3 change the order of argument
	public void add(int a, double b)
	{
		System.out.println("Addition of A&b:"+(a+b));
	}
    Overloadingdemo_22()
    {
    	System.out.println("Default contructor calling....");
    }
    Overloadingdemo_22(String name)
    {
    	System.out.println(name);	
    }
    Overloadingdemo_22(String name, int id)
    {
    	System.out.println(name+" "+id);
    }
    Overloadingdemo_22(int id, String name)
    {
    	System.out.println(id+" "+name);
    }
	public static void main(String[] args) {
	  Overloadingdemo_22 o1=new Overloadingdemo_22();
	  o1.add();
	  o1.add(200,300);
	  o1.add(10,20.8);
	  o1.add(50.9,55);
	  Overloadingdemo_22 o2=new Overloadingdemo_22("Anil");
	  Overloadingdemo_22 o3=new Overloadingdemo_22("Anil",101);
	  Overloadingdemo_22 o4=new Overloadingdemo_22(102,"Anil");

	}

}
