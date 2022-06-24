package stepdev;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;

public class GoogleTest {
	static WebDriver driver;
	@Given("^open google app in browser$")
	public void open_google_app_in_browser() throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "C:\\New folder\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.google.com");
	    
	}

	@When("^User enter valid keyword and go for search$")
	public void user_enter_valid_keyword_and_go_for_search() throws Throwable {
	   
		driver.findElement(By.name("q")).sendKeys("Selenium",Keys.ENTER);
	}

	@Then("^Appliction should display valid result$")
	public void appliction_should_display_valid_result() throws Throwable {
	  
		System.out.println("current url is:"+driver.getCurrentUrl());
	}



}
