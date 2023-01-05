package com.ebayyLocator.qa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ebayyUtility.qa.ebayyBaseClass;

public class ebayyLaptopPageLocator extends ebayyBaseClass{
	public ebayyLaptopPageLocator() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h2[text()='RAM Size']")
	public WebElement verifyLaptop;

}
