package controlflow;

public class Interview2 {

	public static void main(String[] args) {
		for(int r=4; r>=1; r--)
		{
			for(int c=1; c<=r; c++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
			if (r==-1)
			{
				System.out.println("program ends");
				//break;
			}
		}
		
	} 
	

}
 