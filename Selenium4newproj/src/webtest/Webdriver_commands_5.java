package webtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_commands_5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("Title is :" +driver.getTitle());
		System.out.println("Current Url is :" +driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		
		//Navigate 
		driver.navigate().to("https://www.facebook.com");
		System.out.println("Title is : "+driver.getTitle());
		driver.navigate().back();//hrm
		Thread. sleep(3000);
		driver.navigate().forward();//fb
		driver.navigate().refresh();
		
		

	}

}
