package com.mohs10.or;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class HomePage {
	
	public static By btnShopNow = By.xpath("(//a[@role='button'])[1]");
	public static By btnFindMore = By.xpath("(//a[@role='button'])[2]");
	public static By btnShopNow2 = By.xpath("(//a[@role='button'])[3]");
	public static By btnShopNow3 = By.xpath("(//a[@role='button'])[4]");
	public static By lnkMen = By.xpath("(//a[.='Men'])[1]");
	public static By lnkTshirt = By.xpath("//a[.='DNK Green Tshirt']");
	public static By lnkIncQty = By.xpath("//input[@size='4']");
	public static By lnkColrCng = By.xpath("(//div[.='Aqua'])[1]");
	public static By lnkAddCart = By.xpath("//button[.='Add to cart']");
	public static By lnkHome = By.xpath("(//a[@rel='home'])[1]");
	
	public static By lnkCart = By.xpath("(//span[@class='ast-count-text'])[1]");
	
	public static By btnEverything= By.xpath("(//a[.='Everything'])[1]");
	public static By SearchProduct = By.xpath("//input[@type='search']");
	public static By ClkSearch = By.xpath("(//button[@type='submit'])[1]");
	public static By btnNext = By.xpath("//a[@class='next page-numbers']");
	public static By selectDeans = By.xpath("//h2[.='Dark Blue Denim Jeans']");
	public static By Checkoutbtn = By.xpath("(//a[.='Checkout'])[3]");
	
	//billing details
	public static By Fname = By.xpath("//input[@name='billing_first_name']");
	public static By Lname = By.xpath("//input[@name='billing_last_name']");
	public static By Comname = By.xpath("//input[@name='billing_company']");
	public static By CountryName = By.xpath("(//span[@class='select2-selection__rendered'])[1]");
	public static By CountryValue= By.xpath("//input[@class='select2-search__field']");
	public static By StreetAdd = By.xpath("//input[@name='billing_address_1']");
	public static By CityName = By.xpath("//input[@name='billing_city']");
	public static By StateName = By.xpath("(//span[@class='select2-selection__rendered'])[2]");
	public static By StateValue =By.xpath("//input[@class='select2-search__field']") ;
	public static By PinCode = By.xpath("//input[@name='billing_postcode']");
	public static By phoneNo= By.xpath("//input[@autocomplete='tel']");
	public static By Email = By.xpath("(//input[@type='email'])[1]");
	public static By OrderComments = By.xpath("//textarea[@name='order_comments']");
	public static By PlaceOrder = By.xpath("//button[.='Place order']");
	
	//subscribe
	public static By SubscribeText= By.xpath("//input[@type='email']");
	public static By clkSubscribe= By.xpath("//button[@name='wpforms[submit]']");
	
	
	
	
	//Contact Us
	public static By clkContactus = By.xpath("(//a[.='Contact Us'])[1]");
	public static By txtname = By.xpath("//input[@placeholder='NAME']");
	public static By txtSubject = By.xpath("//input[@placeholder='SUBJECT']");
	public static By txtEmail = By.xpath("//input[@placeholder='EMAIL']");
	public static By txtMessage = By.xpath("//textarea[@placeholder='MESSAGE']");
	public static By clkSndMsg = By.xpath("//button[.='Send Message']");
	
	public static By lnkBooks = By.xpath("//li[@class='inactive']//a[normalize-space()='Books']");
	public static By lnkGiftCards =By.xpath("//li[@class='inactive']//a[normalize-space()='Gift Cards']");
	
	//cart validation 
	public static By krt=By.xpath("//span[@class=\"ast-count-text\"]");
	
	}
