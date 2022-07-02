package com.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxExample {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SyedAli\\eclipse-workspace\\Selenium\\cdeem\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		
		// Confirm Selenium is checked
		
		WebElement seleniumm = driver.findElement(By.xpath("(//input[@type='checkbox'])[6]"));
		  if(seleniumm.isSelected()) {
			System.out.println("Confirmed Selenium is checked");
		}
		
		// Confirm Selenium is checked method 2
		
		//if(seleniumm.isSelected()) {
			//seleniumm.click();		
		//} else {	
		//System.out.println("Selenium is already Deselected");	
		//}
		
		WebElement notselected = driver.findElement(By.xpath("(//input[@type='checkbox'])[7]"));
		WebElement selected = driver.findElement(By.xpath("(//input[@type='checkbox'])[8]"));
		
		if(notselected.isSelected()) {	
			notselected.click();
		} else if(selected.isSelected()) {
			selected.click();
		}
	
		driver.findElement(By.xpath("(//input[@type='checkbox'])[9]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[10]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[11]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[12]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[13]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[14]")).click();
		
	}

}
