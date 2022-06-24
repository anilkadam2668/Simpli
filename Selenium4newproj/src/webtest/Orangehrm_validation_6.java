package webtest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrm_validation_6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//User name
		WebElement un=driver.findElement(By.id("txtUsername"));
		WebElement logo=driver.findElement(By.id("divLogo"));
		System.out.println("is displayed on home page:"+un.isDisplayed());
		System.out.println("Is Un enabled "+un.isEnabled());
		System.out.println("Is visible:"+logo.isDisplayed());
		//to perform operation
		un.sendKeys("admin");
		
		//password	
		WebElement psw=driver.findElement(By.name("txtPassword"));
		if(psw.isDisplayed()&&psw.isEnabled());
		{
			psw.sendKeys("admin123");
		}
		
		//login button
		WebElement btn=driver.findElement(By.className("button"));
		if(btn.isEnabled());
		{
			btn.click();
		}
		
		//logout
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.xpath("//div[@id='welcome-menu']//li//a[text()='Logout']")).click();


	}
}
