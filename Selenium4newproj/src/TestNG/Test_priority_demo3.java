package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Test_priority_demo3 
{
       @Test(priority=1,description="Test1")
       public void one()
       {
    	   System.out.println("This is first test case");
       }
       @Test(priority=2,description="Test2",invocationCount=2)//invocation count=2 is displays two times s.o.p o/p.
       public void two()
       {
    	   System.out.println("This is second test case");
       }
       @Test(priority=3,description="Test3",enabled=true)//if its false then it will skip this execution.
       public void three()
       {
    	   System.out.println("This is third test case");
       }
}
