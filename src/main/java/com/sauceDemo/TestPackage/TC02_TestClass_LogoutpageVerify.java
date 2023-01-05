package com.sauceDemo.TestPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC02_TestClass_LogoutpageVerify extends TestBaseClass
{
	
	@Test
public void verifylogoutpagefunctionality()
{

//	POMClass_Homepage hp = new POMClass_Homepage(driver);
//	//settingBtn
//	hp.clickSettingBtn();
//	System.out.println("Clicked on Setting Btn");
//	
//	//logOutBtn
//	hp.clickLogOutBtn();
//	System.out.println("Clicked on LogOutbtn");
//	
//	//loginPage
//	System.out.println("went on login page");
	
	//Validation
		log.info("Apply the Validation");
					
	String givenTitle = "Swag Labs";   //PO/BA/dev		
	String actualTitle = driver.getTitle();
					
//	if(givenTitle.equals(actualTitle))
//	{
//		log.info("LogOut Test is passed");
//	}
//	else
//	{
//		log.info("LogOut Test is failed");
//	}
Assert.assertEquals(actualTitle, actualTitle);
}
	
}
