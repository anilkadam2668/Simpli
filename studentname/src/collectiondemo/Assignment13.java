package collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;

public class Assignment13 {

	public static void main(String[] args) 
	{
	 //String al[]= {"Anil","Kartik","Sanj"};
	 ArrayList<String> al=new ArrayList<>();
	 System.out.println(al.isEmpty());
	 al.add("anil");
	 al.add("Sunil");
	 al.add("Abhi");
	 al.add("Sanu");
	 al.add("Abhi");
	 ArrayList<String> as=al;
	 al.add(0, "Abd");
	 
	 Iterator<String> lst=al.iterator();
	 while(lst.hasNext())
	 {
		 System.out.println(lst.next());
	 }
	
	 al.remove(0);
	 System.out.println(as);
	 System.out.println(al.isEmpty());
	 System.out.println(al.size());
	 al.clear();
	 System.out.println((al));

	}

}
