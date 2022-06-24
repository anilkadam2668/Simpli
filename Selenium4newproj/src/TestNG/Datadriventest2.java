package TestNG;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Datadriventest2 {
	@Test(dataProvider="Testdata2" ,dataProviderClass= Customdata2_Exel.class )
	public void f(String username, String password)

{
	  System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/");  
	  driver.findElement(By.xpath("//input[@name='txtUsername' and @id='txtUsername']")).sendKeys(username);
	  driver.findElement(By.xpath("//input[@name='txtPassword' and @id='txtPassword']")).sendKeys(password);
	  driver.findElement(By.className("button")).click();
	  String actual=driver.getCurrentUrl();
	  String expected="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
	  Assert.assertEquals(actual, expected);
}
}