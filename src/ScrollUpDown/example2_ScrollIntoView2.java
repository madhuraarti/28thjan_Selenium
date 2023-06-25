package ScrollUpDown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_ScrollIntoView2 
{
 public static void main(String[] args) throws InterruptedException 
 {
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.flipkart.com/");
	
	//click on close browser button
	
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	
	Thread.sleep(20000);
	
	
      WebElement	ele1 = driver.findElement(By.xpath("//h2[text()='Summer Wedding Edit']"));
      
      ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", ele1); // as it is learn
	

	
	
	
		
	
 }
}
