package controlflow;

public class Interview25 {

	public static void main(String[] args) {
		int n=5,i,j;
		for(i=5; i>=1; i--)
		{//spaces
			for(j=1; j<=n-i; j++)// Total number rows minus 1,if we consider as 1st row then its 5-1=4 means 4spaces added
			{
				System.out.print(" ");	
			}
			for (j=1; j<=i; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
