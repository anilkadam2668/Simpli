package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datadriventest 
{   

	@Test(dataProvider="Testdata1" ,dataProviderClass= Customdata1.class )
	public void f(Object un, Object psw)
	{
		System.out.println("user name is:"+ un);
		System.out.println("Password is:"+psw);
	}
	
	@Test(dataProvider="Testdata1", enabled=false)
	public void f2(Object un, Object psw)
	{
		System.out.println(un+" "+psw);
	
	}
}
