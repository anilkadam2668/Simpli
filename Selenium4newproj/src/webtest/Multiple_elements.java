
package webtest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_elements {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\New folder\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //Time duration is very important//
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gclid=CjwKCAiA78aNBhAlEiwA7B76py8l8ISEUqaH5Udy1H4i1YQw_FNQyDkk94F47kfkTeoB-90aWfZD2RoCOAIQAvD_BwE&gclsrc=aw.ds");
		
//		Number of text boxes
//		List<WebElement> textboxes=(List<WebElement>) driver.findElement(By.tagName("input"));
//		List<WebElement> txtbox=driver.findElements(By.tagName("input"));
//		System.out.println("Number of text boxes : "+txtbox.size());
//		
		//number of links from webpage
		List<WebElement> links=driver.findElements(By.tagName("a"));
		//System.out.println("number of links: "+links.size());
		
		for(WebElement i:links)
		{
//			String text=i.getText();
//			System.out.println(i.getText());
			System.out.println("link is:"+i.getAttribute("href"));
			String expected="https://my.naukri.com/faq/faq.php";
			if(i.getAttribute("href").equals(expected))
			{
				System.out.println("Test passed...");
				break;
			
//			String expected="http://www.facebook.com/OrangeHRM";
//			if(i.getAttribute("href").equals(expected))
//			{
//				System.out.println("Test passed...");
//				break;
			}
			
		}
		

	}

}
