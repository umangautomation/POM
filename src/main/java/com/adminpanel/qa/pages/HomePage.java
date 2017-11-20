package com.adminpanel.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adminpanel.qa.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//span[contains(text(),'Admin')]")
	WebElement usernameLabel;
	@FindBy(xpath="//span[contains(text(),'Masters')]")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='Builder']")
	WebElement builderLink;
	
	
	
	public HomePage() {
		PageFactory.initElements(driver, this); //all login class object will intilized in driver or use PageFactory.initElements(driver, this)	
	}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	
	public boolean verifyUserNameLabel() {
		return usernameLabel.isDisplayed();
	}
	
	public BuilderList clickOnBuilderLink() throws InterruptedException {
		masterLink.click();
		Thread.sleep(3000);
		builderLink.click();
		return new BuilderList();
	}
	
	


}
