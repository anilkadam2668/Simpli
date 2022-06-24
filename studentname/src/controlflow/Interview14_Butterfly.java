package controlflow;

public class Interview14_Butterfly {

	public static void main(String[] args) {
// Upper half		
		for(int i=1; i<=4; i++)
		{ // First part
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			//spaces
			int spaces=2*(4-i);
			for(int j=1; j<=spaces; j++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		//lower half
		for(int i=4; i>=1; i--)
		{ // First part
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			//spaces
			int spaces=2*(4-i);
			for(int j=1; j<=spaces; j++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();

	}
	}

}
