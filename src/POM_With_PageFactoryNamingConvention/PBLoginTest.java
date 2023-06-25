package POM_With_PageFactoryNamingConvention;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBLoginTest 
{
 public static void main(String[] args) throws InterruptedException 
 {
	    WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		PBLoginPage Login = new PBLoginPage(driver);
		Login.clickPBLoginPageSignIn();
 
		PBMobNumPage mobNum = new PBMobNumPage(driver);
		mobNum.inpPBMobNumPageMobNum();
		mobNum.clickPBMobNumPageSignInWithPwd();
		Thread.sleep(2000);
		
		PBPwdPage pwd = new PBPwdPage(driver);
		pwd.inpPBPwdPagePwd();
		pwd.clickPBPwdPageSignIn();
		Thread.sleep(2000);
		
		PBHomePage home = new PBHomePage(driver);
		home.openDDOptionsPBHomePageMyAcc();
		Thread.sleep(2000);
		
		PBMyAccPage myAcc= new PBMyAccPage(driver);
		myAcc.clickPBMyAccPageMyProfile();
		Thread.sleep(2000);
		
		PBProfilePage profile = new PBProfilePage(driver);
		profile.switchToSwitchChildWindow();
		profile.verifyPBProfilePageFullName();
		Thread.sleep(2000);
		
		driver.quit();
 }
}
