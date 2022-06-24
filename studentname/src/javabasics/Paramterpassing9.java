package javabasics;

public class Paramterpassing9 {
public void show(int id, String name) //this is instance id=10
	{
		//String name="kanchan";//local
		System.out.println("name is:" +name);
		System.out.println("id is:" +id);
	}
public String display(String name) //name=anil
{
	return name;//this return output to calling function display
}
public static void main(String[] args)
{
	Paramterpassing9 p1=new Paramterpassing9();
	//p1.show();// Without parameter
	p1.show(10,"Anil");//with parameter
	//p1.display("anil");
	System.out.println(p1.display("Abhi"));// we can use single command to display o/p
	String ret=p1.display("Amogh");//we can also do by calling variable and println
	System.out.println(ret);
    
}

}
