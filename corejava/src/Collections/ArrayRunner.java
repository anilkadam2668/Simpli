package Collections;

public class ArrayRunner {

	public static void main(String[] args) {
		int student1=90;
		int student2=50;
		int student3=60;
		
		int  arr[]= new int [5];// we can write like this too
	int arr1[]= {90,50};//we can't increase or change, the size of array its fixed
		arr[0]=90;
		arr[1]=50;
		arr[2]=40;
		
		System.out.println(arr[0]+"\n");
		
		System.out.println("loop starts"+"\n");
		
		for(int index=0; index < arr.length; index++) {//the length always should be less < than sign, not <= 
			System.out.println(arr[index]);
		}
		System.out.println("loop ends");
		
		System.out.println("loop starts");
		
		int age[]= {20,30,40,50};//Length is 4 and index will be 3.
		System.out.println(age.length);
		for(int index=0; index < age.length; index++) {//the length always should be less < than sign, not <= 
			System.out.println(age[index]);
		}
		System.out.println("loop ends");
		}

}

