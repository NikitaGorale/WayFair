package com.wayFair.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class livingRoomFurniturePage {
	@FindBy(xpath = "//*[@id=\"45982\"]/div/article/div[2]/div/ul/li[1]/a/div/div")
	WebElement Sofas;
	
	public void verify_ToSelect_Sofa()
	{
		Sofas.click();
	}
	

}
