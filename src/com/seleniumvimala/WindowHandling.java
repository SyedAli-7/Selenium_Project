package com.seleniumvimala;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandling {

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SyedAli\\eclipse-workspace\\Selenium\\cdeem\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		Actions act = new Actions(driver);

		Robot robo = new Robot();

		WebElement prime = driver.findElement(By.id("nav-link-prime"));
		act.moveToElement(prime).build().perform();

		WebElement mobiles = driver.findElement(By.linkText("Mobiles"));
		act.contextClick(mobiles).build().perform();

		robo.keyPress(KeyEvent.VK_DOWN);
		robo.keyRelease(KeyEvent.VK_DOWN);

		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);

		WebElement customer = driver.findElement(By.linkText("Customer Service"));
		act.contextClick(customer).build().perform();

		robo.keyPress(KeyEvent.VK_DOWN);
		robo.keyRelease(KeyEvent.VK_DOWN);

		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);

		WebElement fashion = driver.findElement(By.linkText("Fashion"));
		act.contextClick(fashion).build().perform();

		robo.keyPress(KeyEvent.VK_DOWN);
		robo.keyRelease(KeyEvent.VK_DOWN);

		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);

		Set<String> allWindow = driver.getWindowHandles();
		System.out.println(allWindow);

		for (String str : allWindow) {

			String title = driver.switchTo().window(str).getTitle();
			System.out.println(title);

		}
		
//		To Check duplicate title
		
		String newTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		
		for(String str : allWindow) {
			
			if(driver.switchTo().window(str).getTitle().equals(newTitle)); {
			
				break;
			
			}
			
		}
		

	}

}
