package Collections;

public class Student {
	
	String name;
	int age;
	int roll_no;
	String Course;

	
	public Student(String name, int age, int roll_no, String course) {//you will get this from right click and generate constructor using fields
		super();
		this.name = name;
		this.age = age;
		this.roll_no = roll_no;
		Course = course;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public int getRoll_no() {
		return roll_no;
	}



	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}



	public String getCourse() {
		return Course;
	}



	public void setCourse(String course) {
		Course = course;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}



	//we have parent class of all the objects called as object
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", roll_no=" + roll_no + ", Course=" + Course + "]";
	}
	
	public int hashcode() {
		System.out.println("hashcode is called");
		return this.roll_no;
	}
	
	public boolean equals(Object obj) {
		Student other=(Student)obj;
		return other.roll_no==other.roll_no;
		
	}

	
	
	
	
	
	
	
}
