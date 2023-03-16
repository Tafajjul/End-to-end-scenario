package com.mohs10.reuse;
	import java.awt.AWTException;
import java.awt.Robot;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.etsi.uri.x01903.v13.OCSPRefsType;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.interactions.Actions;

import com.mohs10.base.StartBrowser;
import com.mohs10.ActionDriver.Action;
import com.mohs10.or.HomePage;

import groovy.time.BaseDuration.From;

	public class CommonFuns {
		
		public Action aDriver;
		public WebDriver driver;
		public Robot r;
		
		
		public CommonFuns() throws AWTException
		{
			aDriver = new Action();
			driver = StartBrowser.driver;
		    r=new Robot();
		   
		}
		
		
		public void ShopNowBtnCheck() throws Exception
		{
			StartBrowser.childTest = StartBrowser.parentTest.createNode("Click on shop now");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			aDriver.navigateToApplication("https://ecommerce.mohs10.io");
			aDriver.click(HomePage.btnShopNow, "Shop Now button");
			aDriver.click(HomePage.btnFindMore, "Find More Button");
		
		}
		
		
	
				public void ProductSelect() throws Exception
				{
					StartBrowser.childTest = StartBrowser.parentTest.createNode("Selecting a product");
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					aDriver.click(HomePage.lnkMen, "Mens section link");
					
					JavascriptExecutor ja=(JavascriptExecutor)driver;
					Thread.sleep(1000);
					ja.executeScript("window.scrollBy(0,250)");
					
					aDriver.click(HomePage.lnkTshirt, "Selecting Tshirt");
					aDriver.click(HomePage.lnkColrCng, "Changing the color of Tshirt");
					//aDriver.click(HomePage.lnkIncQty, "Increasing the quantity");
					aDriver.click(HomePage.lnkAddCart, "Click on add to cart");
					aDriver.click(HomePage.lnkHome, "Homepage button");
					//aDriver.click(HomePage.lnkCart, "Add to cart");
					
				}
				
				public void SearchProduct(String Search) throws Exception
				{
					StartBrowser.childTest = StartBrowser.parentTest.createNode("Search product");
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					aDriver.click(HomePage.btnEverything, "Everything section link");
					aDriver.type(HomePage.SearchProduct, Search, "Search product");
					aDriver.click(HomePage.ClkSearch, "Click to search");
				}
				
				public void SearchProduct1(String Search1) throws Exception
				{
					StartBrowser.childTest = StartBrowser.parentTest.createNode("Search product");
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					//aDriver.click(HomePage.btnEverything, "Everything section link");
					aDriver.type(HomePage.SearchProduct, Search1, "Search product");
					aDriver.click(HomePage.ClkSearch, "Click to search");
				}
				
				public void SearchProduct2(String Search2) throws Exception
				{
					StartBrowser.childTest = StartBrowser.parentTest.createNode("Search product");
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					//aDriver.click(HomePage.btnEverything, "Everything section link");
					aDriver.type(HomePage.SearchProduct, Search2, "Search product");
					
				}
				
				public void AddtoCart() throws Exception {
					StartBrowser.childTest = StartBrowser.parentTest.createNode("Add to soppig cart");
					aDriver.click(HomePage.ClkSearch, "Click to search");
					JavascriptExecutor ja=(JavascriptExecutor)driver;
					Thread.sleep(1000);
					ja.executeScript("window.scrollBy(0,250)");
					/*
					 * for(int i=0;i<5;i++) { Thread.sleep(200);
					 * ja.executeScript("window.scrollBy(0,250)"); } aDriver.click(HomePage.btnNext,
					 * "Next page");
					 */
					//Thread.sleep(1000);
					//ja.executeScript("window.scrollBy(0,250)");
					
					aDriver.click(HomePage.selectDeans, "Select a product");
					aDriver.click(HomePage.lnkAddCart, "Click on add to cart");
				}
				public void Checkout() throws Exception
				{
					StartBrowser.childTest = StartBrowser.parentTest.createNode("Product checkout");
					aDriver.click(HomePage.lnkHome, "Homepage button");
					aDriver.click(HomePage.lnkCart, "Add to cart");
					aDriver.click(HomePage.Checkoutbtn, "Add to cart");
				}
				
				public void billing(String fname, String lname,String company,String country,String add,String town,String state,String pin,String phone,String mail,String comments) throws Exception {
					  StartBrowser.childTest = StartBrowser.parentTest.createNode("Billing address");
					 
					  JavascriptExecutor ja=(JavascriptExecutor)driver;
					  ja.executeScript("window.scrollBy(0,500)");
					  
					  aDriver.type(HomePage.Fname, fname, "First name");
					  aDriver.type(HomePage.Lname, lname, "Last name");
					  aDriver.type(HomePage.Comname, company, "Company name");
					  Thread.sleep(1000);
					  aDriver.click(HomePage.CountryName, "Country name");
					  aDriver.type(HomePage.CountryValue, country, "First name");
					  Actions a=new Actions(driver);
						 a.sendKeys(Keys.ARROW_DOWN).perform();
						 Thread.sleep(500);
						 a.sendKeys(Keys.ENTER).perform();
						 
					  aDriver.type(HomePage.StreetAdd, add, "Street address");
					  Thread.sleep(1000);
					  aDriver.type(HomePage.CityName, town, "First name");
					  
					  ja.executeScript("window.scrollBy(0,500)");
					  
					  aDriver.click(HomePage.StateName, "State name");
					  Thread.sleep(1000);
					  aDriver.type(HomePage.StateValue, state, "State value");
						 a.sendKeys(Keys.ENTER).perform();
						 Thread.sleep(1000);
					  aDriver.type(HomePage.PinCode, pin, "Zip code");
					  aDriver.type(HomePage.phoneNo, phone, "Phone number");
					  aDriver.type(HomePage.Email, mail, "Email address");
					  Thread.sleep(1000);
					  aDriver.type(HomePage.OrderComments, comments, "Order comment");
					  aDriver.click(HomePage.PlaceOrder, "Place order button");
					  
					 
					//  from selenium.webdriver.chrome.options
					//  chrome_options = Options();
					//  chrome_options.add_argument("argument");
						
					//	  chrome_opt = WebDriver.ChromeOptions(); 
						 // prefs = {"credentials_enable_service": False, "profile.password_manager_enabled": False}
					//	  chrome_opt.add_experimental_option("prefs", prefs);
						  

						 /* prefs ={"credentials_enable_service": False, "profile.password_manager_enabled": False} 
						  chrome_opt.add_experimental_option("prefs", prefs); */
					//	  driver = webdriver.Chrome(chrome_options=chrome_opt, executable_path=r'C:\Utility\BrowserDrivers\chromedriver.exe');
						 
				}
				
				public void ValidatePin(String pin) throws Exception
				{
					 StartBrowser.childTest = StartBrowser.parentTest.createNode("Validate PinCode");
					 JavascriptExecutor ja=(JavascriptExecutor)driver;
					  ja.executeScript("window.scrollBy(0,600)");
					  aDriver.click(HomePage.PinCode, "pin code");
					  
					  Thread.sleep(1000);
					  for(int i=0;i<7;i++)
					  {
					  Actions a=new Actions(driver);
					 // a.sendKeys(Keys.CONTROL,"A").perform();
					  Thread.sleep(200);
					  a.sendKeys(Keys.BACK_SPACE).perform();
					  }
						 Thread.sleep(1000);
						 Actions a=new Actions(driver);
						 aDriver.type(HomePage.PinCode, pin, "pin code");
					  
					 // a.sendKeys(Keys.ENTER);
					  Thread.sleep(1000);
					 aDriver.click(HomePage.PlaceOrder, "Place order button");
					 // aDriver.type(HomePage.PinCode, pin, "First name");
					  
					 
				}
				 
				/*
				 * public void ValidatePin1(String pin) throws Exception {
				 * StartBrowser.childTest = StartBrowser.parentTest.createNode("Validate pin1");
				 * JavascriptExecutor ja=(JavascriptExecutor)driver;
				 * ja.executeScript("window.scrollBy(0,700)"); aDriver.click(HomePage.PinCode,
				 * "Address pincode");
				 * 
				 * Thread.sleep(1000); for(int i=0;i<5;i++) { Actions a=new Actions(driver); //
				 * a.sendKeys(Keys.CONTROL,"A").perform(); Thread.sleep(200);
				 * a.sendKeys(Keys.BACK_SPACE).perform(); } Thread.sleep(1000); Actions a=new
				 * Actions(driver); aDriver.type(HomePage.PinCode, pin, "First name");
				 * 
				 * a.sendKeys(Keys.ENTER); Thread.sleep(1000);
				 * //aDriver.click(HomePage.PlaceOrder, "Place order button"); //
				 * aDriver.type(HomePage.PinCode, pin, "First name");
				 * 
				 * 
				 * }
				 */
				
				public void ValidatePhone(String phone) throws Exception 
				{
					 StartBrowser.childTest = StartBrowser.parentTest.createNode("Validate phone number");
					 JavascriptExecutor ja=(JavascriptExecutor)driver;
					  ja.executeScript("window.scrollBy(0,600)");
					  aDriver.click(HomePage.phoneNo, "Phone number");
					  Thread.sleep(1000);
					  for(int i=0;i<15;i++)
					  {
					  Actions a=new Actions(driver);
					 // a.sendKeys(Keys.CONTROL,"A").perform();
					  Thread.sleep(100);
					  a.sendKeys(Keys.BACK_SPACE).perform();
					  }
						 Thread.sleep(1000);
						 Actions a=new Actions(driver);
						 aDriver.type(HomePage.phoneNo, phone, "First name");
					  
					 // a.sendKeys(Keys.ENTER);
					  Thread.sleep(1000);
					 aDriver.click(HomePage.PlaceOrder, "Place order button");
					 
				}
				
				
				
				 public void subscribeTestCase(String subscribe) throws Exception 
				  {
					  	StartBrowser.childTest = StartBrowser.parentTest.createNode("Subscribe now");
					  	 aDriver.click(HomePage.lnkHome, "Homepage");
					  	 JavascriptExecutor ja=(JavascriptExecutor)driver;
						
						 for(int i=0;i<7;i++)
						 {
							 Thread.sleep(200);
						 ja.executeScript("window.scrollBy(0,250)");
						 }
						 aDriver.type(HomePage.SubscribeText, subscribe, "email address");
						 Thread.sleep(1000);
						 aDriver.click(HomePage.clkSubscribe, "Click to subscribe");
					  	
				  }
				 
				 public void subscribeTestCase1() throws Exception 
				  {
					  	StartBrowser.childTest = StartBrowser.parentTest.createNode("Subscribe now");
					  	 aDriver.click(HomePage.SubscribeText, "click on email text field");
						  Thread.sleep(1000);
						  Actions a=new Actions(driver);
						 
							  
						 // Actions a1=new Actions(driver);
						  a.sendKeys(Keys.ARROW_RIGHT).perform();
						  a.sendKeys(Keys.ARROW_RIGHT).perform();
						  a.sendKeys(Keys.ARROW_RIGHT).perform();
						  a.sendKeys(Keys.ARROW_RIGHT).perform();
						  a.sendKeys(Keys.ARROW_RIGHT).perform();
						  a.sendKeys(Keys.ARROW_RIGHT).perform();
						  
						  
						  for(int i=0;i<21;i++)
						  {
						   
						 // a.sendKeys(Keys.CONTROL,"A").perform();
						  Thread.sleep(100);
						  a.sendKeys(Keys.BACK_SPACE).perform();
						  }
							 Thread.sleep(1000);
							 //Actions a=new Actions(driver);
							 //aDriver.type(HomePage.SubscribeText, subscribe, "First name");
						  
						 // a.sendKeys(Keys.ENTER);
						  Thread.sleep(1000);
						 aDriver.click(HomePage.clkSubscribe, "Subscribe now button");
					  	
				  }
				 public void subscribeTestCase2(String subscribe) throws Exception 
				  {
					  	StartBrowser.childTest = StartBrowser.parentTest.createNode("Subscribe now");
					  	aDriver.type(HomePage.SubscribeText, subscribe, "First name");
					  	 aDriver.click(HomePage.clkSubscribe, "Click to subscribe");
					  	 }
					  	
		
				 
				 
				 
				 
				 public void contactus(String name, String subject,String mail, String message) throws Exception
				 {
					 StartBrowser.childTest = StartBrowser.parentTest.createNode("Subscribe now");
					 JavascriptExecutor ja=(JavascriptExecutor)driver;
						
					 for(int i=0;i<7;i++)
					 {
						 Thread.sleep(200);
					 ja.executeScript("window.scrollBy(0,-250)");
					 }
					 aDriver.click(HomePage.clkContactus, "Click on contact us button");
					 aDriver.type(HomePage.txtname, name, "Name");
					 aDriver.type(HomePage.txtSubject, subject, "Subject");
					 Thread.sleep(1000);
					 aDriver.type(HomePage.txtEmail, mail, "email address");
					 Thread.sleep(1000);
					 aDriver.type(HomePage.txtMessage, message, "email address");
					 aDriver.click(HomePage.clkSndMsg, "click on send message");
					 Thread.sleep(1000);
				 }
				 public void Validatecart() throws Exception
					{
						StartBrowser.childTest = StartBrowser.parentTest.createNode("Click on shop now");
						driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
						aDriver.navigateToApplication("https://ecommerce.mohs10.io");
						aDriver.click(HomePage.btnShopNow, "Shop Now button");
						aDriver.click(HomePage.btnFindMore, "Find More Button");
					
					}
				 
		
	}

