package TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Propertyfiledemo {
  @Test
  public void dataread() throws IOException
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\New folder\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  File f1=new File(System.getProperty("C:\\Users\\Anil Kadam\\Desktop\\Java\\Selenium4newproj\\dummy.properties"));//1
	  FileInputStream fs=new FileInputStream(f1);//2
	  Properties p1=new Properties();//3
	  p1.load(fs);//4 the 1,2,3,4 are the main lines for to access the properties file.
	  
	  System.out.println("url is: "+p1.getProperty("url")); 
	  System.out.println("browser name is:"+p1.getProperty("bname"));
	  System.out.println("brwser version is:"+p1.getProperty("bversion"));
	  System.out.println("title is: "+driver.getTitle());
  }
} 
