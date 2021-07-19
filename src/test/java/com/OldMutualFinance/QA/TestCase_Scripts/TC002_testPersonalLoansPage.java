package com.OldMutualFinance.QA.TestCase_Scripts;


import org.testng.annotations.Test;

import com.OldMutualFinance.QA.PageObject_Repo.HomePage;
import com.OldMutualFinance.QA.PageObject_Repo.Personal_LoansPage;
import com.OldMutualFinance.QA.WebDriverCommands.ActionDriver;
import com.OldMutualFinance.QA.config.StartBrowser;

public class TC002_testPersonalLoansPage extends StartBrowser {

	//Constructor to access My User Defined WebDriver Commands
	public ActionDriver aDriver;


	@Test(priority = 2)
	public void Navigate_To_Personal_Loans_Page() throws Exception {
		ActionDriver aDriver = new ActionDriver();

		StartBrowser.childTest = StartBrowser.parentTest.createNode("Navigate to Personal Loans Page");
		Thread.sleep(6000);
		aDriver.mouseHover(HomePage.hoverSolutionsMenu, "'Our Solutions' Menu Item");
		Thread.sleep(6000);
		aDriver.click(HomePage.menuBtnPersonalLoan, "Personal Loan Btn");
		Thread.sleep(6000);
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Verify Personal Loans Page");
		aDriver.verifyElement(Personal_LoansPage.personalLoansTitle, true, "Personal Loans | Apply Online | Old Mutual");
		Thread.sleep(6000);
	}

}