package Contolflow_assignments;

public class Multi_dime_array5 {

	public static void main(String[] args) {
		int arr[][]= {{10,20},{30,40},{40,50}};
		System.out.println("number of rows:"+arr.length);
		System.out.println("number of Cols:"+arr[0].length);
		for(int i[]:arr)                     //(int i=0;i<arr.length;i++)
		{
			for (int j:i)                    //(int j=0;j<arr[i].length;j++)
			{
				System.out.print(j+" ");     //(arr[i] [j]+"  ");
			}
			System.out.println(" ");
		} 
	}

	}
