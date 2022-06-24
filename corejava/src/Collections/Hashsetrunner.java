package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class Hashsetrunner {

	public static void main(String[] args) {
		HashSet<Student> students=new HashSet<>();
		
		Student std1=new Student("abc",20,1,"phas2");
		System.out.println("Hashcode: "+std1.hashcode());
	    students.add(std1);//without this down side is will be null
	    //System.out.println(std1);//internally compiler calls for tostring method
	    
	    
	    Student std2=new Student("ABC",10,7,"phase1");
	    students.add(std2);//it creates hash code
	    students.add(std2);//hash set don't duplicate.
	    students.add(std1);//hash set don't duplicate.
	    
        Iterator<Student>it=students.iterator();
		
		while(it.hasNext()) {
			//System.out.println(it.next());
//			Student std=it.next();
//			System.out.println(std);
//			System.out.println(std.getName());//we can use std1 also
//			System.out.println(std.getAge());
//			System.out.println(std.getCourse());
//			System.out.println(std.getRoll_no());
			System.out.println(it.next());//after to string method in student class
		}
		 

	}

}
