package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Datadriven_test1 {
	@Test(dataProvider="Testdata1" ,dataProviderClass=Customdata1.class )
	public void f(String un,String psw)
{
	  System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/");  
	  driver.findElement(By.xpath("//input[@name='txtUsername' and @id='txtUsername']")).sendKeys(un);
	  driver.findElement(By.xpath("//input[@name='txtPassword' and @id='txtPassword']")).sendKeys(psw);
	  driver.findElement(By.className("button")).click();
	   

}
}
