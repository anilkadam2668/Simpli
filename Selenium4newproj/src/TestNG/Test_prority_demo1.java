package TestNG;

import org.testng.annotations.Test;

import graphql.Assert;

public class Test_prority_demo1 
{
	  @Test(priority=1)
      public void one() 
      {
   	   System.out.println("This is first test case");
   	   //Assert.assertTrue(false);//if its true no test case failure occurs its false then vice_versa
      }
      @Test(priority=2, dependsOnMethods ="one")
      public void two()
      {
   	   System.out.println("This is second test case");
      }
      @Test(priority=3)
      public void three()
      {
   	   System.out.println("This is third test case");
      }

	
}
