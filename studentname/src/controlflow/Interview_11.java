package controlflow;

public class Interview_11 {

	public static void main(String[] args) {
		for(int i=5; i<=5; i--)     //i=1; i<=5 i++
		{
		    for(int j=1; j<=i; j++) //j=1; j<=5-i+1; j++
			{
				System.out.print(j+" ");
			}
			System.out.println();
			if (i==1)             //for side program its not required.
			{
				System.out.println("program ends");
				break;
			}
		}
		

	}

}
