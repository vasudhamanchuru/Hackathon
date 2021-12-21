package com.qtbots.selenium_demo;

public class Vasu1 {

	public static void main(String[] args) throws Exception {
		IseleniumDriverManager sel=new SeleniumDriver();
		sel.launchBrowser();
		sel.loginToQTApplication();
		sel.quitApplication();
		

	
	}
}
