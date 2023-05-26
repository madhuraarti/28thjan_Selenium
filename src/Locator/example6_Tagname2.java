package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example6_Tagname2 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Desktop/God%20please%20give%20me%2080000-%20per%20month/Automation%20notes/Sample13.html");
   
		// enter FN
      driver.findElement(By.tagName("input")).sendKeys("abc");
      
        // enter LN
      
      driver.findElement(By.tagName("input")).sendKeys("xyz");
      
   // Hence we will get output abcxyz because id is same hence we don't use tagname. so we go for id 
	
	}

   
	
	
}
