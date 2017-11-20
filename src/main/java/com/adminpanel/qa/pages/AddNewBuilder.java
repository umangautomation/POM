package com.adminpanel.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.adminpanel.qa.base.TestBase;

public class AddNewBuilder extends TestBase {
	
	@FindBy(name="firm_name_text")
	WebElement firmName;
	
	@FindBy(name="builder_url_text")
	WebElement BuilderUrl;
	
	@FindBy(name="first_name_text")
	WebElement firstName;
	
	@FindBy(name="last_name_text")
	WebElement lastName;
	
	@FindBy(name="email_id_text")
	WebElement emailId;
	
	@FindBy(name="mobile_no_text")
	WebElement mobileNo;
	
	@FindBy(name="address1_text")
	WebElement address1;
	
	@FindBy(name="user_name_text")
	WebElement userName;
	
	@FindBy(name="company_name_text")
	WebElement companyName;
	
	@FindBy(name="project_delivered_text")
	WebElement projectDelivered;
	
	@FindBy(name="ongoing_project_text")
	WebElement onGoingProject;
	
	@FindBy(name ="description_text")
	WebElement descrptnText;
	
	@FindBy(name="builder_logo_file")
	WebElement UploadBuilderLogo;
	
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	WebElement submitBtn;
	
	@FindBy(xpath="//h3[(text=,'Builder List')]")
	WebElement builderListLabel;
	
	
	
	public AddNewBuilder() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void createNewBuilder(String frName,String url,String ftName,String ltName,String Email,String Mobile,
			String ad1,String usName, String cName,String prjDlvrd, String onGngPrjt,String despnText) {
		
		firmName.sendKeys(frName);
		BuilderUrl.sendKeys(url);
		firstName.sendKeys(ftName);
		lastName.sendKeys(ltName);
		emailId.sendKeys(Email);
		mobileNo.sendKeys(Mobile);
		address1.sendKeys(ad1);
		userName.sendKeys(usName);
		companyName.sendKeys(cName);
		projectDelivered.sendKeys(prjDlvrd);
		onGoingProject.sendKeys(onGngPrjt);
		descrptnText.sendKeys(despnText);
		
	}
	
	public void selectEstbYear(String year) {
		Select select = new Select(driver.findElement(By.name("establish_year_text")));
		select.selectByVisibleText(year);
	}
	
	public void selectDeliverdArea(String area) {
		Select select1 = new Select(driver.findElement(By.name("delivered_area_unit")));
		select1.selectByVisibleText(area);
	}
	
	public void uploadLogo() {
		UploadBuilderLogo.sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures\\Desert.jpg");
	}
	
	
	public void submitButton() {
		submitBtn.click();
		//return new BuilderActMgmt();
	}
	
	
	
	
	
	
	
	

}
