package com.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpathPractice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SyedAli\\eclipse-workspace\\Selenium\\cdeem\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		// Dynamic Xpath using following
		
//		WebElement mobiles = driver.findElement(By.xpath("//img[@alt='Fresh']//following::img[@alt='Mobiles']"));
//		mobiles.click();
		
		// Dynamic Xpath using preceding
		
		WebElement mobiles = driver.findElement(By.xpath("//img[@alt='Fashion']//preceding::img[@alt='Mobiles']"));
		mobiles.click();
		
	} 

}
