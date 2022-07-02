package com.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.AllArguments;

public class ScrollExample {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SyedAli\\eclipse-workspace\\Selenium\\cdeem\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement popular = driver.findElement(By.xpath("//a[@class='homefeatured']"));
//		WebElement bestsellers = driver.findElement(By.xpath("//a[@class='blockbestsellers']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,1000)", "");
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,-1000)", "");
		Thread.sleep(3000);
		
            js.executeScript("arguments[0].scrollIntoView()", popular);
//          js.executeScript("arguments[0].scrollIntoView()", bestsellers);
//          Thread.sleep(2000);
//          bestsellers.click();
//          Thread.sleep(2000);
            
            js.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
            Thread.sleep(2000);
            js.executeScript("window.scrollTo(0,0)", "");
            
	}

}
