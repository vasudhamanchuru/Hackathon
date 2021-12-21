package com.qtbots.selenium_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Vasu {
	public static void main(String[] args) throws Exception {
		//we have chromedriver.selenium
	      WebDriver d;
		WebDriverManager.chromedriver().setup();
		d=new ChromeDriver();
		//how do navigate to the URL
		//Thread.sleep(2000);
	d.get("https://qtbots-selenium.web.app/");
	Thread.sleep(5000);
	//close and quit
	d.quit();
		
		
		
		
		


	}

}
