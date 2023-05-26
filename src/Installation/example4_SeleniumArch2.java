package Installation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example4_SeleniumArch2 
{
public static void main(String[] args) 

    {
	// step1:creat an object of chromedriver class
    
    // ChromeDriver driver=new ChromeDriver(); // it can be used in only chrome browser 
    //hence it is not used in compatiable testing means not excess for all browsers
    
    WebDriver driver= new ChromeDriver();  // upcasting in selenium  // it can be used for all browsers
    
    WebDriver driver= new WebDriver(); // no why? // it shows error due to webdriver contains incomplete methods so we can not creat a object
    
    }
}
