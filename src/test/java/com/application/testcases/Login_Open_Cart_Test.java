/**
 * Test Case Name : Login_Open_Cart_Test
 * Author: Dikhit, Jyothi
 * Date of Creation: 19/04/2021
 * Description: This test case will do a login operation in the "openCart website" and add product to the cart
 */

package com.application.testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.application.actionDriver.ActionClass;
import com.application.basePackage.BaseClass;

import com.application.pageObjects.CheckOutPage;
import com.application.pageObjects.HomePage;
import com.application.pageObjects.IndexPage;

import com.application.pageObjects.LoginPage;
import com.application.pageObjects.productPage;

public class Login_Open_Cart_Test extends BaseClass {
	public static Logger logger = LogManager.getLogger(Login_Open_Cart_Test.class);
	
	IndexPage index;
	LoginPage login;
	HomePage home;
	ActionClass action;
	productPage product;
	CheckOutPage checkOut;
	
	@BeforeMethod ()
	public void setup() { //launching chrome browser and accessing url of lumen
		launchApp();    //will launch chrome and go to lumen
		if (index== null) {
			index= new IndexPage();
		}
		
		if (login == null) {
			login = new LoginPage();
		}
		
		if (home == null) {
			home = new HomePage();
		}
		
			
		if (product == null) {
			product = new productPage();
		}
		
		if (checkOut == null) {
			checkOut = new CheckOutPage();
		}
	}
	
	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}
	
	@Test (priority = -1, enabled = true) 
	public void Login() throws Exception {
		extent.createTest("OpenCartTest");
		
		/*//OpenCart Registration Module
		login.OpenCartRegisterPageModule(prop.getProperty("OpenCartRegisterFirstName"),prop.getProperty("OpenCartRegisterLastName"),prop.getProperty("OpenCartRegisterEmail"),
				prop.getProperty("OpenCartRegisterTelephone"),prop.getProperty("OpenCartRegisterPassword"));
		takeScreenshot("Registration success");
		logger.info("user has Registred successfully in to openCart website successfully");*/
		
		//OpenCart Login Module
		home= login.loginToOpenCart(prop.getProperty("OpenCartUserName") ,  prop.getProperty("OpenCartPassword"));
		index.verifyLogingopenCartSuccessful();
		logger.info("user has logged in to openCart website successfully");
		
		/*//OpenCart Product Selection
		home.navigateOpenCartDesktopProduct();
		logger.info("user has successfully selected Mac product ");
		takeScreenshot("Product Selection is successfull");
		checkOut=product.clickOnAddCarOpenCartt();
		product.OpenCartverifyProductSuccessfullyAdded();
		takeScreenshot("Product  is added successfully");
		home.navigateOpenCartlaptopsandNotebooksProduct();
		product.opencartproductcheckoutmandatorydata();
        product.opencartapplycouponcode();
        takeScreenshot("Coupon code Verification done");
        logger.info("Coupon code successfully verified");*/
		
		
	}
	
	

}
