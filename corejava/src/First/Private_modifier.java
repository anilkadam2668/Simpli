package First;

public class Private_modifier {

	public static void main(String[] args) {//only one public class will be there, in a single file, try and see
		empl obj=new empl();
		System.out.println();
		
	}

}
class empl {
	private int empdd;//we can access the empdd within the class only.
	String name;
	 void show() {// if we create a private method, we cant access the method of, outside of that method.
		System.out.println(empdd);
		
		
	}
	 void setEmpid(int empdd) {
		 this.empdd=empdd;
	 }
}
class second{
	void setvalue(){//the method is visible within the package, if we want outside of the package then method should be public. 
		empl obj=new empl();
		//obj.empdd=100;//not allowed empdd is private
		obj.name="123";//if its private then we cant access.
		obj.setEmpid(100);
		
	}
}
