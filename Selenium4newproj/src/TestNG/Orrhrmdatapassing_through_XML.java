package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import handler.Utility;

import org.testng.annotations.Test;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orrhrmdatapassing_through_XML 
{
 @Parameters({"user","pass"})
  @Test
  public void Orangehrm(String username,String password)
  {


	  System.setProperty("webdriver.chrome.driver", "C:\\New folder\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/");  
     driver.findElement(By.name("txtUsername")).sendKeys((username));
	  driver.findElement(By.id("txtPassword")).sendKeys((password));
	  driver.findElement(By.className("button")).click();
	  System.out.println(driver.getTitle());
  }
}
