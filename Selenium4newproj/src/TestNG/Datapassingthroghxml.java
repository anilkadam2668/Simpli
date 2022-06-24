package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Datapassingthroghxml 
{@Parameters({"un","psw"})
  @Test
  public void Testdata(String un, String psw)
  {
	  System.out.println("user name is:"+un);
	  System.out.println("psw is:"+psw);
  }
}
