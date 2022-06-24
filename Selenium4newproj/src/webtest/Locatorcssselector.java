package webtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorcssselector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\New folder\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.cssSelector("#txtUsername")).sendKeys("admin");
		Thread.sleep(3000);
		//Tag name with id
		driver.findElement(By.cssSelector("input#txtUsername")); //.clear();
		
		//Password tagname with attribute 
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("admin123");
		// Dont use double qoutes in inspect option to see the locator
		
		//Button tagname with class
		//driver.findElement(By.cssSelector("input.button")).click();
		driver.findElement(By.cssSelector("input.button[type='submit']")).click();
	}

}
