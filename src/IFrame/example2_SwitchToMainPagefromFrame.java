package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_SwitchToMainPagefromFrame 
{
  public static void main(String[] args)
  {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
  
 // switch to frame
	
    //	driver.switchTo().frame("iframeResult");   // String frame ID
	
	driver.switchTo().frame("iframeResult");   // String frame ID  
	// inspect iframe we have to click on down arrow key which is present in the inspect
	
	
	// click on click me button
	driver.findElement(By.xpath("//button[contains(text(),'Click me to')]")).click();
  }
}



