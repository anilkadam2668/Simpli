package collectiondemo;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) 
	{
		HashMap<Integer,String> map=new HashMap<>();
		map.put(101, "Programing");
		map.put(102, "c++");
		map.put(103, "Java");
		map.put(104,"python");
		map.put(105, "C#");
		map.put(103, "Ruby");//previous 103 key value will be updated
		System.out.println(map);
		System.out.println("Total elements are:"+map.size());
		System.out.println("Is my map contains key 103 :"+map.containsKey(103));
		System.out.println(map.get(105));
		System.out.println("Is contains C#: "+map.containsValue("C#"));


	}

}
