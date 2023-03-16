package com.mohs10.scripts;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.mohs10.base.StartBrowser;
import com.mohs10.reuse.CommonFuns;

	public class HomeTest extends StartBrowser{
	
	@Test(priority = 1)
	public void TestShopNowBtn() throws Exception {
		CommonFuns cat = new CommonFuns();
	    cat.ShopNowBtnCheck();
		Thread.sleep(3000);
	}
	
	@Test(priority = 2)
	public void ProductSelection() throws Exception {
		CommonFuns News = new CommonFuns();
	    News.ProductSelect();
	    Thread.sleep(3000);
	}
	
	
	
	@Test(priority = 3)
	public void SearchTestCase() throws Exception {
		CommonFuns News = new CommonFuns();
	    News.SearchProduct("ABC");
	    Thread.sleep(3000);
	}
	
	@Test(priority = 4)
	public void SearchTestCase2() throws Exception {
		CommonFuns News = new CommonFuns();
	    News.SearchProduct1("123");
	    Thread.sleep(3000);
	}
	
	@Test(priority = 5)
	public void SearchTestCase3() throws Exception {
		CommonFuns News = new CommonFuns();
	    News.SearchProduct2("jeans");
	    Thread.sleep(3000);
	}
	
	@Test(priority = 6)
	public void AddCart() throws Exception
	{
		CommonFuns add = new CommonFuns();
		add.AddtoCart();
	}
	@Test(priority = 7)
	public void ProductCheckout() throws Exception
	{
		CommonFuns add = new CommonFuns();
		add.Checkout();
	}
	
	
	@Test(priority = 8)
	public void OrderTestCase() throws Exception {
		CommonFuns add = new CommonFuns();
	    add.billing("Tafajjul", "Zilani", "Mohs10", "India", "Patia", "Bhubneshwar", "Odisha", "7510a4", "7277393227", "tafazilani@gmail.com", "I will come back");
	    Thread.sleep(4000);
	}
	
	@Test(priority = 9)
	public void PinCodeValidation() throws Exception {
		CommonFuns now = new CommonFuns();
		now.ValidatePin("Abcd@#");
		Thread.sleep(4000);
	}
	@Test(priority = 10)
	public void PinCodeValidation2() throws Exception {
		CommonFuns now = new CommonFuns();
		now.ValidatePin("");
		Thread.sleep(4000);
	}
	
	@Test(priority = 11)
	public void PinCodeValidation3() throws Exception {
		CommonFuns now = new CommonFuns();
		now.ValidatePin("751024");
		Thread.sleep(4000);
	}
	
	@Test(priority = 12)
	public void PhoneNoValidation() throws Exception {
		CommonFuns now = new CommonFuns();
		now.ValidatePhone("727739322a");
		Thread.sleep(4000);
	}
	
	@Test(priority = 13)
	public void PhoneNoValidation2() throws Exception {
		CommonFuns now = new CommonFuns();
		now.ValidatePhone("727739322@");
		Thread.sleep(4000);
	}
	@Test(priority = 14)
	public void PhoneNoValidation3() throws Exception {
		CommonFuns now = new CommonFuns();
		now.ValidatePhone("727739322#");
		Thread.sleep(4000);
	}
	@Test(priority = 15)
	public void PhoneNoValidation4() throws Exception {
		CommonFuns now = new CommonFuns();
		now.ValidatePhone("77393227");
		Thread.sleep(4000);
	}
	@Test(priority = 16)
	public void PhoneNoValidation5() throws Exception {
		CommonFuns now = new CommonFuns();
		now.ValidatePhone("+-7277393227");
		Thread.sleep(4000);
	}
	@Test(priority = 17)
	public void PhoneNoValidation6() throws Exception {
		CommonFuns now = new CommonFuns();
		now.ValidatePhone("727 7393227");
		Thread.sleep(4000);
	}
	
	@Test(priority = 18)
	public void PhoneNoValidation7() throws Exception {
		CommonFuns now = new CommonFuns();
		now.ValidatePhone("");
		Thread.sleep(4000);
	}
	
	@Test(priority = 19)
	public void SubscribeNow() throws Exception {
		CommonFuns now = new CommonFuns();
		now.subscribeTestCase("tafazilani#gmail.com");
		Thread.sleep(4000);
	}
	
	@Test(priority = 20)
	public void SubscribeNow2() throws Exception {
		CommonFuns now = new CommonFuns();
		now.subscribeTestCase1();
		Thread.sleep(4000);
	}
	
	
	@Test(priority = 21)
	public void SubscribeNow3() throws Exception {
		CommonFuns now = new CommonFuns();
		now.subscribeTestCase2("tafazilani@gmail.com");
		Thread.sleep(6000);
	}
	
	@Test(priority=22)
	public void ContactusTestcase() throws Exception
	{
		CommonFuns us = new CommonFuns();	
		us.contactus("Tafajjul", "Enquery","tafazilani@gmail.com", "Contact me, as soon as possible");
	}
			}
