package com.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonUsingAbsoluteXpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SyedAli\\eclipse-workspace\\Selenium\\cdeem\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/radio.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/div/div/input[1]")).click();
		
		WebElement checked = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/input[2]"));

		WebElement unchecked = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/input[1]"));
		
		if(checked.isSelected()) {
			
			System.out.println("Checked radio button is default");
			
		} else if(unchecked.isSelected()) {
			
			System.out.println("Unchecked radio button is default");
			
		}
		
		WebElement radio2 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div/div/input[2]"));
		
		if(radio2.isSelected()) {
		
		System.out.println("Age group 21-40 years is selected");
		
		} else {
			
			radio2.click();
			
		}
		
	}

}
