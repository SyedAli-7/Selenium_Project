package com.seleniumbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RoboClass {

	public static void main(String[] args) throws AWTException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SyedAli\\eclipse-workspace\\Selenium\\cdeem\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
		Robot robo = new Robot();
		
		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		

	}

}
