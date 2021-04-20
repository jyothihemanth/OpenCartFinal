/**
 * 
 */
package com.application.pageObjects;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.application.actionDriver.ActionClass;
import com.application.basePackage.BaseClass;

/**
 * @author DIKHIT
 *
 */
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
	
	
	
	public HomePage () 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void logoff() {
		ActionClass.click(driver, logoffBtn);
		
	}
	
	public  HomePage navigateProduct() 
	{
		ActionClass.findelement(driver, Lightning);
//		ActionClass.click(driver, Lightning);
		return new HomePage();
	}
	
	public  HomePage navigateOpenCartDesktopProduct() 
	{
		ActionClass.findelement(driver, opencartDesktopProduct);
		ActionClass.click (driver, opencartDesktopProduct);
		ActionClass.findelement(driver, opencartMacProduct);
		ActionClass.click (driver, opencartMacProduct);
		return new HomePage();
	}
	
	//navigate to Laptops and Nootebooks
	public  void navigateOpenCartlaptopsandNotebooksProduct() 
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
		ActionClass.click (driver,opencartItemBasketcheckout);
		
		//product.opencartproductcheckoutmandatorydata();
		
		
		
		
		
		//return new HomePage();
	}
	
	public  LightningPage navigateLightning() {
		
		driver.navigate().to(lightningpageurl);
		return new LightningPage();
	}
}
