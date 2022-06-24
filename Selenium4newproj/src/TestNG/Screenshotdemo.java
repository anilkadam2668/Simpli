package TestNG;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Screenshotdemo
{
  @Test
  public void Capture() throws IOException 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/");  
	  driver.findElement(By.xpath("//input[@name='txtUsername' and @id='txtUsername']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@name='txtPassword' and @id='txtPassword']")).sendKeys("admin123");
	  
	  //TakesScreenshot ts=(TakesScreenshot)driver;
	  //File temp=ts.getScreenshotAs(OutputType.FILE);
	  //File dest=new File(System.getProperty("user.dir")+"\\Screenshots\\test1.png");
	  //Above 3 lines in one line                                                                                                                       
	  FileHandler.copy(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE), new File(System.getProperty("user.dir")+"\\Screenshots\\"+System.currentTimeMillis()+".png"));
	 
	  //driver.findElement(By.className("button")).click();
	  //String actual=driver.getCurrentUrl();
  }
}
