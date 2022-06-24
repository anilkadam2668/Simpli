package webtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtest_orrangedemo_4 {

	public static void main(String[] args) {
		{
			System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver_win32\\chromedriver.exe" );
			WebDriver driver=new ChromeDriver();
			driver.navigate().to("https://www.orangehrm.com/");
			String Address=driver.getTitle();
		    System.out.println("The title is: "+Address);
			//driver.close();
			String Expected="OrangeHrm";
			
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

}
