package com.seleniumvimala;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesPractice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\cdeem\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		//driver.findElement(By.xpath("(//a[@class='analystic'])[1]")).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.switchTo().frame("singleframe");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Selenium");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();

		driver.switchTo().frame(1);
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Selenium with java");
		
		driver.switchTo().defaultContent();

	}

}
