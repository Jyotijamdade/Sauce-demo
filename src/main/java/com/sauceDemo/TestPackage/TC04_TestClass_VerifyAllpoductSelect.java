package com.sauceDemo.TestPackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauceDemo.POMPackage.POMClass_Homepage;

public class TC04_TestClass_VerifyAllpoductSelect extends TestBaseClass
{
	
	
	@Test
public void verifyallproductselectfunctionality() throws IOException 
{
	
	POMClass_Homepage hp = new POMClass_Homepage(driver);
	
	//allPrdtClick
	hp.clickAllProduct();
	log.info("Clicked on all Product");
	
	log.info("Apply the validation");
	
	String expectedProductSelection = "6";
	String actualProductSelected = hp.getTextFromAddToCartBtn();  //1
	
//	if(expectedProductSelection.equals(actualProductSelected))
//	{
//		log.info("All Product Test case is passed");
//	}
//	else
//	{
//		log.info("All Product Test case is failed");
//	}
	Assert.assertEquals(actualProductSelected, expectedProductSelection);
}

}