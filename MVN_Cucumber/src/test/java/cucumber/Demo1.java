package cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;

public class Demo1 {
	static WebDriver driver;
@Given("^Open google app in browser$")
public void open_google_app_in_browser() throws Throwable {
    
	 System.setProperty("webdriver.chrome.driver", "C:\\New folder\\chromedriver_win32\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("https://www.google.com");
}

@When("^User enter valid keyword$")
public void user_enter_valid_keyword() throws Throwable {
    
	driver.findElement(By.name("q")).sendKeys("Selenium",Keys.ENTER);  
}

@Then("^Application should display valid result$")
public void application_should_display_valid_result() throws Throwable {
    
	System.out.println("current url is:"+driver.getCurrentUrl());
}



}
