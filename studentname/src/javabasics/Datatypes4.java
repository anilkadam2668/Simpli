package javabasics;

public class Datatypes4
{

	public static void main(String[]args)
	{
//	boolean ---1bit--=True=1 & False=0;
//	boolean status=true;
//	System.out.println("Boolean data type of data:"+status);
//	status=false;
//	System.out.println("Boolean data type of data:"+status);
//	System.out.println("======================================");
//	
	//Integral
	//Character---Single character-----2byte
	char c1='A';
	System.out.println("character type of dat:"+c1);
	char c2='$';//Special character also
	System.out.println("Character data type:"+c2);
	char c3=65;
	System.out.println("ASCII data type:"+c3);//Check in google for ascii table
	System.out.println("=======================================");
	
	//Integer
	//byte 1byte -128 to 127// one byte=8bits
	byte b1=-128;
	System.out.println("Byte data is:"+b1);
	byte b2=127;
	System.out.println("Byte data is:"+b2);
    byte b3=108;
    System.out.println("Byte data is:"+b3);
    System.out.println("=======================================");
    
    //short 2 byte
    //byte 2byte -32768 to 32767
    short s1=32000;
    System.out.println("short data is:"+s1);
    System.out.println("========================================");
    
    //int 4byte
    int i1=50000;
    System.out.println("int data is:"+i1);
    System.out.println("=====================================");
    
    //long byte
    long l1=9999999999l;
    System.out.println("long data is:"+l1);
    
    System.out.println("======================================");
    
    //floating point---> float 4byte, double(default) 8byte
    double d1=89.56;
    System.out.println("double data is:"+d1);
    
    float f1=67.89f;
    System.out.println("float data is:"+f1);

    System.out.println("==========================================");
    
    //Type casting
    //1.implicit(automatic)
    
    int x1=100;
    float f2=x1;
    System.out.println("int data to float is:"+f2);
    
    //char c4=97;//ASCII
    char c4='a';//character
    int x4=c4;
    System.out.println("char to int(ascii):"+x4);
    
    //int to long
    long l2=x1;
    System.out.println("int to long:"+l2);
    
    double d2=l2;
    System.out.println("long to double:"+d2);
    
    //Explicit--->casting operator(type)
    
    float f3=(float) d2;//x1=100
    System.out.println("double to float:"+f3);
    
    int x3=(int) d2;
    System.out.println("double to int:"+x3);
    
    char c5=(char) x3;
    System.out.println("int to char:"+ c5);
    
    
    
    
    
    
      
    
    
	
}
}
