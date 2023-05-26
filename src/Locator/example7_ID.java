package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example7_ID 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Desktop/God%20please%20give%20me%2080000-%20per%20month/Automation%20notes/tag%20&%20id/sample15.html");
   
		// enter FN
      driver.findElement(By.id("1234")).sendKeys("abc");   // got output separately 
      
        // enter LN
      
      driver.findElement(By.id("5678")).sendKeys("xyz"); // got output separately 
      
     
      
	
	}
}
