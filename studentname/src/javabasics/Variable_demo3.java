package javabasics;

public class Variable_demo3
{
	
		//class
	int id1=10;//instance----->only with object
	static String name="KlE";//Static

public void show()
{
	int marks=90;//Local
	System.out.println("Marks are:"+marks);
	System.out.println("id is:"+id1);
	System.out.println("name is:"+name);
	
}
public static void main(String[]args)
{
	String name="swathi";
	//System.out.println(marks);
	//System.out.println(id);
	//System.out.println(name);
	Variable_demo3 D1=new Variable_demo3();
	D1.show();
	D1.id1=55;
	System.out.println(("NAme is:"+name)+("\n new id :"+D1.id1));
	
}
}