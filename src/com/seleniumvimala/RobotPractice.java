package com.seleniumvimala;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotPractice {

	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\cdeem\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		Actions act = new Actions(driver);
		
		Robot robo = new Robot();
		
		WebElement prime = driver.findElement(By.id("nav-link-prime"));
		act.moveToElement(prime).build().perform();
		
		WebElement mobiles = driver.findElement(By.linkText("Mobiles"));
		act.contextClick(mobiles).build().perform();
		
		robo.keyPress(KeyEvent.VK_DOWN);
		robo.keyRelease(KeyEvent.VK_DOWN);
		
		robo.keyPress(KeyEvent.VK_DOWN);
		robo.keyRelease(KeyEvent.VK_DOWN);
		
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
