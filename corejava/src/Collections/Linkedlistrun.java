package Collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Linkedlistrun {

	public static void main(String[] args) {
		Queue <String> animal=new LinkedList<>();//ctrl+shift+o
       //we can also use Queue instead List, then we have to use animal.add("dog")
		
		animal.offer("dog");
		animal.add("cat"); //we can use add also
		animal.offer("Lion");
		
		System.out.println(animal.peek());//First element will display
		System.out.println(animal.remove());//First element will remove
		System.out.println(animal.add("tiger"));//add in last
		System.out.println(animal);
		
		List <String> animal1=new LinkedList<>();//ctrl+shift+o=to import required files
		
		animal1.add("dog1");
		animal1.add("cat1");
		animal1.add("Lion1");
			
		System.out.println("removed element: "+animal1.remove(1));//we have to give index value
		System.out.println("Remaining: "+animal1);		
		

		
		LinkedList <String> animal2=new LinkedList<>();//searching takes time, but insertion and deletion is fast compare to arraylist
		
		animal2.add("dog2");//it has offer method also
		animal2.add("cat2");
		animal2.offer("Lion2");
		System.out.println(animal2.getFirst());//This method is availabel in only linkedlist only
		System.out.println(animal2.getLast());////This method is availabel in only linkedlist only
		System.out.println(animal2.poll());//returns and remove the element at head or 1st element of queue
		System.out.println(animal2);
	}

	
}
