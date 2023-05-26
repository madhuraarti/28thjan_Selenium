package WebDriver_Methods;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class example6_Maximize2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		
		Thread.sleep(4000);  // diffclassname.methodname( time in mili sec
		
		driver.manage().window().maximize();
		
		
		
		
	}
}
