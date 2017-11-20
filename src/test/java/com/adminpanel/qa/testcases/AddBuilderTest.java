package com.adminpanel.qa.testcases;




import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.adminpanel.qa.base.TestBase;
import com.adminpanel.qa.pages.AddNewBuilder;
import com.adminpanel.qa.pages.BuilderList;
import com.adminpanel.qa.pages.HomePage;
import com.adminpanel.qa.pages.LoginPage;
import com.adminpanel.qa.util.TestUtil;

public class AddBuilderTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homepage;
	TestUtil testutil;
	BuilderList builderlist;
	AddNewBuilder addnewBuilder;
	
	String sheetName="Sheet1";
	
	public AddBuilderTest() {
		super();
		}
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		intialize();
		testutil = new TestUtil();
		loginPage = new LoginPage();
		builderlist= new BuilderList();
		
		homepage=loginPage.login(prop.getProperty("usertype"), prop.getProperty("email"), prop.getProperty("password"));
		builderlist=homepage.clickOnBuilderLink();
		addnewBuilder=builderlist.clickOnAddBuilderLink();
		
		
	}
	
	@DataProvider 
	public Object[][] getAddBankTestData()  {
		Object data[][] =TestUtil.getTestData(sheetName);
		return data;
	}				 
								 

     @Test(dataProvider="getAddBankTestData")
     public void addBuilderTest(String FirmName,String BuilderUrl,String FirstName ,String LastName,String EmailId,String MobileNo,
 			String Address1,String UserName, String CompanName,String ProjectDelivered, String ONGOINGProject,String Description) {
    	 //addnewBuilder.createNewBuilder("Testtt firm", "www.tesrt.com", "Autwomartion", "Twtst", "ttest@bookmyhouse.com", "9589789983", 
    			 //"Test ad142", "tesht ustrname", "comupny1 name", "2016", "Sq Fts", "10", "12","test12"); 
    	 addnewBuilder.createNewBuilder(FirmName, BuilderUrl, FirstName, LastName, EmailId, MobileNo, Address1, UserName, CompanName, ProjectDelivered, ONGOINGProject, Description);
    	 addnewBuilder.selectEstbYear("2016");
    	 addnewBuilder.selectDeliverdArea("Sq Fts");
    	 addnewBuilder.uploadLogo();
    	 addnewBuilder.submitButton();
    	/* Assert.assertTrue(builderlist.verifybuilderListLink(),"bulider label list is misisng");
*/    	
     }
     
     
     @AfterMethod
 	public void tearDown() {
 		driver.quit();
 	}
 	
 	
}
