package com.OldMutualFinance.QA.PageObject_Repo;

import org.openqa.selenium.By;

public class Personal_LoansPage {

	public static By menuBtnHome = By.xpath("//*[@id=\"app\"]/div/om-solutions-detail-page/om-page/div/div/div/div/header/div/om-header-with-breadcrumbs/div/om-main-navigation/div[1]/nav/div[1]/div[2]/om-main-navigation-menu/ul/li[1]/ul/li[1]/a");
	public static By titleName = By.tagName("title");
	public static By hoverSolutionsMenu = By.xpath("//*[@id=\"app\"]/div/om-solutions-detail-page/om-page/div/div/div/div/header/div/om-header-with-breadcrumbs/div/om-main-navigation/div[1]/nav/div[1]/div[2]/om-main-navigation-menu/ul/li[1]/ul/li[3]");
	public static By h1PersonalLoan = By.tagName("h1");
	public static By personalLoansTitle = By.tagName("title");
	public static By calculatorField = By.xpath("//*[@id=\"blta0166b1bd8387d20\"]/div");


	public static By selectLoanDropDown = By.xpath("//*[@id=\"loanAmount\"]/div/div/div/om-form-dropdown-field/div/div[1]/span[1]");
	public static By selectLoanAmount = By.id("R50000");
	public static By btnNEXT = By.xpath("//*[@id=\"undefined\"]/button/span[1]");
	public static By selectMonthsDropDown = By.xpath("//*[@id=\"repaymentDuration\"]/div/div/div/om-form-dropdown-field/div/div[1]/span[1]");
	public static By btnCalculateLoan = By.xpath("/html/body/div/div[1]/om-wc-config/div/om-page/div/div/main/om-application-container/div/om-1-col-layout/div/om-section/div/div[2]/div[2]/div/om-personal-loans-calculator/div/div[2]/div[1]/div[1]/div/om-button/button/span[1]");
	public static By selectLoanMonths = By.id("60 Months");

	public static By monthlyRepayableAmounts = By.xpath("/html/body/div/div[1]/om-wc-config/div/om-page/div/div/main/om-application-container/div/om-1-col-layout/div/om-section/div/div[2]/div[2]/div/om-personal-loans-calculator/div/div[2]/div[2]/om-calculator-result/div[2]/h5/strong");


}

