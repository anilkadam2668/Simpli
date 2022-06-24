package Contolflow_assignments;

public class Array_demo {

	public static void main(String[] args) {
		//declare array
		int arr[]=new int[5];
		//initilize array
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		//System.out.println(arr[3]);
        for(int i=4; i<arr.length;i++)
        {
        	System.out.println(arr[i]);
        }
        System.out.println(arr.length);
	}
}
