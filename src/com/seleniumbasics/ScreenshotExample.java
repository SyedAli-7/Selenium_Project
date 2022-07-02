package com.seleniumbasics;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotExample {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SyedAli\\eclipse-workspace\\Selenium\\cdeem\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
		TakesScreenshot ss = (TakesScreenshot) driver;
		
		File source = ss.getScreenshotAs(OutputType.FILE);
		// File destination = new File("C:\\Users\\SyedAli\\Desktop\\Screenshot\\shot1.png"); // By using folder in desktop
		File destination = new File("C:\\Users\\SyedAli\\eclipse-workspace\\Selenium\\screenshot\\snapshot.png"); // By using folder in project
		
		FileHandler.copy(source, destination);

	}

}
