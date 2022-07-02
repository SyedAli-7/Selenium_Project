package com.seleniumvimala;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtablePractice {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SyedAli\\eclipse-workspace\\Selenium\\cdeem\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.leafground.com/pages/table.html");
		
		System.out.println("-------All Data-------");
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		List<WebElement> allData = driver.findElements(By.xpath("//table/tbody/tr/td"));
		for(WebElement all : allData) {
			System.out.println(all.getText()); 
		}
		
		System.out.println("-------Row Data-------");
		
		List<WebElement> rowData = driver.findElements(By.xpath("//table/tbody/tr[6]/td")); 
		for(WebElement row : rowData) {
			System.out.println(row.getText());
		}

		System.out.println("-------Column Data-------");
		List<WebElement> columnData = driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
		for(WebElement column : columnData) {
			System.out.println(column.getText());
		}
		
		System.out.println("-------Single Data-------");
		List<WebElement> singleData = driver.findElements(By.xpath("//table/tbody/tr[2]/td[2]"));
		for(WebElement single : singleData) {
			System.out.println(single.getText());
		}
		
		
	}

}
