
package webtest;

import java.util.List ;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_element_demo 
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\New folder\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.className("button")).click();
		
		//PIM
		driver.findElement(By.id("menu_pim_viewPimModule")).click();//(By.xpath("b[text()='PIM']")).click();
		
		//Employee stsatus<select>--->Select class
		Select empdd=new Select(driver.findElement(By.id("empsearch_employee_status")));
		empdd.selectByIndex(1);//Frealance
		System.out.println("Total elements from drop down: "+empdd.isMultiple());
		List<WebElement> alloptions=empdd.getOptions();
		System.out.println("Total elements:"+ alloptions.size());
		for(WebElement i:alloptions)
		{
			System.out.println(i.getText());
			if(i.getText().equals("Full-Time Contract"));
			{
				i.click();
				System.out.println("Match found... test passed");
				break;
			}
		}
		
		//job tittle
		Select jobdd=new Select(driver.findElement(By.id("empsearch_job_title")));
		jobdd.selectByValue("26");
		
		//sub unit
		Select sub=new Select(driver.findElement(By.id("empsearch_sub_unit")));
		sub.selectByVisibleText("Engineering");
		
		
		
	}
	}
