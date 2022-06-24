package controlflow;

public class Interview5 {

	public static void main(String[] args) 
	{
		int k=1;
		for(int r=1; r<=4; r++)
		{
		for(int c=1; c<=r; c++)//if c<=4 then serial [1,2,3,4 /t 4,5,6,7,8.....will come]
			{
				System.out.print(k+" ");
				k++;
			}System.out.println();
	}

	}

}
