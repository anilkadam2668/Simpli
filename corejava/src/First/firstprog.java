package First;

public class firstprog {

	public static void main(String[] args) {
		Student st1=new Student(); //Creating student object
		st1.name="Anil";
		System.out.println(st1.name); //----accessing the property
		st1.Attendsession();  //----calling the class method
		st1.sum(10, 20);
		System.out.println("Total is: "+st1.sum(10, 20));
		
		Student st2=new Student();
		st2.name="Abhi";
		System.out.println(st2.name);
		System.out.println("Total is: "+st2.sum(10, 5));
		
		Student st3=new Student("abd", 25,"java");
		System.out.println(st3.name);
		
		}
}
class Student{
	String name; //Properties or data
	int rollNo;
	String courseenrolled;
	
	//constructor-->have same name as the class name
	//no return type, and also not even void
// Two time output generated on 2 occasions, 1st while object creation & 2nd while calling constructor, have same name as the class name
	Student(){ 
		System.out.println("Constructor called"); 
		}
	 
	void Attendsession(){ //Behaviour
		System.out.println("the attend session method will call");
		//open webex
		//log in to webex
		//join the course you have enroll
	}
		
	void leavsession() {  //Behaviour
		//type sysout then ctrl+space to get System.out.println();
		
	}
	int sum(int x, int y) {   //Behaviour
//		int x=10;
//		int y=20;
		
		int z=x+y;
		return z;
		//System.out.println("total is: "+ z);
		
	}
	//parameterized constructor
	 Student(String Name, int roll, String course){
		name=Name;
		rollNo=roll;
		courseenrolled=course;
		
	}
}