package webtest;

import java.util.Map;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Headlessdemo {

	public static void main(String[] args) {// Without running background chrome browser.
		System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver_win32\\chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();
		Capabilities cap=driver.getCapabilities();
		Map<String,Object> map=cap.asMap();
		System.out.println(map);
		}

}
