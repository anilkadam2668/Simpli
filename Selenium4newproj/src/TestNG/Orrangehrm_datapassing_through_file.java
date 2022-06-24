package TestNG;
import org.testng.annotations.Test;

import handler.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
public class Orrangehrm_datapassing_through_file 
{
  @Test
  public void orrangehrm() throws IOException
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\New folder\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  File f1=new File(System.getProperty("user.dir")+"\\data.properties");
	  FileInputStream fs=new FileInputStream(f1);
	  Properties p1=new Properties();//
	  p1.load(fs);
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  System.out.println("url is:"+p1.getProperty("un"));
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 // Utility.Screenshot(driver);
      driver.findElement(By.id("txtUsername")).sendKeys(p1.getProperty("user"));
      Utility.Screenshot(driver);
	  driver.findElement(By.id("txtPassword")).sendKeys(p1.getProperty("password"));
	  Utility.Screenshot(driver);
	  driver.findElement(By.className("button")).click();
	  
	  
	  
	  
  }
}
