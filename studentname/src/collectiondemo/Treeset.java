package collectiondemo;

import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) 
	{
		TreeSet<Integer> ts=new TreeSet<>();//unique values with sequential manner.
		ts.add(30);
		ts.add(70);
		ts.add(80);
		ts.add(40);
		ts.add(90);
		ts.add(50);
		ts.add(10);
		ts.add(20);
		
		System.out.println(ts);
		System.out.println(ts.descendingSet());
		System.out.println("head set: "+ts.headSet(50));//less than 50 values dispalyed
		System.out.println("tailset: "+ts.tailSet(50));//>50 displayed
		System.out.println("subset: "+ts.subSet(30, 90));
		System.out.println(ts.first());//10
		System.out.println(ts.last());//90

	}

}
