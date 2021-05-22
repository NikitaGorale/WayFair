package com.wayFair.testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.wayFair.pages.homePage;
import com.wayFair.pages.livingRoomFurniturePage;

import KDD.keyword;



public class livingRoomFurnitureTest extends keyword{
	@Test
	public void livingRoomPageTest()
	{
	keyword.openBrowser();
	keyword.launchUrl();
	
	minWait();
	homePage hm=PageFactory.initElements(keyword.driver, homePage.class);
	hm.closePopUp();
	hm.verify_furnitureTab();
	minWait();
	
	livingRoomFurniturePage room=PageFactory.initElements(keyword.driver, livingRoomFurniturePage.class);
   minWait();
   JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,300)");
	minWait();
    room.verify_ToSelect_Sofa();
    Assert.assertTrue(true);
}
}