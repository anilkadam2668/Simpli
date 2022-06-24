package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertdemo {
  @Test
  public void hardassert() 
  {
	  String actual="hi its ak";
	  String expected="hii";
	  
	 // Assert.assertEquals(actual, expected);
	// Assert.assertTrue(actual.equals(expected));
	// Assert.assertTrue(actual.contains(expected));//needs true condition in expected condition
	  Assert.assertFalse(actual.contains(expected));//needs false result in expected condition
	  System.out.println("Hard assert demo completed");
  }
  
  
  	@Test
  	public void softassert()
  	{
  		SoftAssert s1=new SoftAssert();
  		String actual="Welcome all";
  		String expected="Welcome ";
  		
  		s1.assertEquals(actual, expected);
  		s1.assertTrue(actual.contains(expected));//same as above
  		s1.assertFalse(actual.contains(expected));//same as above
  		System.out.println("Soft Assert demo completed");//it will pass test case if below command not used in case expected is diffrent string
  		s1.assertAll();
  	}
  
  
}
