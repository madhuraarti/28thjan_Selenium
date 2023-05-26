package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_XpathByAttribute3 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		// enter user name id:
		//driver.findElement("Locator")
		//driver.findElement(By.xpath(xpathExpression));
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc");
	
		Thread.sleep(2000);
		// enter user name password
		
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("xyz");
		
		// click on login button
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
	
		
		
		
	}
}
