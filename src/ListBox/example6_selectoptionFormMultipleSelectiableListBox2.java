package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example6_selectoptionFormMultipleSelectiableListBox2 
{
	public static void main(String[] args) throws InterruptedException 
 {
	
      WebDriver driver = new ChromeDriver();
      driver.get("file:///C:/Users/DELL/Desktop/God%20please%20give%20me%2080000-%20per%20month/Automation%20notes/List%20Box/Sample_1.html");
       
       WebElement selectCountry =driver.findElement(By.xpath("//select[@id='1234']"));
            
       Select s =new Select(selectCountry);
       
             
       boolean result = s.isMultiple();
       System.out.println(result);
       
       if(result)
       {
    	   System.out.println("list is of multi-selectable ");
       }
       
       else
       {
    	   System.out.println("listbox is of single-selectable ");
       }
       
      
       
       
 
 }
}