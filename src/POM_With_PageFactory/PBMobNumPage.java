package POM_With_PageFactory;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// POM Class Page 2

public class PBMobNumPage 
{
     @FindBy(xpath="(//input[@id='central-login-module-sign-mobile'])[2]") private WebElement mobNum;
    @FindBy(xpath="(//span[text()='Sign in with Password'])[2]")  private WebElement signinWithPwd;
    
    
   public PBMobNumPage(WebDriver driver)
   
   {
	  
	PageFactory.initElements(driver, this);
   
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
