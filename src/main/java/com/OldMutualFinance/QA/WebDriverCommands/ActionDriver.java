package com.OldMutualFinance.QA.WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.OldMutualFinance.QA.config.StartBrowser;
import com.aventstack.extentreports.MediaEntityBuilder;

//These are Global Customised Re-Useable WebDriver Action Commands  
public class ActionDriver {
	//Instance to 
	public WebDriver driver;

	//constructer to access the StartBrowser methods
	public ActionDriver(){

		driver = StartBrowser.driver;
	}


	/**
	 * Used to navigate to the web site
	 * @param url -- Old Mutual Web site
	 */
	public void navigateToApplication(String url) {
		try {
			driver.get(url);
			StartBrowser.childTest.pass("Successfully Navigated to URL: "+url,
					//Specifying the type of screenshot generated and embedding it to the - html report type
					MediaEntityBuilder.createScreenCaptureFromBase64String(screenShort()).build());

		}
		catch(Exception e) {
			StartBrowser.childTest.fail("Unable to navigate to URL :"+url,
					//Specifying the type of screenshot generated and embedding it to the - html report type
					MediaEntityBuilder.createScreenCaptureFromBase64String(screenShort()).build());
			//Specifying the error log 'error excpetion' - when test fails on xetent report
			StartBrowser.childTest.info(e);
			throw e;
		}
	}


	/**
	 * Used to perform Click action in buttons, links, radio buttons and check boxes
	 * @param locator -- Get it from Object Repository
	 * @param eleName -- Name of the element
	 */
	public void click(By locator, String eleName)throws Exception {
		try {
			driver.findElement(locator).click();
			StartBrowser.childTest.pass("Successfully Clicked on: "+eleName,
					//Specifying the type of screenshot generated and embedding it to the - html report type
					MediaEntityBuilder.createScreenCaptureFromBase64String(screenShort()).build());
		}
		catch(Exception e) {
			StartBrowser.childTest.fail("Unable to Click on :"+eleName,
					//Specifying the type of screenshot generated and embedding it to the - html report type
					MediaEntityBuilder.createScreenCaptureFromBase64String(screenShort()).build());
			//Specifying the error log 'error excpetion' - when test fails on xetent report
			StartBrowser.childTest.info(e);
			throw e;

		}
	}


	/**
	 * Used to Enter Test Data in TextBoxes or Text Area
	 * @param locator -- Get it from Object Repository
	 * @param eleName -- Name of the element
	 */
	public void enter_txt(By locator, String testData, String eleName)throws Exception {
		try {
			driver.findElement(locator).sendKeys(testData);
			StartBrowser.childTest.pass("Successfully Entered Data in: "+eleName +"With Data : "+testData,
					//Specifying the type of screenshot generated and embedding it to the - html report type
					MediaEntityBuilder.createScreenCaptureFromBase64String(screenShort()).build());
		}
		catch(Exception e) {
			StartBrowser.childTest.fail("Unable to Enter testData in :"+eleName +"With Data :" +testData,
					//Specifying the type of screenshot generated and embedding it to the - html report type
					MediaEntityBuilder.createScreenCaptureFromBase64String(screenShort()).build());
			//Specifying the error log 'error excpetion' - when test fails on xetent report
			StartBrowser.childTest.info(e);
			throw e;

		}
	}


	/**
	 * Used to Hover on elements
	 * @param locator -- Get it from Object Repository
	 * @param eleName -- Name of the element
	 */
	public void mouseHover(By locator, String eleName)throws Exception {
		try {
			Actions a = new Actions(driver);

			WebElement we = driver.findElement(locator);
			a.moveToElement(we);
			WebElement subMenu = driver.findElement(locator);
			a.moveToElement(subMenu).perform();//moving mouse to objected represented by 'we' variable
			StartBrowser.childTest.pass("Successfully Hovered On: "+eleName,
					//Specifying the type of screenshot generated and embedding it to the - html report type
					MediaEntityBuilder.createScreenCaptureFromBase64String(screenShort()).build());
		}
		catch(Exception e) {
			StartBrowser.childTest.fail("Unable to Hover On :"+eleName,
					//Specifying the type of screenshot generated and embedding it to the - html report type
					MediaEntityBuilder.createScreenCaptureFromBase64String(screenShort()).build());
			//Specifying the error log 'error exception' - when test fails on extent report
			StartBrowser.childTest.info(e);
			throw e;

		}
	}


	/**
	 * Used to Verify or Validate 
	 * @param locator -- Get it from Object Repository
	 * @param eleName -- Name of the element
	 */
	public void verifyElement(By locator,boolean result, String eleName)throws Exception {
		try {
			result = driver.getPageSource().contains(eleName);
			if (result==true) {
				StartBrowser.childTest.pass("Successfully Verified: "+eleName +" as per ScreenShot below: ",
						//Specifying the type of screenshot generated and embedding it to the - html report type
						MediaEntityBuilder.createScreenCaptureFromBase64String(screenShort()).build());
			}
			else {

				StartBrowser.childTest.fail("Unable to Verify :"+eleName +" as per ScreenShot below :",
						//Specifying the type of screenshot generated and embedding it to the - html report type
						MediaEntityBuilder.createScreenCaptureFromBase64String(screenShort()).build());
				//Specifying the error log 'error excpetion' - when test fails on xetent report
				StartBrowser.childTest.info(eleName);


			}
		}
		catch(Exception e) {

			StartBrowser.childTest.fail("Unable to Verify :"+eleName +" as per ScreenShot below: ",
					//Specifying the type of screenshot generated and embedding it to the - html report type
					MediaEntityBuilder.createScreenCaptureFromBase64String(screenShort()).build());
			//Specifying the error log 'error excpetion' - when test fails on xetent report
			StartBrowser.childTest.info(e);
			throw e;
		}
	}

	/**
	 * Used to Scroll though the web page
	 * @param locator -- Get it from Object Repository
	 * @param eleName -- Name of the element
	 */
	public void scrollDownPage(By locator, String eleName1)throws Exception {
		try {

			JavascriptExecutor js = (JavascriptExecutor) driver;

			WebElement eleName = driver.findElement(locator);
			// Scrolling down the page till the element is found		
			js.executeScript("window.scrollBy(0,1200)", "");
			StartBrowser.childTest.pass("Successfully Scrolled Down to: "+eleName,
					//Specifying the type of screenshot generated and embedding it to the - html report type
					MediaEntityBuilder.createScreenCaptureFromBase64String(screenShort()).build());
		}
		catch(Exception e) {
			StartBrowser.childTest.fail("Failed to Scroll Down to :"+eleName1,
					//Specifying the type of screenshot generated and embedding it to the - html report type
					MediaEntityBuilder.createScreenCaptureFromBase64String(screenShort()).build());
			//Specifying the error log 'error excpetion' - when test fails on xetent report
			StartBrowser.childTest.info(e);
			throw e;

		}
	}


	//Method to add screenshots for failed tests
	public String screenShort() {

		return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
	}

}
