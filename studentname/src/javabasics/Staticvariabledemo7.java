package javabasics;

public class Staticvariabledemo7 
{
 //int count=1;//instance
    static int count=1; //if there is no static separate memory will create for each variable.
	Staticvariabledemo7()
	{
		System.out.println(count);
		count++;//count=count+1
	}

public static void main(String[] args)
{
	Staticvariabledemo7 s1=new Staticvariabledemo7();
	Staticvariabledemo7 s2=new Staticvariabledemo7();
	Staticvariabledemo7 s3=new Staticvariabledemo7();
	Staticvariabledemo7 s4=new Staticvariabledemo7();
	Staticvariabledemo7 s5=new Staticvariabledemo7();
}

}

