package com.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SyedAli\\eclipse-workspace\\Selenium\\cdeem\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("Click")).click();
		driver.switchTo().defaultContent();
		
		//driver.switchTo().frame(1); // This method not working.
		//driver.switchTo().frame("frame2");
		//driver.findElement(By.id("Click1")).click();
		//driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1).switchTo().frame(0);
		driver.findElement(By.id("Click1")).click();
		driver.switchTo().defaultContent();
		
		int siz = driver.findElements(By.tagName("iframe")).size();
		System.out.println("The total number of frames is:" + siz);
		
	}

}
