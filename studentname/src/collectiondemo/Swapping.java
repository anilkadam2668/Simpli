package collectiondemo;
import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter a number");
		int b=sc.nextInt();
		int c=a;
		a=b;
		b=c;
		System.out.println(a);
		System.out.println(b);

	}

}
