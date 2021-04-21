/**  Name:ProductPage.java
	 * Created by : Dikhit,Jyothi
	 * Date: 19/04/2021
	 * Description: This page class contains all the web elements and methods of verifying adding the product to cart,
     mandatatory data fill for check out,verify coupon code
	 */
package com.application.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.application.actionDriver.ActionClass;
import com.application.basePackage.BaseClass;

public class productPage extends BaseClass {

	@FindBy(xpath = "//span[text()='Add to Cart']")
	WebElement OpenCart_MacAddToCart;

	@FindBy(xpath = "//input[@id='input-payment-firstname']")
	WebElement OpenCartBillingFirstName;
	
	@FindBy(xpath = "//input[@name='lastname']")
	WebElement OpenCartBillingLastName;
	
	@FindBy(xpath = "//input[@id='input-payment-address-1']")
	WebElement OpenCartBillingAdd1;
	
	@FindBy(xpath = "//input[@id='input-payment-city']")
	WebElement OpenCartBillingCity;
	
	@FindBy(xpath = "//input[@id='input-payment-postcode']")
	WebElement OpenCartBillingPostcode;
	
	@FindBy(xpath = "//input[@id='button-payment-address']")
	WebElement OpenCartBillingContinueBtn;
	
	@FindBy(xpath = "//input[@id='button-shipping-address']")
	WebElement OpenCartShippingContinueBtn;
	
	
	public productPage () 
	{
		PageFactory.initElements(driver, this);
	}

	public CheckOutPage clickOnAddCart() throws Exception {
		driver.findElement(By.id("add-to-cart")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'CHECKOUT')]")).click();
		return new CheckOutPage();
	}	

	/** 
	 * Created by : Jyothi
	 * Date: 19/04/2021
	 * Description: This method used to add the product to cart
     
	 */
	public CheckOutPage clickOnAddCarOpenCartt() throws Exception {
		driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();
		return new CheckOutPage();

	}

	/** 
	 * Created by : Dikhit
	 * Date: 19/04/2021
	 * Description: This method used for verify successful adding of the product to cart
     
	 */
	public static void OpenCartverifyProductSuccessfullyAdded()
	{

		WebElement wb = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
		String Actsuccverfytxt = wb.getText();
		if(Actsuccverfytxt.contains("Success")) {
			System.out.println(Actsuccverfytxt);
		}
	}
	/** 
	 * Created by : Jyothi
	 * Date: 19/04/2021
	 * Description: This method used to identify and select HP product
     
	 */
	public static void clickOnHPPRODAddCarOpenCart()
	{
		driver.findElement(By.xpath("//button[text()='Add to Cart']")).click();


	}
	/** 
	 * Created by : Jyothi
	 * Date: 19/04/2021
	 * Description: This method used to select mandatory data from dropdown
     
	 */

	public static void opencartproductcheckoutmandatorydata() throws InterruptedException
	{
		
		driver.findElement(By.xpath("//div[@class='panel panel-default']/div/h4/a[text()='Estimate Shipping & Taxes ']")).click();
		Thread.sleep(5000);	
		WebElement	countryId =driver.findElement(By.xpath("//select[@name='country_id']"));
		Select countryIdSel = new Select(countryId);
		countryIdSel.selectByVisibleText("India");
		Thread.sleep(5000);
		WebElement	StateId =driver.findElement(By.xpath("//select[@id='input-zone']"));
		Select StateIdSel = new Select(StateId);
		StateIdSel.selectByVisibleText("Karnataka");
		driver.findElement(By.xpath("//input[@id='input-postcode']")).sendKeys("560098");

	}
	/** 
	 * Created by : Jyothi
	 * Date: 19/04/2021
	 * Description: This method used to coupon code
     
	 */
	public static void opencartapplycouponcode()
	{
		driver.findElement(By.xpath("//a[text()='Use Coupon Code ']")).click();
		driver.findElement(By.xpath("//input[@id='input-coupon']")).sendKeys("XYZA");
		driver.findElement(By.xpath("//input[@id='button-coupon']")).click();
		WebElement errormsg = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
		String Error = errormsg.getText();
		String errorMessage = "Warning";
		if(Error.contains(errorMessage)) {
			System.out.println("Wrong Coupon Code Entered");
		}
	}
	
	/** 
	 * Created by : Jyothi
	 * Date: 19/04/2021
	 * Description: This method used Click on guest checkout option
     
	 */
	public CheckOutPage OpenCartClickOnGuestCheckOut() throws InterruptedException
	{ 
		Thread.sleep(2000);
		//driver.findElement(By.className("accordion-toggle")).click();
		driver.findElement(By.xpath("//a[@class='accordion-toggle']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[@class='radio'][2]/label/input")).click();
	//	driver.findElement(By.id("button-account")).click();
		return new CheckOutPage();
	}
	/** 
	 * Created by : Jyothi
	 * Date: 19/04/2021
	 * Description: This method used to fill mandatory details in billing
     
	 */
	public CheckOutPage OpenCartFillBillingMandatoryDetails(String FName,String LName,String Add1,String City,String PostCode) throws InterruptedException
	{ 
						
		ActionClass.type(OpenCartBillingFirstName, FName);
		ActionClass.type(OpenCartBillingLastName, LName);
		ActionClass.type(OpenCartBillingAdd1, Add1);
		ActionClass.type(OpenCartBillingCity, City);
		ActionClass.type(OpenCartBillingPostcode, PostCode);
		
		WebElement	BillingcountryId =driver.findElement(By.xpath("//select[@id='input-payment-country']"));
		Select BillingcountryIdSel = new Select(BillingcountryId);
		BillingcountryIdSel.selectByVisibleText("India");
		Thread.sleep(5000);
		WebElement	BillingStateId =driver.findElement(By.xpath("//select[@id='input-payment-zone']"));
		Select BillingStateIdSel = new Select(BillingStateId);
		BillingStateIdSel.selectByVisibleText("Karnataka");
		ActionClass.click(driver,OpenCartBillingContinueBtn);
		ActionClass.click(driver,OpenCartShippingContinueBtn);
		
		return new CheckOutPage();
	
	
		
	}
	

}


