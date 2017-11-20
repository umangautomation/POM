package com.adminpanel.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adminpanel.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//Page factory-or
	@FindBy(name="user_type")
	WebElement usertype;
	
	@FindBy(name="email_email")
	WebElement email ;
	
	@FindBy(name="password_password")
	WebElement password;
	
	@FindBy(xpath="//button[contains(text(),'Sign In')]")
	WebElement signinBtn;
	

	//Initializing Page object
	public LoginPage() {
		PageFactory.initElements(driver, this); //all login class object will intilized in driver or use PageFactory.initElements(driver, this)
		
	}
	
	//Actions or different Feature
	public String validatepageTitle() {
		
		return driver.getTitle();
	}
	
	
	public HomePage login(String ut,String un,String pwd) {
		usertype.sendKeys(ut);
		email.sendKeys(un);
		password.sendKeys(pwd);
		signinBtn.click();
		return new HomePage();
	}
	
	

}
