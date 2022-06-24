package webtest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Element_identification {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\New folder\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();	
	driver.get("https://www.google.com");
	
	driver.findElement(By.name("q")).sendKeys("selenium",Keys.ENTER);
	/*
	//locator
	By search=By.name("q");
	
	//identification
	WebElement searchbox=driver.findElement(search);
	
	//to perform action
	searchbox.sendKeys("selenium");
	Thread.sleep(3000);
	
	driver.findElement(By.name("q")).clear();
	}*/

}
}
