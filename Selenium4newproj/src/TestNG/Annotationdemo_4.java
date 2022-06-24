package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotationdemo_4 {
  @Test
  public void createanaccount()
  {
	System.out.println("user will create an account");  
  }
  @Test
  public void Login()
  {
	  System.out.println("This is login tst");  
  }
  @BeforeMethod()
  public void bmethod()
  {
	  System.out.println("Welcome to applicatiom");  
  }
  @AfterMethod()
  public void amethod()
  {
	  System.out.println("Thank you");  
  }
  @BeforeClass()
  public void bclass()
  {
	  System.out.println("It will call before method");
  }
  @AfterClass()
  public void aclass()
  {
	  System.out.println("This will call after last method");  
  }
  @BeforeTest()
  public void btest()
  {
	  System.out.println("It will call before class");  
  }
  @AfterTest()
  public void atest()
  {
	  System.out.println("It will call after class");  
  }
  @BeforeSuite()
  public void bsuite()
  {
	  System.out.println("It will call before test");  
  }
  @AfterSuite()
  public void asuite()
  {
	  System.out.println("It will call after test");  
  }
}
