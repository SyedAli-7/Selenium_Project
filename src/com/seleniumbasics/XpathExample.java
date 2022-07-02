package com.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SyedAli\\eclipse-workspace\\Selenium\\cdeem\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		
		username.sendKeys("abc@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[contains(@type,'password')]"));

		password.sendKeys("12345");
		
	    // WebElement login = driver.findElement(By.xpath("//button[text()='Log In']"));
		
	    // login.click();
		
	    // WebElement log = driver.findElement(By.xpath("//button[contains(text(),'Log')]"));
		
	    // log.click();
		
	   WebElement createnewpassword = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		
	   createnewpassword.click();
		
	}

}
