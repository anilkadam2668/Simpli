package oop;

public class Super_child_ss1 extends Super_parent_ss1
{
  String name="Anil";
  public void show()
  {
	  super.accept();////to use immediate parent class method.
	  System.out.println(super.id);//to use immediate parent variable.
	  System.out.println("This is show from the child: "+name); 
	  }
 Super_child_ss1()//by creating class and writing super and then we can access parent class
  {
	  super();
  }

	public static void main(String[] args) {
		Super_child_ss1 s1=new Super_child_ss1();
		s1.show();

	}

}
 