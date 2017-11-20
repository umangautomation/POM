package com.adminpanel.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.adminpanel.qa.base.TestBase;
import com.adminpanel.qa.pages.HomePage;
import com.adminpanel.qa.pages.LoginPage;

public class LoginPageTest  extends TestBase{
	
	HomePage homepage;
	LoginPage loginPage;
	
	
	public LoginPageTest() throws IOException {
		
		super();
	}
	
	@BeforeMethod
	public void setup() {
		intialize();
		loginPage = new LoginPage();
	}
	 
	
	@Test(priority=1)
	public void loginPageTitle() {
		String title =loginPage.validatepageTitle();
		Assert.assertEquals(title, "BMH Admin Panel | Dashboard");
	}
	
	@Test(priority=2)
	public void valiateLogin() {
		homepage=loginPage.login(prop.getProperty("usertype"), prop.getProperty("email"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	

}
