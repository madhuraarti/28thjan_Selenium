package POM_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBLoginTest 
{
 public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
 {
	    FileInputStream file =new FileInputStream("D:\\may excel\\28Jan23.xlsx");  
	    Sheet sh=WorkbookFactory.create(file).getSheet("DDF");
	   
	    WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		PBLoginPage Login = new PBLoginPage(driver);
		Login.clickOnSignInBtn();
 
		PBMobNumPage mobNum = new PBMobNumPage(driver);
		String MobileNumber= sh.getRow(0).getCell(0).getStringCellValue();
		mobNum.enterMobNum(MobileNumber);
		mobNum.clickOnSignInWithPwdBtn();
		Thread.sleep(2000);
		
		PBPwdPage pwd = new PBPwdPage(driver);
		String password= sh.getRow(0).getCell(1).getStringCellValue();
		pwd.enterPwd(password);
		pwd.clickOnSignInBtn();
		Thread.sleep(2000);
		
		PBHomePage home = new PBHomePage(driver);
		home.openMyAccDropDownOptions();
		Thread.sleep(2000);
		
		PBMyAccPage myAcc= new PBMyAccPage(driver);
		myAcc.clickOnMyProfile();
		Thread.sleep(2000);
		
		PBProfilePage profile = new PBProfilePage(driver);
		profile.switchToSwitchChildWindow();
		
	    String expFullName	=sh.getRow(0).getCell(2).getStringCellValue();
		profile.verifyFullName(expFullName);
		Thread.sleep(2000);
		
		driver.quit();
 }
}
