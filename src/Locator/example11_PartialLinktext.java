package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example11_PartialLinktext 

{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Desktop/God%20please%20give%20me%2080000-%20per%20month/Automation%20notes/tag%20&%20id/sample19.html");
   
      Thread.sleep(2000);
         
      // click on facebook link
      
		driver.findElement(By.partialLinkText("ceb")).click();
      
        
      
	}


}
