package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_get3 

{

public static void main(String[] args) 
{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	
	driver.close();
}

}
