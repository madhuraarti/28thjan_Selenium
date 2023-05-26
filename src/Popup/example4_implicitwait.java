package Popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example4_implicitwait 
{
  public static void main(String[] args) 
  {
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://en-gb.facebook.com/");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // it provides the input in first name other not be written so dont use privious wait
	
	// click on create new account link
	
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	
	//enter FN
	
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("abc");
  
  
	}
}
