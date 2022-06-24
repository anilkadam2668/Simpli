package controlflow;

public class Interview24 {

	public static void main(String[] args) {
		int n = 5;//rows

	    for (int i = 1; i <= n; ++i) {
	    	//spaces
			for(int j=1; j<=n-i; j++)//Total number rows minus 1,if we consider as 1st row then its 5-1=4 means 4spaces added
			{
				System.out.print(" ");	
			}
	      for (int j = 1; j <= i; ++j) {
	        System.out.print(j+" " );
	      }
	      System.out.println();
	    }
	  }

}
