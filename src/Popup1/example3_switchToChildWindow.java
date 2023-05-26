package Popup1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example3_switchToChildWindow 
{
	public static void main(String[] args) 
	  {
		WebDriver driver = new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
	  }
}
