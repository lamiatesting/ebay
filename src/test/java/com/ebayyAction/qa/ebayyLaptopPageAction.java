package com.ebayyAction.qa;

import org.testng.Assert;

import com.ebayyLocator.qa.ebayyLaptopPageLocator;
import com.ebayyUtility.qa.ebayyBaseClass;

public class ebayyLaptopPageAction extends ebayyBaseClass{
	ebayyLaptopPageLocator EbayyLaptopPageLocator = new ebayyLaptopPageLocator();
	
	public void VerifyLaptopPageIsDisplayed() {
		boolean verify = EbayyLaptopPageLocator.verifyLaptop.isDisplayed();
		Assert.assertTrue(verify);
	}
}
