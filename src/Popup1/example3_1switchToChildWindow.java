package Popup1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example3_1switchToChildWindow 
{
	public static void main(String[] args) throws InterruptedException 
	  {
		WebDriver driver = new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		
		// step 3 : get child window ID
		Set<String> allIds= driver.getWindowHandles(); // (mainPageID, childWindowID)
		ArrayList<String> al= new ArrayList<String>(allIds);  // (mainPageID(0),childWindowID(1))
		String childWindowID =al.get(1);
		
		// step 2 :switch to child window
		
		driver.switchTo().window(childWindowID);  // String child Window ID
		
		//  step 1 :  click on "Training" link from childWindow
		
		
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		
		
		// Step 4: 
		
		
		Thread.sleep(2000);
		
		// Step 6:  switch to main page
		
		driver.switchTo().window(al.get(0));
		
		Thread.sleep(2000);
		
		// step 5:
		
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		
	  }
}
