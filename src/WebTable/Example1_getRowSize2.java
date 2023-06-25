package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_getRowSize2
{
   public static void main(String[] args)
   {
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("file:///C:/Users/DELL/Desktop/God%20please%20give%20me%2080000-%20per%20month/Automation%20notes/WebTable.html");
   
   //      List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='1234']//tr")); // find all rows
  //      int size = allRows.size();
   //     System.out.println(size);
   
	int rowsize= driver.findElements(By.xpath("//table[@id='1234']//tr")).size();
	System.out.println(rowsize);
	 
   }
}
