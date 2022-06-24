package webtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_xpath_axies {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\New folder\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		//Best seller
		WebElement link=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']//following::a[text()='Best Sellers'][1]"));
		System.out.println("Text of link is: "+link.getText());
		link.click();
		
		WebElement text=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']//following::a[text()='Best Sellers'][1]"));
		System.out.println("Text is: "+text.getText());
		

	}

}
