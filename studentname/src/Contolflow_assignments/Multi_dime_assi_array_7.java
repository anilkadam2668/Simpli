package Contolflow_assignments;

public class Multi_dime_assi_array_7 {

	public static void main(String[] args) {
Object arr[][]= {{"admin","admin123",100},{"tester1","tester123",120},{"tester2","tester123",115}};
System.out.println("lenth of array"+arr.length);
System.out.println("number of rows:"+arr.length);
System.out.println("number of Cols:"+arr[0].length);
for(Object i[]:arr)
{
	for(Object j:i)
	{
		System.out.print(j+" ");
	}
	System.out.println(" ");
}

}

}
