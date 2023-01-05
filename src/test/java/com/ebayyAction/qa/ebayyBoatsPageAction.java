package com.ebayyAction.qa;

import org.testng.Assert;

import com.ebayyLocator.qa.ebayyBoatsPageLocator;
import com.ebayyUtility.qa.ebayyBaseClass;

public class ebayyBoatsPageAction extends ebayyBaseClass{
	ebayyBoatsPageLocator EbayyBoatsPageLocator = new ebayyBoatsPageLocator();
	
	public void VerifyBoatsPageisDisplayed() {
		boolean verify = EbayyBoatsPageLocator.verifyBoats.isDisplayed();
		Assert.assertTrue(verify);
	}
}
