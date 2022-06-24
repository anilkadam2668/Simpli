package controlflow;

public class Interview_26 {

	public static void main(String[] args) {
		int n=5;
		for (int row=0; row<2*n; row++)//row=10
		{
			int totalcolsinrow=row>n ? 2*n-row: row;//?==then //int pinsToTake = (min >= 2) ? 2 : 1;
			for(int col=0; col<totalcolsinrow; col++)         //if((min >= 2) {
			{                                                 //someval =2;
				System.out.print("* ");                       //} else {
			}                                                 //someval =1}
			System.out.println();
		}

	}

}
