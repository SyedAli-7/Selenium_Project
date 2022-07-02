package com.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SyedAli\\eclipse-workspace\\Selenium\\cdeem\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/radio.html");
		
		driver.manage().window().maximize();
		
	    driver.findElement(By.id("yes")).click();
		
		// driver.findElement(By.id("no")).click();
		
		WebElement unchecked = driver.findElement(By.xpath("(//input[@type='radio'])[3]"));

		WebElement checked = driver.findElement(By.xpath("(//input[@type='radio'])[4]"));
		
		if(unchecked.isSelected()) {
			
			System.out.println("Unchecked radio button is selected");
			
		} else if (checked.isSelected()) {
			
			System.out.println("Checked radio button is selected");
			
		}
		
		WebElement radio2 = driver.findElement(By.xpath("(//input[@type='radio'])[6]"));
		
	    if(radio2.isSelected()) {
	    	
	    	System.out.println("Age group 21-40 years is selected");

	    } else {
	    	
	    	radio2.click();
	    	
	    }
	    
	}

}
