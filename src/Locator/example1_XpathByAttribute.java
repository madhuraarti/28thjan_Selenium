package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_XpathByAttribute 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.findElement("Locator Type")
		//driver.findElement(By.xpath(xpathExpression));
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc");
	}
}
