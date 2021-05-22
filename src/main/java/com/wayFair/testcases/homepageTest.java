package com.wayFair.testcases;

import java.awt.Window;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.wayFair.pages.homePage;

import KDD.keyword;

public class homepageTest extends keyword {
	@BeforeMethod
	public static void setup()
	{
		keyword.openBrowser();
		keyword.launchUrl();
		
		minWait();
		driver.manage().deleteAllCookies();
	}
	@Test(priority=1)
	public static void firstTestCase ()
	{
		
		homePage hm=PageFactory.initElements(keyword.driver, homePage.class);
		hm.closePopUp();
		minWait();
		log.info("Logo is available on the page");
		hm.verify_LogoIs_Available_OnThePage();
		Assert.assertTrue(true);
	}
	@Test(priority=2)
	public static void verify_ToSelect_FurnitureTab()
	{
		homePage hm=PageFactory.initElements(keyword.driver, homePage.class);
		hm.closePopUp();
		minWait();
		hm.verify_furnitureTab();
		minWait();
		hm.verifyToselect_Products("Table");
		minWait();
		
		Assert.assertTrue(true);
}
	@Test(priority=3)
	public static void verify_ToClickOn_AccountTab()
	{
		homePage hm=PageFactory.initElements(keyword.driver, homePage.class);
		hm.closePopUp();
		minWait();
		hm.clickOnAccountTab();
	}
//	@AfterMethod
//	public static void closeWindow()
//	{
//		driver.quit();
//	}
}