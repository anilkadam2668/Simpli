package package1;

import First.Animalinterface;

public class Dog2 implements Animalinterface {
	
	//abstract method
	public void sound() {
		System.out.println("dog barks");
	}
    //non abstract or concrete method
	public void eat() { //we can override the main method also
		System.out.println("dog eats");

}
}
