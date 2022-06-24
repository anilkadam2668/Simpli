package javabasics;

public class Returnkey_10_2 
{

	public void add(int a,int b){
		System.out.println("Addition is:"+(a+b));}
	public void sub(int c,int d) {
		System.out.println("Subtraction is:"+(c-d));}
	public void mul(int e,int f) {
		System.out.println("Multiplication is:"+(e*f));}
	public void div(int g,int h) {
		System.out.println("Division is:"+(g/h));}
	public void mod(int j,int k) {
		System.out.println("Modular is:"+(j%k));}
	public static void main(String[] args)
	{Returnkey_10_2 r1=new Returnkey_10_2();
	r1.add(10,20);r1.sub(25, 5);r1.mul(5, 5);r1.div(50, 5);r1.mod(50, 3);}
}
