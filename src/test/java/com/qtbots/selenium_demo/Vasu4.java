package com.qtbots.selenium_demo;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Vasu4 extends TestBase{

	public static void main(String[] args) throws Exception {
		IseleniumDriverManager oSel=new SeleniumDriver();
		oSel.launchBrowser();
		oSel.loginToQTApplication();
		//experimentMouseHover(oSel);
		//experimentDoubleClick(oSel);
		experimentToolTip(oSel);
		
		
	}
	private static void experimentToolTip(IseleniumDriverManager oSel) {
		WebElement eleIntraction=driver.findElement(By.xpath("//button[contains(text(),'Intractions')]"));
		oSel.waitforElementVisibleExplicit(10, eleIntraction);
		eleIntraction.click();
		WebElement eleToolTip=driver.findElement(By.xpath("//a[contains(text(),'Tool Tip')]"));
		oSel.waitforElementVisibleExplicit(10, eleToolTip);
		eleToolTip.click();
		
	}
	private static void experimentDoubleClick(IseleniumDriverManager oSel) throws InterruptedException {
		/*WebElement eleIntraction=driver.findElement(By.xpath("//button[contains(text(),'Intractions')]"));
		oSel.waitforElementVisibleExplicit(10, eleIntraction);
		eleIntraction.click();
		WebElement eleDoubleClickTab=driver.findElement(By.xpath("//a[contains(text(),'Double Click')]"));
		oSel.waitforElementVisibleExplicit(10, eleDoubleClickTab);
		eleDoubleClickTab.click();
		*/
		driver.get("https://qtbots-selenium.web.app/double-click.html");
		WebElement eleSingleClick=driver.findElement(By.xpath("//button[contains(text(),'single Click')]"));
		oSel.waitforElementVisibleExplicit(10,eleSingleClick);
		Thread.sleep(2000);
		
		eleSingleClick.click();
		Thread.sleep(2000);
		eleSingleClick.click();
		eleSingleClick.click();
		eleSingleClick.click();
		eleSingleClick.click();
		Thread.sleep(2000);
		//driver.get("https://qtbots-selenium.web.app/double-click.html");
		WebElement eleDoubleClickpage=driver.findElement(By.xpath("//button[contains(text(),'Double Click')]"));
		Actions oac=new Actions(driver);
		oac.contextClick(eleDoubleClickpage).build().perform();
		Thread.sleep(2000);
		oac.contextClick(eleDoubleClickpage).build().perform();
		Thread.sleep(2000);
		oac.contextClick(eleDoubleClickpage).build().perform();
		Thread.sleep(2000);
		oac.contextClick(eleDoubleClickpage).build().perform();
		
		
	}
	private static void experimentMouseHover(IseleniumDriverManager oSel) throws InterruptedException {
		WebElement eleIntraction=driver.findElement(By.xpath("//button[contains(text(),'Intractions')]"));
		oSel.waitforElementVisibleExplicit(10, eleIntraction);
		eleIntraction.click();
		WebElement eleMouseHoverTab=driver.findElement(By.xpath("//a[contains(text(),'Mouse Hover')]"));
		oSel.waitforElementVisibleExplicit(10, eleMouseHoverTab);
		eleMouseHoverTab.click();
		WebElement eleMouseHoverPage=driver.findElement(By.xpath("//button[contains(text(),'mousehover')]"));
		oSel.waitforElementVisibleExplicit(10, eleMouseHoverPage);
		
		 Actions oac=new Actions(driver);
		 oac.moveToElement(eleMouseHoverPage).build().perform();
		 Thread.sleep(3000);
		 
		 
	}
		
	}


