package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_getColSizeInRow
{
   public static void main(String[] args)
   {
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("file:///C:/Users/DELL/Desktop/God%20please%20give%20me%2080000-%20per%20month/Automation%20notes/WebTable.html");
   
  int colsize =driver.findElements(By.xpath("//table[@id='1234']//tr[2]/th")).size();
  System.out.println(colsize);
  
  // for header
  int colsize1 =driver.findElements(By.xpath("//table[@id='1234']//tr[1]/th")).size();
  System.out.println(colsize1);
	 
   }
}
