package com.OldMutualFinance.QA.TestCase_Scripts;

import org.testng.annotations.Test;

import com.OldMutualFinance.QA.PageObject_Repo.HomePage;
import com.OldMutualFinance.QA.WebDriverCommands.ActionDriver;
import com.OldMutualFinance.QA.config.StartBrowser;

public class TC001_testHomePage extends StartBrowser {

	//Constructor to access My User Defined WebDriver Commands
	public ActionDriver aDriver;

	@Test(priority = 1)
	public void Browse_To_Old_Mutual_Finance_Home_Screen() throws Throwable {
		ActionDriver aDriver = new ActionDriver();

		StartBrowser.childTest = StartBrowser.parentTest.createNode("Navigate to Old Mutual Finance Website");
		aDriver.navigateToApplication(driver.getCurrentUrl());
		Thread.sleep(6000);
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Verify Old Mutual Finance Home Page");
		aDriver.verifyElement(HomePage.menuBtnHome, true, "Home");


	}


}





