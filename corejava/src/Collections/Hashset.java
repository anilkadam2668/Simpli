package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) {
		HashSet<String> cities=new HashSet<>();
		cities.add("dwd");
		cities.add("dwd");
		cities.add("hub");
		cities.add("nav");
		cities.add("sat");
		System.out.println(cities);
		
		Iterator<String>it=cities.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}
