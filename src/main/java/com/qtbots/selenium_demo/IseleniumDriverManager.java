package com.qtbots.selenium_demo;

import org.openqa.selenium.WebElement;

public interface IseleniumDriverManager {
	void launchBrowser();
	void loginToQTApplication() throws Exception;
	void quitApplication();
	void waitforElementVisibleExplicit(int iSecondsToWait,WebElement ele);
	

}
