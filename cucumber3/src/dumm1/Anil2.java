package dumm1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;
import cucumber.deps.com.thoughtworks.xstream.io.xml.WstxDriver;

public class Anil2 {
	static WstxDriver  driver;
	@Given("^Open enter valid keyword and go for search$")
	public void open_enter_valid_keyword_and_go_for_search() throws Throwable {
		public void open_google_app_in_browser() throws Throwable {
			 System.setProperty("webdriver.chrome.driver", "C:\\New folder\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new WstxDriver();
			 driver("https://www.google.com");
	}

	@When("^User enter valid keyword and go for search$")
	public void user_enter_valid_keyword_and_go_for_search() throws Throwable {
		//driver.findElement(By.name("q")).sendKeys("Selenium",Keys.ENTER);
	}

	@Then("^Application should dispaly valid result$")
	public void application_should_dispaly_valid_result() throws Throwable {
		System.out.println("current url is:"+driver.getCurrentUrl());
	}

}
