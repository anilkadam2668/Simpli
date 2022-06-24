package javabasics;

public class Returndummyy {
	public void add(int a, int b) {
		System.out.println("Addition is:"+(a+b));
		//return ;
		
	}
	public void mul(int c, int d) {
		System.out.println("Mul is:"+(c*d));
		return;
	}
	public void div(int a, int b) {
		System.out.println("Addition is:"+(a/b));
		return;
	}

	public static void main(String[] args) {
		Returndummyy r2=new Returndummyy();
		//Returnkey_10_2 r1=new Returnkey_10_2();
		r2.add(10, 10); r2.mul(55, 2);
		}

}
