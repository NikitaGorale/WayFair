package com.wayFair.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.wayFair.customeUtil.propertyFile;

import KDD.keyword;

public class homePage extends keyword {
	@FindBy(xpath = "//*[@id=\"doc3\"]/div[3]/div/div/div/div/button")
	WebElement closePopUp;
	
	@FindBy(xpath = "//*[@id=\"store_nav\"]/div/nav/div[1]")
	WebElement logo;
	
	@FindBy(css= ".DepartmentItem-link")
	WebElement furnitureTab;
	
	@FindBy(css="input[type=search]")
	WebElement searchBar;
	
	@FindBy(css=".MyAccountContent")
	WebElement myAccountTab;
	
	@FindBy(xpath="//*[@id=\"textInput-0\"]")
	WebElement emailAddress;
	
	
public void closePopUp ()
{
	closePopUp.click();
}
public void verify_LogoIs_Available_OnThePage()
{
	logo.isDisplayed();
}

public void verify_furnitureTab()
{
	Actions action=new Actions(driver);
	action.moveToElement(furnitureTab).click();
	action.perform();
}

public void verifyToselect_Products(String value)
{
	searchBar.click();
	searchBar.sendKeys(value);
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	searchBar.sendKeys(Keys.ARROW_DOWN);
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	searchBar.sendKeys(Keys.ENTER);
	
}

public void clickOnAccountTab()
{
	myAccountTab.click();
	WebDriverWait wait=new WebDriverWait(driver, 10);
	emailAddress.sendKeys(propertyFile.getProperty("emailAddress"));
	minWait();
}



}
