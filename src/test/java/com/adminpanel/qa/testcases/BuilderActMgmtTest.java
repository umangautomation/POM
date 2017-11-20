package com.adminpanel.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.adminpanel.qa.base.TestBase;
import com.adminpanel.qa.pages.BuilderActMgmt;
import com.adminpanel.qa.pages.BuilderList;
import com.adminpanel.qa.pages.HomePage;
import com.adminpanel.qa.pages.LoginPage;
import com.adminpanel.qa.util.TestUtil;


public class BuilderActMgmtTest  extends TestBase {
	
	   
		LoginPage loginPage;
		HomePage homepage;
		TestUtil testutil;
		BuilderList builderlist;
		BuilderActMgmt builderactmgt;
		
		public BuilderActMgmtTest() {
			super();
			}
		
		@BeforeMethod
		public void setup() throws InterruptedException {
			intialize();
			testutil = new TestUtil();
			loginPage = new LoginPage();
			builderactmgt = new BuilderActMgmt();
			homepage=loginPage.login(prop.getProperty("usertype"), prop.getProperty("email"), prop.getProperty("password"));
			}
			
			
		
         @Test
		public void searchBuilderTest() throws InterruptedException {
			builderactmgt.searchBuilder("Mukul m");
			
		}
			
         @AfterMethod
      	public void tearDown() {
      		//driver.quit();
      	}
		}
		


