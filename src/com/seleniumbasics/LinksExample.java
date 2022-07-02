package com.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksExample {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SyedAli\\eclipse-workspace\\Selenium\\cdeem\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Go to Home Page")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		WebElement finding = driver.findElement(By.partialLinkText("Find where"));
        String destination = finding.getAttribute("href");
        System.out.println(destination);
        Thread.sleep(2000);
        
        driver.findElement(By.linkText("Verify am I broken?")).click();
        String title = driver.getTitle();
        
        if(title.contains("404")) {
        	System.out.println("This is a broken link");
        } else {
        	System.out.println("This is not a broken link");
        }
		
        Thread.sleep(2000);
        driver.navigate().back();
        driver.findElement(By.xpath("(//a[@link='blue'])[3]")).click();
        
        Thread.sleep(2000);
        System.out.println(driver.findElements(By.tagName("a")).size());
        //driver.close();
	}

}


