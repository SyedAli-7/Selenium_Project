package com.seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsPractice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SyedAli\\eclipse-workspace\\Selenium\\cdeem\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?id_category=10&controller=category");
		driver.manage().window().maximize();

		// Implicit wait
		
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement printdress = driver.findElement(By.xpath("(//a[@title='Printed Dress'])[1]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", printdress);
		
		Actions act = new Actions(driver);
		act.moveToElement(printdress).build().perform();
		Thread.sleep(1000);
		
		WebElement colour = driver.findElement(By.id("color_16"));
		colour.click();
		Thread.sleep(1000);
		WebElement printeddress = driver.findElement(By.xpath("//h1[text()='Printed Dress']"));
		js.executeScript("arguments[0].scrollIntoView()", printeddress);
		Thread.sleep(1000);
		
		WebElement plus = driver.findElement(By.xpath("//i[@class='icon-plus']"));
//		plus.click();
		act.moveToElement(plus).doubleClick().build().perform();
		Thread.sleep(1000);
		
		WebElement listbox = driver.findElement(By.id("group_1"));
		Select sel = new Select(listbox);
		sel.selectByValue("2");
		Thread.sleep(1000);
		
		WebElement pink = driver.findElement(By.xpath("//a[@title='Pink']"));
		pink.click();
		Thread.sleep(1000);
		
		WebElement addtocart2 = driver.findElement(By.name("Submit"));
		addtocart2.click();
		Thread.sleep(1000);

		// Explicit wait
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Proceed to checkout']")));
		
		WebElement proceedtocheckout = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		proceedtocheckout.click();
		
	}

}
