package com.seleniumbasics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandlingExample {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SyedAli\\eclipse-workspace\\Selenium\\cdeem\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
        driver.manage().window().maximize();
        
        String parentwindow = driver.getWindowHandle();
        driver.findElement(By.id("home")).click();
        Thread.sleep(2000);
        driver.close();
        
        Set<String> childwindow = driver.getWindowHandles();
        for(String multi : childwindow) {
        	
        	driver.switchTo().window(multi);
        	
        }
       
        driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[1]")).click();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.close();
        
        driver.switchTo().window(parentwindow);
        
        driver.findElement(By.xpath("//button[@onclick='openWindows()']")).click();
        Thread.sleep(2000);
        driver.quit();
        
	}

}
