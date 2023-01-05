package com.ebayyLocator.qa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ebayyUtility.qa.ebayyBaseClass;

public class ebayyBoatsPageLocator extends ebayyBaseClass{
	public ebayyBoatsPageLocator() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "s0-28_1-9-0-1[0]-0-2-0-title")
	public WebElement verifyBoats;

}
