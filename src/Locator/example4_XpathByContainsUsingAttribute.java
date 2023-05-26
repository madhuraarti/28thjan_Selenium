package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example4_XpathByContainsUsingAttribute 

{

	
		public static void main(String[] args) throws InterruptedException 
		{
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
		
			// Enter User name
			
			driver.findElement(By.xpath("//input[contains(@placeholder,'phone number')]")).sendKeys("abc");
		
		  // Enter user password
			
			driver.findElement(By.xpath("//input[contains(@class,'6luy _9npi')]")).sendKeys("xyz");
		
		// click on login button
			
			driver.findElement(By.xpath("//button[contains(@class,'selected _51sy')]")).click();
		
		
		
		}

}
