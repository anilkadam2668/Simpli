package javabasics;

public class Constructordemo6 
{
   //instance
	int id=10;
	String name="anil";
	
	//public Constructordemo()
	{
		System.out.println(id);
		System.out.println(name);
	}
	Constructordemo6(int a, String b)//Local a=11, b=pooja
	{
		System.out.println(a);//you can use id instead of a
		System.out.println(b);//you can use name instead of b
	}
	public static void main(String[] args)
	{
		 //Calling
		//Constructordemo c1=new Constructordemo();
		Constructordemo6 c2=new Constructordemo6(11,"pooja");//parameterize
		}
}

