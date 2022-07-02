package com.seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsPractice1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SyedAli\\eclipse-workspace\\Selenium\\cdeem\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().window().maximize();

//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Implicit wait
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement alreadyregister = driver.findElement(By.xpath("(//h3[@class='page-subheading'])[2]"));
		js.executeScript("arguments[0].scrollIntoView()", alreadyregister);
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class='icon-lock left']")));
		
		driver.findElement(By.id("email")).sendKeys("Syedali@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("12345678");
		driver.findElement(By.xpath("//i[@class='icon-lock left']")).click();

	}

}
