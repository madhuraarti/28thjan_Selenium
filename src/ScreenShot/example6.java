package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class example6 
{
  

public static void main(String[] args) throws IOException 
	

  {
	  WebDriver driver =new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	 
	  String RS =RandomString.make(3); // WE FIXED 3 WORDS MAY BE DIGIT OR WORDS
	  System.out.println(RS);
	 
	      
	 
	
  }
}
