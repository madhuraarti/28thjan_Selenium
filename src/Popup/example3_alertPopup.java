package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example3_alertPopup 
{
  public static void main(String[] args) 
  {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	
	driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("111");
	driver.findElement(By.xpath("//input[@name='submit']")).click();
  
      Alert alt= driver.switchTo().alert();  
	
      //1: getText from alert popup
	
	   String text=alt.getText();
	   System.out.println(text);
	
	// 2 click on cancel button from altert popup
	
	//driver.switchTo().alert().dismiss();
	
	// 3 click on ok button from 1st  altert popup
	
		alt.accept();
		
		//4: click on ok button from 2nd altert popup
		
		alt.accept();
		
	}
}
