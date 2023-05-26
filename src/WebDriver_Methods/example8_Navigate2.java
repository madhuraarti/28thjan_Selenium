package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example8_Navigate2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
	
	   driver.navigate().to("https://www.google.com/");
	   
	   Thread.sleep(4000);
	   
	   driver.navigate().to("https://www.facebook.com/");
	   
	   Thread.sleep(4000);
	   
	   driver.navigate().back();
	   
	   Thread.sleep(4000);
	   
	   driver.navigate().refresh();
	   
	}
}
