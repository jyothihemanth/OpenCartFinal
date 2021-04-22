/**Test Case Name : TC12_OpenCart_Apply_Coupon
 * Author: Jyothi
 * Date of Creation: 19/04/2021
 * Description: This test case will login into website,add product to the cart,change date and quantity then apply coupon code
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

public class TC12_OpenCart_Apply_Coupon extends BaseClass {
	public static Logger logger = LogManager.getLogger(TC03_OpenCart_Login_Test.class);

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
		driver.quit();
	}
	@Test (priority = -1, enabled = true) 
	public void Login() throws Exception {
		extent.createTest("OpenCartTest");


		//OpenCart Login Module
		
		home= login.loginToOpenCart(prop.getProperty("OpenCartUserName") ,  prop.getProperty("OpenCartPassword"));
		index.verifyLogingopenCartSuccessful();
		logger.info("user has logged in to openCart website successfully");

		//OpenCart Product Selection and apply coupon code
		
		home.OpenCartlaptopsandNotebooksAddProducts_CouponApply();
		logger.info("Coupon code eneterd successfully");
		takeScreenshot("Coupon code eneterd successfully");
		
	}



}
