package POM_With_PageFactory.copy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// POM Class Page 5
public class PBMyAccPage2 
{
	@FindBy(xpath ="//span[text()=' My profile ']") private WebElement myProfile;
	@FindBy(xpath ="//span[text()='Sign out']") private WebElement signOut;
	
   public	PBMyAccPage2 (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
  public void clickOnMyProfile()
  {
	  myProfile.click();
  }

  public void clickOnsignOut()
  {
	  signOut.click();
  }
}
