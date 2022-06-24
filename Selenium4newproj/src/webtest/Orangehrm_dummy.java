package webtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrm_dummy {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\New folder\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Admin");//input[name='txtUsername'] You can use id also
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("admin123");
        
        
	}

}
