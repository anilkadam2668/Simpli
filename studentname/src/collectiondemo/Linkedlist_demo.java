package collectiondemo;

import java.util.LinkedList;

public class Linkedlist_demo {

	public static void main(String[] args) 
	{
	
	 LinkedList<Integer> ls=new LinkedList<>();//display all values from list
	 ls.add(10);
	 ls.add(30); 
	 ls.add(50);
	 ls.add(70);
	 ls.add(90);
	 ls.add(10);
	 ls.add(0,null);
	 System.out.println(ls);
	 ls.addFirst(35);
	 ls.addLast(85);
	 System.out.println(ls);
	 System.out.println();
	 System.out.println("First element: "+ls.getFirst());
	 System.out.println("Last element:"+ ls.getLast());
	 System.out.println("Total elements are:"+ls.size());
	 System.out.println("is my list contains 35:"+ls.contains(35));
	}

}
