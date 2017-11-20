package com.adminpanel.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adminpanel.qa.base.TestBase;

public class BuilderActMgmt extends TestBase {
	
	@FindBy(xpath="//span[contains(text(),'User Management')]")
	WebElement userManagement;
	
	@FindBy(xpath="//a[contains(text(),'Builder Account')]")
	WebElement builderAccount;
	
	@FindBy(xpath="//input[@class='form-control input-sm']")
	WebElement search;
	//*[@id='example1_filter']/label/input


 public BuilderActMgmt() {
	PageFactory.initElements(driver, this);
		
	}

 public void searchBuilder(String Builder) throws InterruptedException {
	 userManagement.click();
	 Thread.sleep(1000);
	 builderAccount.click();
	 search.sendKeys(Builder);
}
}
