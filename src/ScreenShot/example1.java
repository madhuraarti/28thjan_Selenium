package ScreenShot;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 
{
  

public static void main(String[] args) 
	

  {
	  WebDriver driver =new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	 
	  // Step1 take screen shot
	 
	  //  first we have to write ((type))
	 
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	System.out.println(src);
	
	 
	
  }
}
