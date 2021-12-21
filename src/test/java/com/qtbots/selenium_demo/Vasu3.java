package com.qtbots.selenium_demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Vasu3 extends TestBase{

	public static void main(String[] args) throws Exception {
		IseleniumDriverManager oSel=new SeleniumDriver();
		oSel.launchBrowser();
		//oSel.loginToQTApplication();
		//experimentTable(oSel);
		driver.get("https://www.kayak.co.in");
		Thread.sleep(2000);
		WebElement eleDateFrom = driver.findElement(By.xpath("(//span[@class='cQtq-date'])[1]"));
		oSel.waitforElementVisibleExplicit(10, eleDateFrom);
		
		eleDateFrom.click();
		WebElement eleMonthName=driver.findElement(By.xpath("(//div[@class='wHSr-monthName'])[1]"));
		oSel.waitforElementVisibleExplicit(10, eleMonthName);
		String sMonthName=eleMonthName.getText();
		sMonthName=sMonthName.replace(" ", " ");
		String sDate="11";
		String xPathAsText=sDate+" "+sMonthName;
		String xpath="//div[@aria-label='"+xPathAsText+"']";
		driver.findElement(By.xpath(xpath)).click();
		
		Thread.sleep(3000);
		
		oSel.quitApplication();
	}

		public static void experimentTable(IseleniumDriverManager oSel) throws Exception {
		WebElement elewidget=driver.findElement(By.xpath("//button[contains(text(),'Widget')]"));
		oSel.waitforElementVisibleExplicit(10, elewidget);
		elewidget.click();
		oSel.waitforElementVisibleExplicit(10, driver.findElement(By.xpath("//a[contains(text(),'Table')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Table')]")).click();
		oSel.waitforElementVisibleExplicit(10, driver.findElement(By.xpath("//tr/th")));
        List<WebElement>liCollumnName=driver.findElements(By.xpath("//tr/th"));
		 for(WebElement e:liCollumnName){
			 System.out.println(e.getText()+"\t");
			}
		 System.out.println();
		 List<WebElement>liRowValues=driver.findElements(By.xpath("//tr/td"));
		 int count=1;
		 for(WebElement ele:liRowValues){
			 System.out.println(ele.getText()+"\t");
			 if(count%liCollumnName.size() == 0) {
				 System.out.println();
			 }
			 count++;
			 }
		
		
	}

}
