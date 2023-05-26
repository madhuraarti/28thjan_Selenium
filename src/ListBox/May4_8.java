package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class May4_8 
{
	public static void main(String[] args) throws InterruptedException 
 {
	
      WebDriver driver = new ChromeDriver();
      driver.get("file:///C:/Users/DELL/Desktop/God%20please%20give%20me%2080000-%20per%20month/Automation%20notes/List%20Box/Sample_1.html");
       
       WebElement selectCountry =driver.findElement(By.xpath("//select[@id='1234']"));
            
       Select s =new Select(selectCountry);
       
             
      s.selectByIndex(3); 
      s.selectByIndex(2); 
      s.selectByIndex(0);  
       
   //   int size=s.getAllSelectedOptions().size();
   //   System.out.println(size); 
 
      List<WebElement>allSelectedOptions=s.getAllSelectedOptions();
      
      int size=s.getAllSelectedOptions().size();
      System.out.println(size);
 
 }
}
