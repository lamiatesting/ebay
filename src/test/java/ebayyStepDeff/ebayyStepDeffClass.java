package ebayyStepDeff;


import com.ebayyAction.qa.ebayyBoatsPageAction;
import com.ebayyAction.qa.ebayyBooksPageAction;
import com.ebayyAction.qa.ebayyHomePageAction;
import com.ebayyAction.qa.ebayyLaptopPageAction;
import com.ebayyUtility.qa.ebayyBaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ebayyStepDeffClass extends ebayyBaseClass{
	ebayyHomePageAction EbayyHomePageAction = new ebayyHomePageAction();
	ebayyLaptopPageAction EbayyLaptopPageAction = new ebayyLaptopPageAction();
	ebayyBooksPageAction EbayyBooksPageAction = new ebayyBooksPageAction();
	ebayyBoatsPageAction EbayyBoatsPageAction = new ebayyBoatsPageAction();

	
	@Given("^Launch Application <\"([^\"]*)\">$")
	public void launch_Application(String URL) throws Throwable {
		launchURL(URL);
	}
	
	@Then("^Input <\"([^\"]*)\"> In Search Field$")
	public void input_In_Search_Field(String searchItem) throws Throwable {
	    EbayyHomePageAction.InputsearchItemInSearchField(searchItem);
	}
	
	@Then("^Click Search Button$")
	public void click_Search_Button() throws Throwable {
	    EbayyHomePageAction.ClickSearchButton();
	}

	@Then("^Verify Laptop Page Is Displayed$")
	public void verify_Laptop_Page_Is_Displayed() throws Throwable {
	    EbayyLaptopPageAction.VerifyLaptopPageIsDisplayed();
	}
	
	@Then("^Click Books From Category Dropdown$")
	public void click_Books_From_Category_Dropdown() throws Throwable {
	    EbayyHomePageAction.ClickBooksFromCategoryDropdown();
	}

	@Then("^Verify Books Page is Displayed$")
	public void verify_Books_Page_is_Displayed() throws Throwable {
	    EbayyBooksPageAction.VerifyBooksPageisDisplayed();
	}
	
	@Then("^Click Boats Under Motor$")
	public void click_Boats_Under_Motor() throws Throwable {
	    EbayyHomePageAction.ClickBoatsUnderMotor();
	}

	@Then("^Verify Boats Page is Displayed$")
	public void verify_Boats_Page_is_Displayed() throws Throwable {
	    EbayyBoatsPageAction.VerifyBoatsPageisDisplayed();
	}
}
