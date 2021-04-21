
/**  Name : CheckOutPage.java
	 * Created by : Dikhit
	 * Date: 19/04/2021
	 * Description: This page class contains all the web element and methods related to product checkout
     
	 */
package com.application.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.application.actionDriver.ActionClass;
import com.application.basePackage.BaseClass;

public class CheckOutPage extends BaseClass {
	
	@FindBy
	(xpath = "//span[@class='couponcode']")
	WebElement invalidCode;
	
	@FindBy(xpath = "//span[text()=\"Account\"]")
	WebElement AccountLumens;
	
	@FindBy(xpath = "//a[@class='logout']")
	WebElement logout;
	
	@FindBy(xpath = "//p[@class='text-right']/a[2]")
	WebElement opencartItemBasketCheckout;
	
	/** 
	 * Created by : Dikhit
	 * Date: 19/04/2021
	 * Description: This is the constructor to initialize values
     
	 */
	public CheckOutPage () 
	{
		PageFactory.initElements(driver, this);
	}
	
	/**  
	 * Created by : Dikhit
	 * Date: 19/04/2021
	 * Description: This method to increase the quantity of the product
     
	 */
	public void increaseQuantityAndEnterPromo() {
		driver.findElement(By.xpath("//span[@class='qty-increment-decrement qty-increment']")).click();
		driver.findElement(By.xpath("//input[@name='dwfrm_cart_couponCode']")).sendKeys("COUPON");
		driver.findElement(By.xpath("//button[@name='dwfrm_cart_addCoupon']")).click();
	}
	
	public  CheckOutPage verifyIncorrectPromo() {
		ActionClass.findelement(driver, invalidCode);
		String actLogo = "not valid";
		WebElement exp = driver.findElement(By.xpath("//span[@class='couponcode']"));
		String priLogo = exp.getText();
       if (actLogo.contains(priLogo)) {
		System.out.println("promocode Is not valid");
		return new CheckOutPage();
	}
	return null;

	}
	
	/**  
	 * Created by : Jyothi
	 * Date: 19/04/2021
	 * Description: This method identify checkout button and click on it     
	 */
	public static void opencartItemBasketcheckout()
	{
	  driver.findElement(By.xpath("//p[@class='text-right']/a[2]")).click();
	}
}
