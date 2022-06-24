package webtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firsttest_1 {

	public static void main(String[] args) //if code is right, output not showing use timers impli or expli timers
	{
	System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver_win32\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();//Please read automation 7pm before starting webdriver exercise
	driver.navigate().to("https://www.google.com/");
	driver.manage().window().maximize();
	String Address=driver.getTitle();
    System.out.println("The title is: "+Address);
	driver.close();
	String Expected="Google";
	
	if(Address.equals(Expected))
	{
		System.out.println("Tittle is verified");
	}
	else
	{
		System.out.println("Tittle is not verified");
	}

	}

}
