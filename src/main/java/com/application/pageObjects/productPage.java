package com.application.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.application.basePackage.BaseClass;

public class productPage extends BaseClass {

	@FindBy(xpath = "//span[text()='Add to Cart']")
	WebElement OpenCart_MacAddToCart;


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

	public CheckOutPage clickOnAddCarOpenCartt() throws Exception {
		driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();
		return new CheckOutPage();

	}


	public static void OpenCartverifyProductSuccessfullyAdded()
	{

		WebElement wb = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
		String Actsuccverfytxt = wb.getText();
		if(Actsuccverfytxt.contains("Success")) {
			System.out.println(Actsuccverfytxt);
		}
	}
	public static void clickOnHPPRODAddCarOpenCart()
	{
		driver.findElement(By.xpath("//button[text()='Add to Cart']")).click();


	}

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

}


