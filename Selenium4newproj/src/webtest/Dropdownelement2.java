package webtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownelement2 
{
public static void selectdropdown(WebElement w,String value) //Dynamic method for different webelement empdd,jobdd,empsearch_sub_unit 
{
	Select dd=new Select(w);
	System.out.println("Total elements from drop down: "+dd.isMultiple());
	List<WebElement> alloptions=dd.getOptions();
	System.out.println("Total elements:"+ alloptions.size());
	for(WebElement i:alloptions)
	{
		System.out.println(i.getText());
		if(i.getText().equals(value));
		{
			i.click();
			System.out.println("Match found");
			break;
		}
	}
	}
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\New folder\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.name("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.className("button")).click();
		
		//PIM                                                   //text method down one
		driver.findElement(By.xpath("//a[@class='firstLevelMenu']//b[text()='PIM']")).click();
		
		//Employee status<select>--->Select class
		WebElement empdd=(driver.findElement(By.id("empsearch_employee_status")));
		 selectdropdown(empdd,"Freelance");//above Method calling for dynamic programming for different webelement empdd,jobdd,empsearch_sub_unit 
		 WebElement jobdd=driver.findElement(By.id("empsearch_job_title"));
		 selectdropdown(jobdd,"Automation Tester");
	}
	}
		

	


