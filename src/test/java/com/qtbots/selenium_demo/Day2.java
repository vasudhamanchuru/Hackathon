package com.qtbots.selenium_demo;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;

public class Day2 extends TestBase{

	public static void main(String[] args) throws Exception {
		oSel.launchBrowser();
		//oSel.loginToQTApplication();
		driver.get("https://qtbots-selenium.web.app/");
		driver.findElement(By.id("email_field")).clear();
		driver.findElement(By.id("email_field")).click();
		
		Robot Rb=new Robot();
		Rb.keyPress(KeyEvent.VK_SHIFT);
		Rb.keyPress(KeyEvent.VK_V);
		Rb.keyRelease(KeyEvent.VK_V);
		Rb.keyPress(KeyEvent.VK_A);
		Rb.keyRelease(KeyEvent.VK_A);
		Rb.keyPress(KeyEvent.VK_S);
		Rb.keyRelease(KeyEvent.VK_S);
		Rb.keyPress(KeyEvent.VK_U);
		Rb.keyRelease(KeyEvent.VK_U);
		Rb.keyPress(KeyEvent.VK_D);
		Rb.keyRelease(KeyEvent.VK_D);
		Rb.keyPress(KeyEvent.VK_H);
		Rb.keyRelease(KeyEvent.VK_H);
		Rb.keyPress(KeyEvent.VK_A);
		Rb.keyRelease(KeyEvent.VK_A);
		Rb.keyRelease(KeyEvent.VK_SHIFT);
		Thread.sleep(5000);
		oSel.quitApplication();
		}

}
