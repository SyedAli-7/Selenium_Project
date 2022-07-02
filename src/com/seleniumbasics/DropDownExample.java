package com.seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SyedAli\\eclipse-workspace\\Selenium\\cdeem\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		
		WebElement element1 = driver.findElement(By.id("dropdown1"));
		Select select1 = new Select(element1);
		select1.selectByIndex(1);
		
		WebElement element2 = driver.findElement(By.name("dropdown2"));
		Select select2 = new Select(element2);
		select2.selectByValue("2");
		
		WebElement element3 = driver.findElement(By.id("dropdown3"));
		Select select3 = new Select(element3);
		select3.selectByVisibleText("Loadrunner");
		
		WebElement element4 = driver.findElement(By.className("dropdown"));
		Select select4 = new Select(element4);
		List<WebElement> size = select4.getOptions();
		System.out.println(size.size());
		
		WebElement element6 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[5]/select"));
		element6.sendKeys("Selenium");
		
		WebElement element5 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[6]/select"));
		Select multiple = new Select(element5);
		multiple.selectByIndex(3);
		Thread.sleep(2000);
		multiple.selectByValue("1");
		Thread.sleep(2000);
		multiple.selectByVisibleText("Appium");
	    Thread.sleep(2000);
		multiple.deselectByIndex(3);
		Thread.sleep(2000);
		multiple.deselectByValue("2");
		driver.close();
	
	}

}
