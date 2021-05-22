package com.wayFair.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.wayFair.pages.homePage;
import com.wayFair.pages.livingRoomFurniturePage;
import com.wayFair.pages.sofasPage;

import KDD.keyword;

public class sofasPageTest extends keyword {
	@Test
	public void select_Type_DesignOfSofa() {
		keyword.openBrowser();
		keyword.launchUrl();

		minWait();
		homePage hm = PageFactory.initElements(keyword.driver, homePage.class);
		minWait();
		hm.closePopUp();
		minWait();
		hm.verify_furnitureTab();
		minWait();

		livingRoomFurniturePage room = PageFactory.initElements(keyword.driver, livingRoomFurniturePage.class);
		minWait();
		room.verify_ToSelect_Sofa();
		minWait();
		sofasPage sofa = PageFactory.initElements(keyword.driver, sofasPage.class);

		minWait();
		sofa.hourOn_type_design();
		minWait();
		sofa.select_designOfSofa();
		minWait();
		sofa.select_colorOfSofa();
		minWait();
		sofa.slect_MaterialOfSofa();
		minWait();
		
		sofa.select_sizeOfSofa();
		minWait();
		sofa.clickOn_PricePerItem();

		Assert.assertTrue(true);
	}

}
