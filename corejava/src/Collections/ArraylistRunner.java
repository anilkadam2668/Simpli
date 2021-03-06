package Collections;
import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistRunner {

	public static void main(String[] args) {
		//Collection is v imp regarding interview
		
		//array list allows to create resizable arrays
		//it can adjust their capacity when we add or remove elements, also called dynamic arrays.
		
		ArrayList<Integer> arraylist=new ArrayList<Integer>();//works slow compare too linkedlist, because  of insertion and deletion is slow. 
	    ArrayList<Integer> arraylist1=new ArrayList<>();// we can write like this also
		arraylist.add(12);
		arraylist.add(20);
		arraylist.add(25);
		arraylist.add(55);
		
		arraylist.set(3, 66);
		System.out.println("size is: "+arraylist.size());

		System.out.println(arraylist);
		
		arraylist.remove(1);
		System.out.println(arraylist);
		arraylist.add(70);
		
		for (int i=0; i<arraylist.hashCode(); i++) {
			System.out.println(arraylist.get(i));
		}
		
		Iterator it= arraylist.iterator();//its interface
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
