
package Contolflow_assignments;

public class Multi_dime_array_6 {

	public static void main(String[] args) {
		int arr[][]= {{10,20,30},{30,40},{40,50}};
		System.out.println("number of rows:"+arr.length);
		System.out.println("number of Cols:"+arr[0].length);
        for(int i[]:arr)
        {
        	for(int j:i)
        	{
    			System.out.print(j+" ");

        	}
			System.out.println();

        }
	}

}
