package com.OldMutualFinance.QA.PageObject_Repo;

import org.openqa.selenium.By;

//Home Page Object Elements identification Collection
public class HomePage {

	public static By menuBtnHome = By.xpath("//*[@id=\"app\"]/div/om-solutions-detail-page/om-page/div/div/div/div/header/div/om-header-with-breadcrumbs/div/om-main-navigation/div[1]/nav/div[1]/div[2]/om-main-navigation-menu/ul/li[1]/ul/li[1]/a");
	public static By titleName = By.tagName("title");
	public static By hoverSolutionsMenu = By.xpath("/html/body/om-wc-config/div/om-solutions-detail-page/om-page/div/div/div/div/header/div/om-header-with-breadcrumbs/div/om-main-navigation/div[1]/nav/div[1]/div[2]/om-main-navigation-menu/ul/li[1]/ul/li[3]/a");
	public static By menuBtnPersonalLoan = By.xpath("//*[@id=\"app\"]/div/om-solutions-detail-page/om-page/div/div/div/div/header/div/om-header-with-breadcrumbs/div/om-main-navigation/div[1]/nav/div[1]/div[2]/om-main-navigation-menu/ul/li[1]/ul/li[3]/ul/li[1]/ul/li[2]/a");


}
