/**  
 * Name : HomePage.java
	 * Created by : Dikhit,Jyothi
	 * Date: 19/04/2021
	 * Description: This Page class contains all the web Elements and methods related to Home page of the website
     
	 */
package com.application.pageObjects;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.application.actionDriver.ActionClass;
import com.application.basePackage.BaseClass;


public class HomePage extends BaseClass {
	
	productPage product=null;
	private String lightningpageurl = "https://www.lumens.com/lighting.html";

	@FindBy(className = "logout")
	WebElement logoffBtn;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[3]/div/div[1]/a/div/img[2]")
	WebElement MobileNavFlipkart;
	
	@FindBy(xpath = "//span[@title='lighting']")
	WebElement Lightning;
	
	@FindBy(xpath = "//a[text()='Desktops']")
	WebElement opencartDesktopProduct;
	
	@FindBy(xpath = "//a[text()='Mac (1)']")
	WebElement opencartMacProduct;
	
	@FindBy(xpath = "//ul[@class='nav navbar-nav']/li[2]/a")
	WebElement opencartLaptopsNotebooksProduct;
	
	@FindBy(xpath ="//a[text()='Show All Laptops & Notebooks']")
	WebElement opencartShowAllLaptopNotebooks;
	
	@FindBy(xpath ="//div[@class='caption']/h4/a[text()='HP LP3065']")
	WebElement opencartSelectHPProduct;
	
	@FindBy(xpath ="//span[@class='input-group-btn']/button/i[@class='fa fa-calendar']")
	WebElement opencartCalenderSelect;
	
	@FindBy(xpath ="/html/body/div[4]/div/div[1]/table/tbody/tr[5]/td[6]")
	WebElement opencartCalenderSelectDATE;
	
	@FindBy(xpath ="//button[@id='button-cart']")
	WebElement opencartAddToCart;
	
	@FindBy(xpath ="//span[@id='cart-total']")
	WebElement opencartOpenItemBasket;
	
	@FindBy(xpath="//p[@class='text-right']/a[2]")
	WebElement opencartItemBasketcheckout;
	
	@FindBy(xpath ="//i[@class='fa fa-shopping-cart']")
	WebElement opencartShippingTab;
	
	@FindBy(xpath = "//i[@class='fa fa-times-circle']")
	WebElement OpencartShippingTabRemoveProd;
	
	@FindBy(xpath = "//a[@class='btn btn-primary']")
	WebElement OpencartShippingTabContinue;
	
	@FindBy(xpath = "//input[@id='input-quantity']")
	WebElement opencartQuantity;
	
	@FindBy (xpath = "//a[text()='Edit Account']")WebElement OpencartEditAccountBtn;
	
	
	public HomePage () 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void logoff() {
		ActionClass.click(driver, logoffBtn);
		
	}
	
	/*public  HomePage navigateProduct() 
	{
		//ActionClass.findelement(driver, Lightning);
//		ActionClass.click(driver, Lightning);
		return new HomePage();
	}*/
	
	/**  
	 * 
		 * Created by :Dikhit
		 * Date: 19/04/2021
		 * Description: This method will navigate to the Desktop tab and selects Mac product
	     
		 */
	public  HomePage navigateOpenCartDesktopProduct() 
	{
		ActionClass.findelement(driver, opencartDesktopProduct);
		ActionClass.click (driver, opencartDesktopProduct);
		ActionClass.findelement(driver, opencartMacProduct);
		ActionClass.click (driver, opencartMacProduct);
		return new HomePage();
	}
	
