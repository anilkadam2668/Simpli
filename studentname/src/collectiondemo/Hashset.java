package collectiondemo;

import java.util.HashSet;

public class Hashset 
{
	
	//Hash set is class implements set interface
	//Underline ds follow is hash table

	public static void main(String[] args)//Internal code error is there util packacge
	{
  	 
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(20);
		hs.add(10);
		hs.add(30);
		hs.add(40);
		hs.add(60);
		hs.add(10);
		System.out.println(hs);
		 System.out.println("No of element: "+hs.size());//cant get index values.
		 System.out.println("Last element:"+ hs.isEmpty());
		 System.out.println("Total elements are:"+hs.size());
		 System.out.println("is my list contains 35:"+hs.contains(20));

	}

}
