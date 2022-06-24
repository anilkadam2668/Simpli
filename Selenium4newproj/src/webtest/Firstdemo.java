package webtest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Firstdemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.get("https://www.goibibo.com/flights");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("<input type=text value=>"));
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[1]/div/div[2]/div")).sendKeys("h");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		List <WebElement>Options=driver.findElements(By.xpath("////ul[@id='autoSuggest-list']//li[1]//span"));
		System.out.println("Total sites are: "+Options.size());
		
		for(WebElement i:Options)
		{
			System.out.println("----------------------------------");
			System.out.println("Names are: "+i.getText());
			if(i.getText().contains("hubli"))
			{
				System.out.println("Test Passed");
				System.out.println("----------------------------------");
			}
		}

	}

}
