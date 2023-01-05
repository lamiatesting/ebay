package com.ebayyLocator.qa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ebayyUtility.qa.ebayyBaseClass;

public class ebayyBooksPageLocator extends ebayyBaseClass{
	public ebayyBooksPageLocator() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='Books & Magazines']")
	public WebElement verifyBooks;

}
