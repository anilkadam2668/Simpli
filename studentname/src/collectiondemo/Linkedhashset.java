package collectiondemo;

import java.util.LinkedHashSet;

public class Linkedhashset {

	public static void main(String[] args) 
	{
		LinkedHashSet<Integer> lh=new LinkedHashSet<>();//displays always unique values
		lh.add(100);
		lh.add(300);
		lh.add(500);
		lh.add(200);
		lh.add(600);
		lh.add(500);
		System.out.println(lh);
		
	}

}
