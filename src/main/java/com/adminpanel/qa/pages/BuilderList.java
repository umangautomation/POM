package com.adminpanel.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adminpanel.qa.base.TestBase;

public class BuilderList extends TestBase {
	
	/*@FindBy(xpath="//h3[contains(text(),'Builder List')]")
	WebElement builderListLink;*/
	
	@FindBy(xpath="//a[contains(text(),'Add New Builder')]")
	WebElement addNewBuilderLink;
	
	public BuilderList() {
		PageFactory.initElements(driver, this); //all login class object will intilized in driver or use PageFactory.initElements(driver, this)	
	}
	
	/*public boolean verifybuilderListLink() {
		return builderListLink.isDisplayed();
			
	}*/
	
	public void selectBuilderByFirmName(String name) {
		
		driver.findElement(By.xpath("//td[(text()='"+name+"')]//preceding-sibling::td//input[@type='checkbox']")).click();
		//td[(text()='AARONE GROUP')]//preceding-sibling::td//input[@type='checkbox']
	}
	
	public AddNewBuilder clickOnAddBuilderLink() {
		addNewBuilderLink.click();
		return new AddNewBuilder();
	}

}
