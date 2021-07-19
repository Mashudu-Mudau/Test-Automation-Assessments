package com.OldMutualFinance.QA.TestCase_Scripts;


import org.testng.annotations.Test;

import com.OldMutualFinance.QA.PageObject_Repo.Personal_LoansPage;
import com.OldMutualFinance.QA.WebDriverCommands.ActionDriver;
import com.OldMutualFinance.QA.config.StartBrowser;

public class TC003_testCalculatePersonalLoan extends StartBrowser{

	//Constructor to access My User Defined WebDriver Commands
	public ActionDriver aDriver;


	@Test(priority = 3)
	//User Defined Function To Scroll down
	public void Calculate_Personal_Loan() throws Exception {

		ActionDriver aDriver = new ActionDriver();

		StartBrowser.childTest = StartBrowser.parentTest.createNode("Navigate to Personal Loan Calculator");
		aDriver.scrollDownPage(Personal_LoansPage.calculatorField, "Personal Loan Calculator");
		//Thread.sleep(6000);
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Calculate Personal Loan");
		aDriver.click(Personal_LoansPage.selectLoanDropDown, "How much do you need");
		Thread.sleep(6000);
		aDriver.click(Personal_LoansPage.selectLoanAmount, "R50 000");
		Thread.sleep(6000);
		aDriver.click(Personal_LoansPage.btnNEXT, "Next");
		Thread.sleep(6000);
		aDriver.click(Personal_LoansPage.selectMonthsDropDown, "How long do you need to repay it?");
		Thread.sleep(6000);
		aDriver.click(Personal_LoansPage.selectLoanMonths, "60 Months");
		Thread.sleep(6000);
		aDriver.click(Personal_LoansPage.btnCalculateLoan, "Button Calculate Loan");
		Thread.sleep(6000);
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Validate Total Loan Repayment");
		aDriver.verifyElement(Personal_LoansPage.monthlyRepayableAmounts, true, "R1 656.43 - R1 810.05");
		Thread.sleep(6000);
	}
}