	/**  
	 * 
		 * Created by : Jyothi
		 * Date: 19/04/2021
		 * Description: This method will navigate to the laptopsandNotebooksProduct tab and selects HP product,
		 * Modify the date of delivery,add to cart and checkout
	 * @throws InterruptedException 
	     
		 */
	public  void navigateOpenCartlaptopsandNotebooksProduct() throws InterruptedException 
	{
	
		ActionClass.findelement(driver, opencartLaptopsNotebooksProduct);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ActionClass.click (driver, opencartLaptopsNotebooksProduct);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ActionClass.findelement(driver, opencartShowAllLaptopNotebooks);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ActionClass.click (driver, opencartShowAllLaptopNotebooks);
		ActionClass.findelement(driver, opencartSelectHPProduct);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		ActionClass.click (driver, opencartSelectHPProduct);
		
	    ActionClass.findelement(driver, opencartCalenderSelect);
		ActionClass.click (driver, opencartCalenderSelect);
		
		ActionClass.findelement(driver, opencartCalenderSelectDATE) ;
		ActionClass.click (driver,opencartCalenderSelectDATE); 
		
        ActionClass.findelement(driver, opencartAddToCart) ;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ActionClass.click (driver,opencartAddToCart);
		
		ActionClass.findelement(driver, opencartOpenItemBasket) ;
		ActionClass.click (driver,opencartOpenItemBasket);
		
		
		ActionClass.findelement(driver, opencartItemBasketcheckout) ;
		Thread.sleep(2000);
		ActionClass.click (driver,opencartItemBasketcheckout); 
		
		//product.opencartproductcheckoutmandatorydata();
		
		
		
		
		
		//return new HomePage();
	}
	
	public  void OpenCartlaptopsandNotebooksAddProducts() throws InterruptedException 
	{
	
		ActionClass.findelement(driver, opencartLaptopsNotebooksProduct);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ActionClass.click (driver, opencartLaptopsNotebooksProduct);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ActionClass.findelement(driver, opencartShowAllLaptopNotebooks);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ActionClass.click (driver, opencartShowAllLaptopNotebooks);
		ActionClass.findelement(driver, opencartSelectHPProduct);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		ActionClass.click (driver, opencartSelectHPProduct);
		
	    ActionClass.findelement(driver, opencartAddToCart) ;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ActionClass.click (driver,opencartAddToCart);
		
		ActionClass.findelement(driver, opencartShippingTab) ;
		ActionClass.click (driver,opencartShippingTab);
		
		ActionClass.findelement(driver, OpencartShippingTabRemoveProd) ;
		ActionClass.click (driver,OpencartShippingTabRemoveProd);
		
		ActionClass.findelement(driver, OpencartShippingTabContinue) ;
		ActionClass.click (driver, OpencartShippingTabContinue);
	
	}
	
	public  void OpenCartlaptopsandNotebooksAddProducts_CouponApply() throws InterruptedException 
	{
	
		ActionClass.findelement(driver, opencartLaptopsNotebooksProduct);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ActionClass.click (driver, opencartLaptopsNotebooksProduct);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ActionClass.findelement(driver, opencartShowAllLaptopNotebooks);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ActionClass.click (driver, opencartShowAllLaptopNotebooks);
		ActionClass.findelement(driver, opencartSelectHPProduct);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		ActionClass.click (driver, opencartSelectHPProduct);
		//Change Delivery date
		ActionClass.findelement(driver, opencartCalenderSelect);
		ActionClass.click (driver, opencartCalenderSelect);
		
		ActionClass.findelement(driver, opencartCalenderSelectDATE) ;
		ActionClass.click (driver,opencartCalenderSelectDATE); 
		//Change the quantity
		
	  //  ActionClass.findelement(driver, opencartQuantity);
	//	 setquantityApplyCoupon.sendKeys("2");
		//ActionClass.click (driver, opencartQuantity);
		
		
	    ActionClass.findelement(driver, opencartAddToCart) ;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ActionClass.click (driver,opencartAddToCart);
		
		ActionClass.findelement(driver, opencartShippingTab) ;
		ActionClass.click (driver,opencartShippingTab);
		
		product.opencartapplycouponcode();
		
		ActionClass.findelement(driver, OpencartShippingTabContinue) ;
		ActionClass.click (driver, OpencartShippingTabContinue);
	
	}
	
	public HomePage editAccount() throws InterruptedException
	{
		ActionClass.findelement(driver, OpencartEditAccountBtn) ;
		ActionClass.click (driver,OpencartEditAccountBtn);
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("Bhat");
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		String succmsg_editAcc = driver.findElement(By.xpath("//i[@class='fa fa-check-circle']")).getText();
		System.out.println(succmsg_editAcc);
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/aside/div/a[13]")).click();
		
		return new HomePage();
				
	}
	
	
	
}
