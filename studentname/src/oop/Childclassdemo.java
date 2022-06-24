package oop;

public class Childclassdemo extends C_Parentclassdemo {
	public void color()
	{
		String C="Yellow";
		System.out.println("Parent color is: "+C);
	}


	public static void main(String[] args) {
		//Child class ref and child class object
		Childclassdemo c1=new Childclassdemo();
		c1.color();//yellow
		//Parent ref and parent class object
		C_Parentclassdemo p1=new C_Parentclassdemo();
		p1.color();//red
		//Parent class ref and child class object
		C_Parentclassdemo p2=new Childclassdemo();
		p2.color();//expected red but is updated as yellow

	}

}
