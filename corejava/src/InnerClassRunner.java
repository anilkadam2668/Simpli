
class  Outer {
	private int x=20;
	
	class Inner{
		void show() {
			System.out.println("Value of x: "+x);
			
		}
	}

}

public class InnerClassRunner{
	public static void main(String[]args) {
		Outer obj =new Outer();
		Outer.Inner in=obj.new Inner();
		in.show();
	}
}