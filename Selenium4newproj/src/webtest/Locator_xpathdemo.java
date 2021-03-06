package webtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_xpathdemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\New folder\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//User name
		//driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("admin");
		
		//user name contains method
		driver.findElement(By.xpath("//input[contains@id,'txtuser')]")).sendKeys("admin");
				
		//user name with operator
		driver.findElement(By.xpath("input[@id='txtUsername' and @name='txtUsername']")).sendKeys("admin");
		
		//Password
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		
		//password with start-with method
		//driver.findElement(By.xpath("//input[starts-with(@id,'txtpass')]")).sendKeys("admin123");
		
		//password with or operator
		driver.findElement(By.xpath("input[@id='txtUsername' or @name='txtUsername']")).sendKeys("admin123");
		
		//Login
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		
		//link
		//driver.findElement(By.xpath("//a[text()='Forgot your passwor?']")).click();
		
		
		

	}

}
