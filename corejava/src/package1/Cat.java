package package1;

import First.Animal;

public class Cat extends Animal {
	
	public void sound() {//its method overriding, done in parent and child class
		System.out.println("cat meow");
	}
	
	public void eat() { //we can override the main method also
		System.out.println("cat eats");
	}

}
