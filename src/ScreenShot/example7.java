package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class example7 
{
  

public static void main(String[] args) throws IOException 
	

  {
	  WebDriver driver =new ChromeDriver();
	  driver.get("https://www.google.com/");
	 
	  String RS =RandomString.make(3);
	  
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	System.out.println(src);
	
	// step2 defined path user  // so screen shot should be stored in defined folder
	
	File dest = new File ("D:\\may excel\\Screenshot\\Image.jpg"); 
	
	FileHandler.copy(src, dest);         // className.methodname(path of source, path of Destination
	 
	
  }
}
