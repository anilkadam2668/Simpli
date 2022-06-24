package webtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_xpath2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\New folder\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//link
		driver.findElement(By.xpath("//a[text()='Forgot your passwor?']")).click();
		
		//user name
		driver.findElement(By.xpath("//input[contains@id,'txtuser')]")).sendKeys("admin");
		
		
	}

}
