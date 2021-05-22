package com.wayFair.pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import KDD.keyword;

public class sofasPage extends keyword {
	@FindBy(xpath = "//*[@id=\"bd\"]/div[2]/div[1]/div[1]/span/button/span")
	WebElement type_design;

	@FindBy(xpath = "//*[@id=\"bd\"]/div[2]/div[1]/div[1]/span/div/span/div/div/div/div/div/div[1]/div/div/div[1]")
	WebElement selectSofa;

	@FindBy(xpath = "//*[@id=\"bd\"]/div[2]/div[1]/div[2]/span/button/span")
	WebElement UpholsteryColor;

	@FindBy(xpath = "//*[@id=\"bd\"]/div[2]/div[1]/div[2]/span/div/span/div/div/div/div/div/div[1]")
	List<WebElement> selectCheckbox;

	@FindBy(xpath = "//*[contains(text(),\"Upholstery Material\")]")
	WebElement selectMaterial;

	@FindBy(xpath = "//*[@id=\"bd\"]/div[2]/div[1]/div[3]/span/div/span/div/div")
	WebElement selectFromDropDown;

	@FindBy(xpath = "//*[@id=\"bd\"]/div[2]/div[1]/div[3]/span/div/span/div/div/div/div/div[1]/div[1]")
	WebElement dropdownmenu;

	@FindBy(xpath = "//*[@id=\"bd\"]/div[2]/div[1]/div[4]/span/button")
	WebElement sizeOfSofa;
	
	@FindBy(xpath = "//*[@id=\"bd\"]/div[2]/div[1]/div[4]/span/div/span/div/div")
	WebElement dropdownOfsizeOfSofa;

	@FindBy(xpath = "//*[@id=\"bd\"]/div[2]/div[1]/div[4]/span/div/span/div/div/div/div/div/div[2]/div/div[1]")
	WebElement extraDeep;

	@FindBy(xpath = "//*[@id=\"bd\"]/div[2]/div[1]/div[4]/span/div/span/div/div")
List<WebElement> sizeList;	

	@FindBy(css = ".RangeInput-input")
	WebElement minWidth;
	
	@FindBy(xpath = "//*[@id=\"bd\"]/div[2]/div[1]/div[5]/span/button/span")
	WebElement pricePerItem;
	
	@FindBy(xpath = "//*[@id=\"bd\"]/div[2]/div[1]/div[5]/span/div/span/div/div/div/div/div/div[3]")
	List<WebElement> priceRange;
	

	public void hourOn_type_design() {
		Actions action = new Actions(driver);
		action.moveToElement(type_design).perform();
	}

	public void select_designOfSofa() {
		selectSofa.click();
	}

	public void select_colorOfSofa() {
		Actions action = new Actions(driver);
		action.moveToElement(UpholsteryColor).perform();
		minWait();
		List<WebElement> list = selectCheckbox;
		int sofas = list.size();
		for (int i = 0; i < sofas; i++) {
			String sofa = list.get(i).getText();
			if (sofa.equalsIgnoreCase("Gray")) {
				list.get(i).click();
				break;
			}
		}
	}

	public void slect_MaterialOfSofa() {
		Actions action = new Actions(driver);
		action.moveToElement(selectMaterial).perform();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		dropdownmenu.click();

	}

	public void select_sizeOfSofa() {
		Actions action = new Actions(driver);
		action.moveToElement(sizeOfSofa).perform();
		minWait();
		System.out.println("select seat dept");
		extraDeep.click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
		

		/*List<WebElement> optionList = sizeList;
		// The option you mentioned in your example is stored at position #17 in an array so either you can manually enter the number or you can find it by running FOR lool
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", minWidth );

		// Other ther way that I prefer is:
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);", minWidth);
		try {
			Thread.sleep(250);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		

}
	public void selectSizeFromDropdown()
	{
		Actions action=new Actions(driver);
		action.moveToElement(dropdownOfsizeOfSofa).perform();
	}
	
	
	public void clickOn_PricePerItem()
	{
		pricePerItem.click();
		minWait();
		List<WebElement> prices=  priceRange;
		Iterator<WebElement> itr= prices.iterator();
		driver.navigate().refresh();
		pricePerItem.click();
		
		
		
	}
}
