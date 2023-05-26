package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class example4 
{
  

public static void main(String[] args) throws IOException, InterruptedException 
	

  {
	  WebDriver driver =new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	 
	  // Step1 take screen shot
	 
	  //  first we have to write ((type))
	 
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	System.out.println(src);
	
	// step2 defined path user  // so screen shot should be stored in defined folder
	File dest = new File ("D:\\may excel\\Screenshot\\abc13.jpg");
	FileHandler.copy(src, dest);         // className.methodname(path of source, path of Destination
	 
	// click on create new account link
	
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	
	Thread.sleep(2000); // for slow motion
	
	File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest1 =new File("D:\\may excel\\Screenshot\\abc14.jpg"); 
	FileHandler.copy(src1, dest1);
  }
}
