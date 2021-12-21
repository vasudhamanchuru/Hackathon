package com.qtbots.selenium_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.api.model.Driver;

public class Vasu2 extends TestBase {

	public static void main(String[] args) throws Exception {
		IseleniumDriverManager sel=new SeleniumDriver();
		
		sel.launchBrowser();
		sel.loginToQTApplication();
		WebElement eleHome= driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
		sel.waitforElementVisibleExplicit(10, eleHome);
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@value='female']")).click();
		
        driver.findElement(By.xpath("//input[@placeholder='Your name..']")).click();
        //Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Your name..']")).sendKeys("Vasudha");
        //Thread.sleep(2000);
        driver.findElement(By.xpath(" //input[@placeholder='father name..']")).click();
        //Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='father name..']")).sendKeys("Easwara");
        Thread.sleep(2000);
        Select seCity=new Select(driver.findElement(By.id("city")));
            
        seCity.selectByValue("goa");
        Thread.sleep(2000);
        seCity.selectByValue("newdelhi");
        Thread.sleep(2000);
        seCity.selectByIndex(1);
        sel.quitApplication();

	}

}
