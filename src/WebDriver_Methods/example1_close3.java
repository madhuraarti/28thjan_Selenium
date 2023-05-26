package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_close3 

{

public static void main(String[] args) 
{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	
	
 try {
	 Thread.sleep(4000);  // diffclassname.methodname( time in mili sec  // risky code
     }
	catch (InterruptedException e)
 {
		e.printStackTrace();  // diff classname.methodname(time in mili second)
 }
	driver.close();

}

}
