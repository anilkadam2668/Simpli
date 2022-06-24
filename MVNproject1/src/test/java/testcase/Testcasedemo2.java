package testcase;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcasedemo2 {
  @Test
  public void Chrometest()
  {
	WebDriverManager.chromedriver().setup();  
	WebDriver driver=new  ChromeDriver();
	driver.get("https://google.com");
	System.out.println("Title is:"+driver.getTitle());
	driver.close();
  }
}
