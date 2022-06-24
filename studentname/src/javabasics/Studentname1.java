package javabasics;

public class Studentname1 
{
     //data
	int id=101;
	String name="sagar";
	// method
	public void display()
	{
		System.out.println("student id is:"+id);
		System.out.println("student name is:"+name);
		
	}
	public static void main(String[] args) {
		// create object to access all data and method from class
		Studentname1 s1=new Studentname1 ();
		s1.display();
		s1.id=102;//updated id
		System.out.println("New student id is:"+s1.id);
	}

}
