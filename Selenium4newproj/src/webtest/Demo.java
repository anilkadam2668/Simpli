package webtest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\New folder\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//div [@class='_6ltg']//a[@role='button']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-' and @name='firstname']")).sendKeys("Anil");
		driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-']//following::input[1]")).sendKeys("Kadam");
		driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-'] //following::input[2]")).sendKeys("7448064401");
		driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("anilkadam");
		
		Select date=new Select(driver.findElement(By.id("day")));
		date.selectByValue("23");
		
		Select day=new Select(driver.findElement(By.xpath("//select[@id='month' and @Class='_9407 _5dba _9hk6 _8esg']")));
		day.selectByVisibleText("Mar");
		

		Select year=new Select(driver.findElement(By.xpath("//select[@id='year' and @Class='_9407 _5dba _9hk6 _8esg']")));
		year.selectByValue("1993");
		
		driver.findElement(By.xpath("//span[@class='_5k_2 _5dba']//following::label[1]")).click();
		
	}

}
