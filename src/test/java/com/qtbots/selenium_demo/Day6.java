package com.qtbots.selenium_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Day6 extends TestBase {

	public static void main(String[] args) throws Exception {
		oSel.launchBrowser();
		oSel.loginToQTApplication();
		experimentFileUpload(oSel);
		

	}

	private static void experimentFileUpload(IseleniumDriverManager oSel) throws Exception {
		WebElement eleFileUpload=driver.findElement(By.xpath("//a[contains(text(),'File Upload')]"));
		oSel.waitforElementVisibleExplicit(10, eleFileUpload);
		eleFileUpload.click();
		WebElement eleChooseFile=driver.findElement(By.id("logo"));
		oSel.waitforElementVisibleExplicit(10, eleChooseFile);
		eleChooseFile.sendKeys(System.getProperty("user.dir")+"/4bdce00b03f46925e89545670629469f.jpg");
		if(driver.findElement(By.xpath("//div[@class='imagearea']")).isDisplayed())
		{
		System.out.println("image displayed");
		}
		else {
			throw new Exception("Failed Display");
		}
		
	}

}
