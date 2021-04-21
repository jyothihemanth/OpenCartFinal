/**  Name:LoginPage.java
	 * Created by : Dikhit,Jyothi
	 * Date: 19/04/2021
	 * Description: This page class contains all the web elements and methods related to login page of respective website
     
	 */
package com.application.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.application.actionDriver.ActionClass;
import com.application.basePackage.BaseClass;
public class LoginPage extends BaseClass {
	
	@FindBy(id = "email")
	WebElement loginID;
	
	@FindBy(name = "passwd")
	WebElement password;
	
	@FindBy(id = "SubmitLogin")
	WebElement signInBtn;
	
	
	@FindBy(xpath = "//div[@class='_1rH5Jn']/div[2]/div[3]/div[1]/div[1]/div/div")
	WebElement Flipkart_Login_Logo;
	
	@FindBy(xpath = "//div[@class='_36HLxm col col-3-5']/div/form/div[1]/input")
	WebElement Flipkart_EnterUSer;
	
	@FindBy(xpath = "//div[@class='_36HLxm col col-3-5']/div/form/div[2]/input")
	WebElement Flipkart_EnterPWD;
	
	@FindBy(xpath = "//div[@class='_36HLxm col col-3-5']/div/form/div[4]/button")
	WebElement Flipkart_LoginBtn;
	
	@FindBy(xpath = "//div[@class='dropdown-menu']/div/a")
	WebElement signinLumens;
	
	@FindBy(xpath = "//input[@id='dwfrm_login_username']")
	WebElement LumensUserName;
	
	@FindBy(name = "email")
	WebElement OpenCartUserName;
	
	@FindBy(xpath = "//div[@id='top-links']/ul/li[2]")
	WebElement OpenCartMyAccount;
	
	@FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']/li[2]")
	WebElement OpenCartLogingBtn;
	
	@FindBy(xpath = "//input[@id='dwfrm_login_password']")
	WebElement LumensPassd;
	
	@FindBy(name = "password")
	WebElement OpenCartPassd;
	
	@FindBy(xpath = "//form[@id='dwfrm_login']/fieldset/div[3]/div[2]/button")
	WebElement LumensLoginBtn;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement OpenCartUserLoginBtn;
	
	@FindBy(xpath = "//div[@class='logo']")
	WebElement Lumens_Login_Logo;
	
	@FindBy(xpath = "//input[@id='dwfrm_login_rememberme']")
	WebElement Lumens_Remember_Me_CheckBox;
	
	@FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']/li[1]/a")
	WebElement OpenCartRegisterBtn;
	
	@FindBy(xpath = "//input[@id='input-firstname']")
	WebElement OpenCartRegisterFirstName;
	
	@FindBy(xpath = "//input[@id='input-lastname']")
	WebElement OpenCartRegisterLastName;
	
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement OpenCartRegisterEmail;
	
	@FindBy(xpath = "//input[@id='input-telephone']")
	WebElement OpenCartRegisterPhone;
	
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement OpenCartRegisterPass;
	
	@FindBy(xpath = "//input[@id='input-confirm']")
	WebElement OpenCartRegisterConfirmPass;
	
	@FindBy(xpath = "//input[@name='agree']")
	WebElement OpenCartRegisterPrivatePolicyCheckbox;
	
	@FindBy(xpath = "//input[@class='btn btn-primary']")
	WebElement OpenCartRegisterContinueBtn;
	
	@FindBy(xpath = "//div[contains(text(),'Telephone must')]")
	WebElement OpenCartRegisterPhoneNumberWarning;
	
