package com.adminpanel.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.adminpanel.qa.base.TestBase;
import com.adminpanel.qa.pages.BuilderList;
import com.adminpanel.qa.pages.HomePage;
import com.adminpanel.qa.pages.LoginPage;

    public class HomePageTest extends TestBase {
    	LoginPage loginPage;
    	HomePage homepage;
    	BuilderList builderlist;

	
    public HomePageTest() throws IOException {
		super();
	 }
    
    @BeforeMethod
	public void setup() {
		intialize();
		loginPage = new LoginPage();
		builderlist= new BuilderList();
		homepage=loginPage.login(prop.getProperty("usertype"), prop.getProperty("email"), prop.getProperty("password"));
	}
    
    @Test
    public void verifyHomePageTitleTest() {
    	String homepagetitle=homepage.verifyHomePageTitle();
    	Assert.assertEquals(homepagetitle, "BMH Admin Panel | Dashboard","Title not Matched");
    }
    
    
    @Test
    public void verifyUserNameLabelTest() {
    	Assert.assertTrue(homepage.verifyUserNameLabel()); 
    	
    }
    
    @Test
    public void verifyclickOnBuilderLinkTest() throws InterruptedException {
    	builderlist=homepage.clickOnBuilderLink();
    }
 
    
    
    
    @AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	 

}
