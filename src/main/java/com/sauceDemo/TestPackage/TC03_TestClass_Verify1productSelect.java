package com.sauceDemo.TestPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauceDemo.POMPackage.POMClass_Homepage;

public class TC03_TestClass_Verify1productSelect extends TestBaseClass
{
	
	@Test
public void verify1productselectfunctionality()
{
	POMClass_Homepage hp = new POMClass_Homepage(driver);
	//hp.fiterbtnclick();
	//bagPrdtClick
	
	hp.clickproduct1();
	log.info("Clicked on Product1");
	hp.addtocart1();
	log.info("click on add to cart");
	
	System.out.println("Apply the validation");
	
	String expectedProductSelection = "1";
	String actualProductSelected = hp.getTextFromAddToCartBtn();  //1
	
//	if(expectedProductSelection.equals(actualProductSelected))
//	{
//		log.info("Bag Product Test case is passed");
//	}
//	else
//	{
//		log.info("Bag Product Test case is failed");
//	}
	Assert.assertEquals(actualProductSelected, expectedProductSelection);
}
}

