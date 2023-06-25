package POM_With_PageFactory.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// POM Class Page 2

public class PBMobNumPage
{
	 private WebElement mobNum;
     private WebElement signinWithPwd;
    
    
   public PBMobNumPage(WebDriver driver) // with in constructor
   
   {
	  
	mobNum=driver.findElement(By.xpath("(//input[@id='central-login-module-sign-mobile'])[2]"));
	signinWithPwd=driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]"));
   }

   public void enterMobNum()
   {
	   mobNum.sendKeys("9457622560");
	   
   }
  
   public void clickOnSignInWithPwdBtn()
   {
	   signinWithPwd.click();
   }
}

// it is called simple POM class hence no page factory or no amnotation