package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example4_SwitchToMainPageFromFrame 
{
  public static void main(String[] args) throws InterruptedException
  {
	     WebDriver driver = new ChromeDriver();
	
	     driver.manage().window().maximize();
	
	     driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
  
        // switch to frame        
	
	    driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));	
	 	    
	    // click on click me button
	   
	    driver.findElement(By.xpath("//button[contains(text(),'Click me to')]")).click();
	
	    // switch to main page
	    // driver.switchTo().parentFrame();  // we are not used	
	
	     driver.switchTo().defaultContent();
	     
	     Thread.sleep(2000);
	
	     // Click on an "open menu" option from main page
	
	     driver.findElement(By.xpath("//a[@id='menuButton']")).click();
	
  
  
  }
}