	public LoginPage () 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	/*public HomePage login(String usrName ,  String pwd) 
	{
		ActionClass.findelement(driver, Flipkart_EnterUSer);
		ActionClass.type(Flipkart_EnterUSer, usrName);
		ActionClass.type(Flipkart_EnterPWD, pwd);
		ActionClass.click(driver, Flipkart_LoginBtn);
		return new HomePage();
	}
	
	public HomePage loginToLumens(String usrName ,  String pwd) 
	{
		ActionClass.findelement(driver, LumensUserName);
		ActionClass.click(driver, Lumens_Remember_Me_CheckBox);
		ActionClass.type(LumensUserName, usrName);
		ActionClass.type(LumensPassd, pwd);
		ActionClass.click(driver, Lumens_Remember_Me_CheckBox);
		ActionClass.click(driver, LumensLoginBtn);
		return new HomePage();
	}*/
	/**  
	 * Created by : Dikhit,jyothi
	 * Date: 19/04/2021
	 * Description: This method performs login function
     
	 */
	
	public HomePage loginToOpenCart(String usrName ,  String pwd) 
	{
		ActionClass.findelement(driver, OpenCartMyAccount);
		ActionClass.click(driver, OpenCartMyAccount);
		ActionClass.findelement(driver, OpenCartLogingBtn);
		ActionClass.click(driver, OpenCartLogingBtn);
		ActionClass.type(OpenCartUserName, usrName);
		ActionClass.type(OpenCartPassd, pwd);
		ActionClass.click(driver, OpenCartUserLoginBtn);
		return new HomePage();
	}
	
	/**  
	 * Created by : Jyothi
	 * Date: 19/04/2021
	 * Description: This method performs registration function
     
	 */
	public HomePage OpenCartRegisterPageModule(String FirstName,String LastName,String Email,String Phone,String Password) throws InterruptedException
	{
		ActionClass.findelement(driver, OpenCartMyAccount);
		ActionClass.click(driver, OpenCartMyAccount);
		ActionClass.findelement(driver, OpenCartRegisterBtn);
		ActionClass.click(driver, OpenCartRegisterBtn);
		ActionClass.type(OpenCartRegisterFirstName, FirstName);
		ActionClass.type(OpenCartRegisterLastName, LastName);
		ActionClass.type(OpenCartRegisterEmail, Email);
		ActionClass.type(OpenCartRegisterPhone, Phone);
		ActionClass.type(OpenCartRegisterPass, Password);
		ActionClass.type(OpenCartRegisterConfirmPass, Password);
		ActionClass.click(driver, OpenCartRegisterPrivatePolicyCheckbox);
		Thread.sleep(1000);
		ActionClass.click(driver, OpenCartRegisterContinueBtn);
		Thread.sleep(1000);
		
		
		
		return new HomePage();
	}
	
	/**
	 * Created By: Dikhit, jyothi
	 * Date: 19/04/2019
	 * Description: This method will validate phone number is not entered while registering
	 * @param expText
	 * @return
	 */
	public  HomePage OpenCartVerifyPhoneNumberNotEntered(String expText) {
	   WebElement ele = driver.findElement(By.xpath("//div[contains(text(),'Telephone must')]"));
	   String errorMsgPhone= ele.getText();
	   String errorMessagePhone= errorMsgPhone;
	   if(errorMessagePhone.contains(expText)) {
		   System.out.println(errorMessagePhone+" User has not Entered Phone Number");
	   }
	   else {
		   System.out.println("Phone number present");
	   }
	return new HomePage();
		 
	}

	/*public HomePage verifySuccesfulLogin() {
		ActionClass.findelement(driver, Flipkart_Login_Logo);
		String actLogo = "Flipkart";
		WebElement exp = driver.findElement(By.xpath("//div[@class='logo']"));
		String priLogo = exp.getText();
       if (actLogo.contains(priLogo)) {
		System.out.println("user is in homepage nd logged in successfully");
		return new HomePage();
	}
	return null;

	}
	
	public HomePage verifySuccesfulLoginForLumens() {
		ActionClass.findelement(driver, Lumens_Login_Logo);
		String actLogo = "lumens";
		WebElement exp = driver.findElement(By.xpath("//div[@class='logo']"));
		String priLogo = exp.getText();
       if (actLogo.contains(priLogo)) {
		System.out.println("user is in homepage nd logged in successfully");
		return new HomePage();
	}
	return null;

	}*/
	
}
