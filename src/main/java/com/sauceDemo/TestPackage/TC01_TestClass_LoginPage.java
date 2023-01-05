package com.sauceDemo.TestPackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC01_TestClass_LoginPage extends TestBaseClass
{
	
	
@Test
	public void verifyloginpagefunctionality() throws IOException, InterruptedException 
    {
	
	//Validation
	log.info("Apply the Validation");
			
	String givenTitle = "Swag Labs";   //PO/BA/dev		
	String actualTitle = driver.getTitle();
			
//	if(givenTitle.equals(actualTitle))
//	{
//		log.info("Login Test is passed");
//	}
//	else
//	{
//		log.info("Login Test is failed");
//	}
	Assert.assertEquals(actualTitle, givenTitle, actualTitle);
    }		
	
}