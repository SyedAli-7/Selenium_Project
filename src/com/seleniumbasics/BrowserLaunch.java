package com.seleniumbasics;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SyedAli\\eclipse-workspace\\Selenium\\cdeem\\chromedriver.exe");
		
		// WebDriver driver = new ChromeDriver();
		
	     ChromeDriver driver = new ChromeDriver();
		
		 driver.get("https://www.google.com/");
		
		 driver.close();

	}

}
