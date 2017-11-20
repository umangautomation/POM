package com.adminpanel.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.adminpanel.qa.base.TestBase;
import com.adminpanel.qa.pages.AddNewBank;
import com.adminpanel.qa.pages.HomePage;
import com.adminpanel.qa.pages.LoginPage;
import com.adminpanel.qa.util.TestUtil;

public class AddNewBankTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homepage;
	TestUtil testutil;
	AddNewBank addNewBank;
	String sheetName="Sheet1";
	AddNewBankTest(){
		super();
	}
		
	@BeforeMethod
	public void setup() throws InterruptedException {
		intialize();
		testutil = new TestUtil();
		loginPage = new LoginPage();
		addNewBank = new AddNewBank();
		homepage=loginPage.login(prop.getProperty("usertype"), prop.getProperty("email"), prop.getProperty("password"));
		}
		
	
  /*   @Test
	public void clickOnAddBankLinkTest()  {
    	 addNewBank.clickOnAddBankLink();
	}*/
     
     @DataProvider 
 	public Object[][] getAddBankTestData()  {
 		Object data[][] =TestUtil.getTestData(sheetName);
 		return data;
 	}				 
 			
	
     @Test(dataProvider="getAddBankTestData")
     public void addNewBankTest(String buisnes,String bEmail, String panCard,String namePcard,String bReAdrs,String pinCode,String acctNo,String acctName,
    		 String bankName, String branchName, String brachCity, String ifcCode, String cntcName, String emailText, String contMblNo) {
    	      addNewBank.clickOnAddBankLink();
    	      addNewBank.addBuisnessInformation(buisnes, bEmail, panCard, namePcard, bReAdrs, pinCode, 
    			 acctNo, acctName, bankName, branchName, brachCity, ifcCode, cntcName, emailText, contMblNo);
  	          addNewBank.selectBusnscat("Healthcare");
  	          addNewBank.selectBusinstype("LLP");
  	          addNewBank.selectState("Haryana");
  	          addNewBank.selectCity("Ambala");
  	          addNewBank.selectaccountType("Saving");
  	          addNewBank.submitButton();
  	          addNewBank.clickForConfirm();
  	          Assert.assertTrue(addNewBank.verifySuccessMessage());
  	        addNewBank.editButton();
  	      addNewBank.enterChildMerchantId("Merchant Id");
     }
     
     
     @AfterMethod
  	public void tearDown() {
  		//driver.quit();
  	}	
		
		
	

}
