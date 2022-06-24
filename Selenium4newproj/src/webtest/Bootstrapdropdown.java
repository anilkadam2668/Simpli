package webtest;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrapdropdown {

	public static void main(String[] args) {////Please read automation 7pm before starting webdriver exercise
		System.setProperty("webdriver.chrome.driver", "C:\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/bootstrap/bootstrap_dropdowns.asp");
		
		driver.findElement(By.id("menu1")).click();
		List<WebElement> links=driver.findElements(By.xpath("//ul[@class='dropdown-menu test' and @role='menu']//a"));
		System.out.println("Totalsize is: "+links.size());
		
		for(WebElement i:links)
		{
			System.out.println("Total links are: "+i.getText());
		}
		
	}

}
