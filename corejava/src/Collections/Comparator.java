package Collections;
import java.util.PriorityQueue;

public class Comparator {

	public static void main(String[] args) {
		/*
		 * NumberComparator obj=new NumberComparator(); PriorityQueue<Integer>
		 * numbers=new PriorityQueue<Integer>(new NumberComparator());//we can call
		 * above (obj) object also PriorityQueue<Integer> numbers1=new
		 * PriorityQueue<Integer>(obj);//like this, both are valid, above and this one
		 * numbers.add(4); numbers.add(5); numbers.add(3); numbers.add(2);
		 * numbers.add(6); numbers.add(2); numbers.add(1); numbers.add(0);
		 */
        
        //System.out.println(numbers);//head element only given priority
        //[0, 1, 2, 3, 6, 4, 2, 5, 20]
//		System.out.println(numbers.peek());
//		System.out.println(numbers.remove());
//		System.out.println(numbers);		
	}

}
/*
 * class NumberComparator implements Comparator<Integer>{//comparator used to
 * provide ordering
 * 
 * 
 * public int compare(Integer number1, Integer number2) {
 * System.out.println("Comparator called"); if (number1>number2) { return
 * -1;//if here 1 it will be ascending order } else if (number1<number2) return
 * 1;//if its -1 it will be ascending order else return 0;
 * 
 * }
 * 
 * }
 */