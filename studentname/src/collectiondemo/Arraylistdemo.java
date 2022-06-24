package collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistdemo {

	public static void main(String[] args) 
	{
   //Generic 1.type safe 2.type casting not rquired
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		for(int i:al)
		{
			System.out.println(i);
		}
		Iterator<Integer> an=al.iterator();
		int b=al.get(0);
		System.out.println(" its: "+b);
		System.out.println(al);
		
		Iterator<Integer> list=al.iterator();
		while(list.hasNext())
		{
			System.out.println(list.next());
		}
		
		
		/*System.out.println("Is m list is empty?: "+al.isEmpty());
		System.out.println("Total elements from list: "+al.size());
		System.out.println("is list my contains 50: "+al.contains(50));
		al.add(0,100);
		System.out.println(al);
		al.remove(0);
		System.out.println("Final list:"+al);
		al.clear();
		System.out.println("Final list after clear:"+al.clear());*/
		
		
		
		
		
		//Non generic way 1.not type safe 2. To retrieve element it need type casting
		//List 1s=new ArrayList();
		/*ArrayList as=new ArrayList();
		as.add(100);
		as.add("sarang");
		as.add(56.89);
		as.add('a');
		as.add(100);
		
		int a=(int) as.get(0);
		System.out.println(a);*/
		
		

	}

}
