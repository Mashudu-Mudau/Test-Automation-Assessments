package com.OldMutualFinance.QA.config;



import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import org.testng.annotations.AfterSuite;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StartBrowser {

	public static WebDriver driver;

	//Variables related to Extent Report
	public static ExtentReports extent;
	public static ExtentTest parentTest;
	public static ExtentTest childTest;
	ExtentSparkReporter sparkReporter;

	@BeforeTest
	//Generates an extent report and initializing the report
	public void generateReport()
	{
		sparkReporter = new ExtentSparkReporter("Reports/Old_Mututal_Finance_TestAutomation_Reports.html");
		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
	}

	@BeforeMethod
	//getting the test method name dynamically to be displayed in the report
	public void methodName(Method method)
	{
		parentTest = extent.createTest(method.getName());
	}

	@BeforeSuite
	@Parameters({"browser","url"})
	public void beforeClass(String browser, String app) {

		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}


		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get(app);
	}

	@AfterSuite
	public void afterClass() {
		//closses the WebBrowser
		driver.quit();
		//closes the extent report
		extent.flush();
	}

}
