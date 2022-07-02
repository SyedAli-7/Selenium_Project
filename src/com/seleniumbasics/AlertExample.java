package com.seleniumbasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SyedAli\\eclipse-workspace\\Selenium\\cdeem\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@onclick='normalAlert()']")).click();
		Alert alertbutton = driver.switchTo().alert();
		Thread.sleep(1000);
		alertbutton.accept();
		
		driver.findElement(By.xpath("//button[@onclick='confirmAlert()']")).click();
		Alert confirmbutton = driver.switchTo().alert();
		Thread.sleep(3000);
		confirmbutton.dismiss();
		
		driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']")).click();
        Alert Promptbutton = driver.switchTo().alert();
        Promptbutton.sendKeys("Greens Technology");
        Thread.sleep(4000);
        Promptbutton.accept();
        
        driver.findElement(By.xpath("//button[@onclick='lineBreaks()']")).click();
        Thread.sleep(5000);
        driver.switchTo().alert().accept();
        
        driver.close();
		
	}

}
