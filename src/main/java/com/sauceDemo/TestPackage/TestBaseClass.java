package com.sauceDemo.TestPackage;





import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.sauceDemo.POMPackage.POMClass_LoginPage;
import com.sauceDemo.UtilityPackage.UtilityClass;

public class TestBaseClass
{

	WebDriver driver;
	Logger log = Logger.getLogger("SauceDemoProject1");
	@Parameters("browserName")
	@BeforeMethod
	public void setup(String browserName) throws IOException
	{

		if(browserName.equals("chrome"))
		{System.setProperty("webdriver.chrome.driver", 
				"./DriverFolder/chromedriver.exe");	
		
		 driver = new ChromeDriver();
		 log.info("browser is opened");
		}	
		else
		{System.setProperty("webdriver.gecko.driver", 
				"./DriverFolder/geckodriver.exe");	
		
		 driver = new FirefoxDriver();
		 log.info("browser is opened");
		}
PropertyConfigurator.configure("log4j.properties");
		
		driver.manage().window().maximize();
		log.info("maximized browser");
	
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.saucedemo.com/");
		log.info("url is opened");	
		
	POMClass_LoginPage lp=new POMClass_LoginPage(driver);
	lp.sendUsername();
	log.info("enter username");
	lp.sendPassword();
	log.info("enter passward");
	lp.clickLoginButton();
	log.info("click login");
	log.info("Went to home page");
	
UtilityClass.screenshot(driver, "verify");
	}
	
	
@AfterMethod
public void teardown() throws InterruptedException
{

//POMClass_Homepage hp=new POMClass_Homepage(driver);
//hp.clickSettingBtn();
////clickSettingBtn method call
//
//hp.clickLogOutBtn();
////clickLogOutBtn method call
//System.out.println("Went to login page");
//	

driver.close();
log.info("browser is closed");
		
log.info("End of Program");

}

}

