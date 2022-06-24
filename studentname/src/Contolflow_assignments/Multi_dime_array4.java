package Contolflow_assignments;

public class Multi_dime_array4 {

	public static void main(String[] args) {
		
		int arr[][]=new int[2][2];
		arr[0][0]=10;
		arr[0][1]=20;
		arr[1][0]=30;
	    arr[1][1]=40;
		System.out.println("number of rows:"+arr.length);
		System.out.println("number of Cols:"+arr[0].length);
		for(int i[] :arr)                      //(int i=0;i<arr.length;i++)
		{
			for(int j:i)                       //(j=0;j<arr[i].length;j++)
			{
			 System.out.print(j+" ");          //(arr[i] [j]+"  ");}
			                                    //System.out.println(" ")
			}
			System.out.println();
			
		}
		}
}
