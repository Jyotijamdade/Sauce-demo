package com.sauceDemo.POMPackage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class POMClass_Homepage 
{
	private WebDriver driver;
	private Select s;
	private Actions act;
	@FindBy(xpath="//div[text()='Sauce Labs Backpack']")
	private WebElement product1;
	public void clickproduct1()
	{
		product1.click();
	}
	@FindBy(xpath="//div[text()='Sauce Labs Bike Light']")
	private WebElement product2;
	public void clickproduct2()
	{
		product2.click();
	}
	@FindBy(xpath="//div[text()='Sauce Labs Bolt T-Shirt']")
	private WebElement product3;
	public void clickproduct3()
	{
		product3.click();
	}
	@FindBy(xpath="	//div[text()='Sauce Labs Fleece Jacket']")
	private WebElement product4;
	public void clickproduct4()
	{
		product4.click();
	}
	@FindBy(xpath="//div[text()='Sauce Labs Onesie']")
	private WebElement product5;
	public void clickproduct5()
	{
		product5.click();
	}
	@FindBy(xpath="//div[text()='Test.allTheThings() T-Shirt (Red)']")
	 private WebElement product6;
	public void clickproduct6()
	{
		product6.click();
	}
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	private WebElement clickbtn;
	
	public void clickSettingBtn()
	{
		clickbtn.click();
	}

	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	private WebElement logOutBtn;
	
	public void clickLogOutBtn()
	{
		logOutBtn.click();
	}

	//addToCart
	
	
	@FindBy(xpath="//button[text()='Add to cart']")
	private WebElement addtocart1;
	
	public void addtocart1()
	{
		act.click(addtocart1).perform();
	}
	
		@FindBy(xpath="//span[@class='shopping_cart_badge']")      //cart sige findElement
		private WebElement addToCartBtn;
		
		public String getTextFromAddToCartBtn()
		{
			String totalProductSelected =addToCartBtn.getText();
		return totalProductSelected; //1
		}
		
		//all products elents + action
		@FindBy(xpath="//button[text()='Add to cart']")
		private List<WebElement> allProducts;
		
		public void clickAllProduct()
		{
			//assignment -> for each loop
			//or click on single-single ele
			
			for(WebElement s: allProducts)
			{
				s.click();
//			Actions act=new Actions(driver);
//			act.click(s).perform();
		
				}
		}
	@FindBy(xpath="//select[@class='product_sort_container']")
	private WebElement filterbtn;
	
	public void fiterbtnclick()
	{
		filterbtn.click();
		s.selectByIndex(0);
	}

	public POMClass_Homepage(WebDriver driver)
	 {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		//s=new Select(filterbtn);
		act=new Actions(driver);
	 }
	
	
}
