package com.adminpanel.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.adminpanel.qa.base.TestBase;

public class AddNewBank extends TestBase {
	
	//test
	
	@FindBy(xpath="//span[contains(text(),'Aggregator Management')]")
	WebElement aggregatorMgmtLink;
	
	@FindBy(xpath="//a[contains(text(),'Add Bank Account')]")
	WebElement addbankLink;
	
	@FindBy(name="business_name_text")
	WebElement businessName;
	
	@FindBy(name ="business_email_id_text")
	WebElement businessEmailId;
	
	@FindBy(name ="pancard_text")
	WebElement panCard;
	
	@FindBy(name ="name_on_pancard_text")
	WebElement namePanCard;
	
	@FindBy(name ="business_rgtd_address_text")
	WebElement busnsRegtAddrs;
	
	@FindBy(name ="pincode_text")
	WebElement pinCode;
	
	@FindBy(name ="account_number_text")
	WebElement accountNumber;
	
	@FindBy(name ="account_name")
	WebElement accountName;
	
	@FindBy(name ="bank_name")
	WebElement bankName;
	
	@FindBy(name ="branch_name")
	WebElement branchName;
	
	@FindBy(name ="branch_city")
	WebElement branchCity;
	
	@FindBy(name ="bank_ifsc_code")
	WebElement bankIfscCode;
	
	@FindBy(name ="contact_name_text")
	WebElement contactNameText;
	
	@FindBy(name ="contact_email_text")
	WebElement contactEmailText;
	
	@FindBy(name ="contact_mobile_number")
	WebElement contactMobileNumber;
	
	@FindBy(xpath ="//button[contains(text(),'Submit')]")
	WebElement submitBn;
	
	@FindBy(xpath ="//h4[contains(text(),'Success')]")
	WebElement successMessage;
	
	@FindBy(xpath="//a[@href='https://bookmyhouse.com/services/admin/aggregator/updateAggregator?id=18']")
	WebElement editLink;
	
	@FindBy(name="child_marchent_id_text")
	WebElement enterMerchantId;
	
	
	public AddNewBank() {
		PageFactory.initElements(driver, this); //all login class object will intilized in driver or use PageFactory.initElements(driver, this)	
	}
	
	public void clickOnAddBankLink() {
		aggregatorMgmtLink.click();
		addbankLink.click();
		
	}
	
	public void addBuisnessInformation(String Buisness,String BEmail,String pCard,String nPCard, String bReAdr, String pCode,
			String actNo, String actName, String bnkName, String brnchName, String brchCity, String ifscCode, String cntcName,
			String emailTxt,String cntMblNo) {
		businessName.sendKeys(Buisness);
		businessEmailId.sendKeys(BEmail);
		panCard.sendKeys(pCard);
		namePanCard.sendKeys(nPCard);
		busnsRegtAddrs.sendKeys(bReAdr);
		pinCode.sendKeys(pCode);
		accountNumber.sendKeys(actNo);
		accountName.sendKeys(actName);
		bankName.sendKeys(bnkName);
		branchName.sendKeys(brnchName);
		branchCity.sendKeys(brchCity);
		bankIfscCode.sendKeys(ifscCode);
		contactNameText.sendKeys(cntcName);
		contactEmailText.sendKeys(emailTxt);
		contactMobileNumber.sendKeys(cntMblNo);
	}
	
	public void selectBusnscat(String busnsctgry) {
		Select select = new Select(driver.findElement(By.name("business_cat_text")));
		select.selectByVisibleText(busnsctgry);
	}
	
	public void selectBusinstype(String busnstype) {
		Select select = new Select(driver.findElement(By.name("business_type_text")));
		select.selectByVisibleText(busnstype);
	}
	
	public void selectCountry(String cntry) {
		Select select = new Select(driver.findElement(By.name("country")));
		select.selectByVisibleText(cntry);
	}
	
	public void selectState(String state) {
		Select select = new Select(driver.findElement(By.name("state")));
		select.selectByVisibleText(state);
	}
	
	public void selectCity(String city) {
		Select select = new Select(driver.findElement(By.name("city")));
		select.selectByVisibleText(city);
	}
	
	public void selectaccountType(String acntType) {
		Select select = new Select(driver.findElement(By.name("account_type_text")));
		select.selectByVisibleText(acntType);
	}
	
	public void submitButton() {
		submitBn.click();
	  
	}
	
	public void clickForConfirm() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
	}
	
	public boolean verifySuccessMessage() {
		return successMessage.isDisplayed();
	}
	
	public void editButton() {
		editLink.click();
	  
	}
	

	public void enterChildMerchantId(String Id) {
		enterMerchantId.sendKeys(Id);
		
	  
	}
	
	
	
	
	
}
