package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class example2_TestNGClass1
{
  
	@Test  // like a main method for execution of program
	public void m1() throws InterruptedException
   {
	   WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(5000);
		
		driver.close();
   }
   
}

