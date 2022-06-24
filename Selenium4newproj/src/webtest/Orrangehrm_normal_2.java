package webtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orrangehrm_normal_2 {

	public static void main(String[] args) throws InterruptedException {////Please read automation 7pm before starting webdriver exercise
		System.setProperty("webdriver.chrome.driver", "C:\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		/*WebElement un=driver.findElement(By.name("txtUsername"));
		un.sendKeys("admin");
		WebElement psw=driver.findElement(By.id("txtPassword"));
		psw.sendKeys("admin123");
	    WebElement lgn=driver.findElement(By.name("Submit"));
	    lgn.click();
	    Thread.sleep(30000);
	    driver.close();*/
		
		//In simple ways
		driver.findElement(By.name("txtUsername")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.className("button")).click();
		
	    
	}

}
