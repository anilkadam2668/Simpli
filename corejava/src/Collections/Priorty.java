package Collections;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Priorty {

	public static void main(String[] args) {
		PriorityQueue<Integer> numbers=new PriorityQueue<Integer>();
        numbers.add(4);
        numbers.add(5);
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(2);
        numbers.add(0);
        numbers.add(0);
        
        System.out.println(numbers);//head element only given priority
		System.out.println(numbers.peek());
		System.out.println(numbers.remove());
		System.out.println(numbers);
		
		PriorityQueue<String> cities=new PriorityQueue<String>();
		cities.add("Agara");
		cities.add("agara");
		cities.add("DwD");
		cities.add("HUB");
		cities.add("MUB");
		
		System.out.println(cities);
}
}

