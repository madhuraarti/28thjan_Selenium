package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example6_Tagname 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Desktop/God%20please%20give%20me%2080000-%20per%20month/Automation%20notes/Sample13.html");
   
	    // enter FN
		
		driver.findElement(By.tagName("input")).sendKeys("abc");
	
	}

   
	
	
}
