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
import com.adminpanel.qa.util.TestUtil;

public class BuilderListPageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homepage;
	TestUtil testutil;
	BuilderList builderlist;


public BuilderListPageTest() throws IOException {
	super();
 }

@BeforeMethod
public void setup() throws InterruptedException {
	intialize();
	testutil = new TestUtil();
	loginPage = new LoginPage();
	builderlist= new BuilderList();
	homepage=loginPage.login(prop.getProperty("usertype"), prop.getProperty("email"), prop.getProperty("password"));
	//builderlist=homepage.clickOnBuilderLink();
}

/*
@Test(priority=1)
public void verifybuilderListLabel() {
	Assert.assertTrue(builderlist.verifybuilderListLink(),"bulider label list is misisng");
	
}*/


@Test(priority=1)
public void selectBuilderByFirmNameTest() throws InterruptedException {
	builderlist=homepage.clickOnBuilderLink();
	builderlist.selectBuilderByFirmName("AARONE GROUP");	
}

@Test(priority=2)
public void selectmultiBuilderByFirmNameTest() throws InterruptedException {
	builderlist.selectBuilderByFirmName("AARONE GROUP");
	builderlist.selectBuilderByFirmName("ABP");
	
}

@Test(priority=3)
public void clickOnAddBuilderLinkTest() throws InterruptedException {
	builderlist.clickOnAddBuilderLink();
	
}

@AfterMethod
public void tearDown() {
	driver.quit();
}




}
