package TestNG;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Tedemo_multi_browser {
	@Test
	public void dataread() throws IOException
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\New folder\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  File f1=new File(System.getProperty("C:\\Users\\Anil Kadam\\Desktop\\Java\\Selenium4newproj\\dummy.properties"));//1
		  FileInputStream fs=new FileInputStream(f1);//2
		  Properties p1=new Properties();//3
		  p1.load(fs);//4 the 1,2,3,4 are the main lines for to access the properties file.
	  }
	public void Chromecast()
	{
	 System.setProperty("webdriver.chrome.driver", "C:\\New folder\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("http://www.google.com");
	 System.out.println("Title is : "+driver.getTitle());
	}
	
	@Test
	public void edgedriver()
	{
		System.setProperty("webdriver.edge.driver", "C:\\New folder\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("http://www.google.com");
		System.out.println("Title is:"+driver.getTitle());
	}
}
