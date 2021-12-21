package com.qtbots.selenium_demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDriver extends TestBase implements IseleniumDriverManager {
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	}



	@Override
	public void loginToQTApplication() throws Exception {
		driver.get("https://qtbots-selenium.web.app/");
		
		driver.findElement(By.id("email_field")).click();
		driver.findElement(By.id("email_field")).clear();
		driver.findElement(By.id("email_field")).sendKeys("admin123@gmail.com");
		driver.findElement(By.id("password_field")).click();
		driver.findElement(By.id("password_field")).clear();
		driver.findElement(By.id("password_field")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[contains(text(),'Login to Account')]")).click();
		driver.findElement(By.xpath("//input[@value='female']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@placeholder='Your name..']")).click();
       // Thread.sleep(3000);
        //driver.findElement(By.xpath("//input[@placeholder='Your name..']")).sendKeys("Vasudha");
        //Thread.sleep(3000);
        //driver.findElement(By.xpath(" //input[@placeholder='father name..']")).click();
        //Thread.sleep(3000);
        //driver.findElement(By.xpath("//input[@placeholder='father name..']")).sendKeys("Easwara");
        //Thread.sleep(3000);
		
	}

	@Override
	public void quitApplication() {
		driver.quit();
	}



	@Override
	public void waitforElementVisibleExplicit(int iSecondsToWait,WebElement ele) {
		WebDriverWait Wait=new WebDriverWait(driver,iSecondsToWait);
		Wait.until(ExpectedConditions.visibilityOf(ele));
		
	}
}
