package Collections;

import java.util.HashMap;

public class HashMaprunner {

	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<>();
		
		map.put(101, "Programing");
		map.put(102, "c++");
		map.put(103, "Java");
		map.put(104,"python");
		map.put(105, "C#");
		map.put(103, "Ruby");//previous 103 key value will be updated
		map.put(106, "python");// The keys are different but value are same
		System.out.println(map);
		System.out.println("Total elements are:"+map.size());
		System.out.println("Is my map contains key 103 :"+map.containsKey(103));
		System.out.println("map is: "+map.get(105));
		System.out.println("Is contains C#: "+map.containsValue("C#"));
        System.out.println("keys:"+map.keySet());
        System.out.println("values:"+map.values());
        System.out.println("Replace:"+map.replace(102, "perl"));
        System.out.println("Maps:"+map);
        
        HashMap<Student, Integer> students=new  HashMap<>();
        
        Student std1=new Student("ABC",10,7,"phase1");
        Student std2=new Student("ABCd",12,7,"phase1");
        Student std3=new Student("ABCde",13,7,"phase1");
        
        students.put(std1, 1);
        students.put(std2, 1);
        students.put(std3, 1);
        System.out.println(students);
        
        for(Student std:students.keySet()) {
        	System.out.println(std);
        }
       
	}

}
