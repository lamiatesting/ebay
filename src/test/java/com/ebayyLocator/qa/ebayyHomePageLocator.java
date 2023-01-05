package com.ebayyLocator.qa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ebayyUtility.qa.ebayyBaseClass;

public class ebayyHomePageLocator extends ebayyBaseClass{
	public ebayyHomePageLocator() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "gh-ac")
	public WebElement searchField;
	
	@FindBy(id = "gh-btn")
	public WebElement searchButton;
	
	@FindBy(id = "gh-cat")
	public WebElement catDropdown;
	
	@FindBy(linkText = "Motors")
	public WebElement motorsLink;
	
	@FindBy(linkText = "Boats")
	public WebElement boatsLink;
}
