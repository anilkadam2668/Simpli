package webtest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrapdropdown2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[1]/div/div[2]/div/input")).sendKeys("p");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		List <WebElement>Options=driver.findElements(By.xpath("//ul[@id='react-autosuggest-1']//li[contains(@id,'react-autosuggest-1')]//div[@class='mainTxt clearfix']//span"));
		System.out.println("Total sites are: "+Options.size());
		
		for(WebElement i:Options)
		{
			System.out.println("----------------------------------");
			System.out.println("Names are: "+i.getText());
			if(i.getText().contains("Pune"))
			{
				System.out.println("Test Passed");
				System.out.println("----------------------------------");
			}
		}

	}

}
