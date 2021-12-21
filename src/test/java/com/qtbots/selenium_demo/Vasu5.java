package com.qtbots.selenium_demo;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Vasu5 extends TestBase {

	public static void main(String[] args) throws Exception   {
		oSel.launchBrowser();
		oSel.loginToQTApplication();
		//experimentAlert(oSel);
		WebElement eleSwitchTo=driver.findElement(By.xpath("//button[contains(text(),'Switch To')]   "));
		oSel.waitforElementVisibleExplicit(10, eleSwitchTo);
		eleSwitchTo.click();
		WebElement eleWindows=driver.findElement(By.xpath("//a[contains(text(),'Windows')]"));
		oSel.waitforElementVisibleExplicit(10, eleWindows);
		eleWindows.click();
		WebElement eleNewTab=driver.findElement(By.xpath("//*[@class='bootbutton']"));
		oSel.waitforElementVisibleExplicit(10, eleNewTab);
		eleNewTab.click();
		ArrayList<String> liwinTabs=new ArrayList(driver.getWindowHandles());
		System.out.println(liwinTabs);
		driver.switchTo().window(liwinTabs.get(1));
		
		

	}

	private static void experimentAlert(IseleniumDriverManager oSel) throws InterruptedException {
		WebElement eleSwitchTo=driver.findElement(By.xpath("//button[contains(text(),'Switch To')]   "));
		oSel.waitforElementVisibleExplicit(10, eleSwitchTo);
		eleSwitchTo.click();
		WebElement eleAlert=driver.findElement(By.xpath("//a[contains(text(),'Alert')]"));
		oSel.waitforElementVisibleExplicit(10, eleAlert);
		eleAlert.click();
		WebElement eleWindowAlert_Tab=driver.findElement(By.xpath("(//button[contains(text(),'Window Alert')])[1]"));
		oSel.waitforElementVisibleExplicit(10, eleWindowAlert_Tab);
		eleWindowAlert_Tab.click();
		Alert AlHandel=driver.switchTo().alert();
		System.out.println(AlHandel.getText());
		AlHandel.accept();
		Thread.sleep(5000);
		//WebElement eleWindowAler_Bottom=driver.findElement(By.xpath("(//button[contains(text(),'Window Alert')])[2]"));
		
	    WebElement w = driver.findElement(By.xpath("(//button[contains(text(),'Window Alert')])[2]"));
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", w);
	    Thread.sleep(2000);
	    w.click();
	}

}

