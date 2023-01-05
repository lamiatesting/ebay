package com.ebayyAction.qa;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.ebayyLocator.qa.ebayyHomePageLocator;
import com.ebayyUtility.qa.ebayyBaseClass;
import com.ebayyUtility.qa.ebayyTestDataClass;

public class ebayyHomePageAction extends ebayyBaseClass{
	ebayyHomePageLocator EbayyHomePageLocator = new ebayyHomePageLocator();
	
	public void InputsearchItemInSearchField(String searchItem) {
		EbayyHomePageLocator.searchField.sendKeys(ebayyTestDataClass.searchItem);
	}
	
	public void ClickSearchButton() {
		EbayyHomePageLocator.searchButton.click();
	}
	
	public void ClickBooksFromCategoryDropdown() {
		Select dropdown = new Select(EbayyHomePageLocator.catDropdown);
		dropdown.selectByVisibleText("Books");
	}
	
	public void ClickBoatsUnderMotor() {
		Actions ac = new Actions(driver);
		ac.moveToElement(EbayyHomePageLocator.motorsLink).build().perform();
		
		EbayyHomePageLocator.boatsLink.click();
	}


}
