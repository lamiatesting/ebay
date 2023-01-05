package com.ebayyAction.qa;

import org.testng.Assert;

import com.ebayyLocator.qa.ebayyBooksPageLocator;
import com.ebayyUtility.qa.ebayyBaseClass;

public class ebayyBooksPageAction extends ebayyBaseClass{
	ebayyBooksPageLocator EbayyBooksPageLocator = new ebayyBooksPageLocator();
	
	public void VerifyBooksPageisDisplayed() {
		boolean verify = EbayyBooksPageLocator.verifyBooks.isDisplayed();
		Assert.assertTrue(verify);
	}
}
