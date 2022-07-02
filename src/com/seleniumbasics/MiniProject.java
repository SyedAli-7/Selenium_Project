package com.seleniumbasics;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class MiniProject {

	public static void main(String[] args) throws InterruptedException, IOException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SyedAli\\eclipse-workspace\\Selenium\\cdeem\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@class='login']")).click();
		Thread.sleep(1000);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement alreadyregister = driver.findElement(By.xpath("(//h3[@class='page-subheading'])[2]"));
		js.executeScript("arguments[0].scrollIntoView()", alreadyregister);
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("Syedali@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("12345678");
		driver.findElement(By.xpath("//i[@class='icon-lock left']")).click();
		Thread.sleep(1000);
		
		WebElement dresses = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		act.moveToElement(dresses).build().perform();
		WebElement eveningdresses = driver.findElement(By.xpath("(//a[@title='Evening Dresses'])[2]"));
		eveningdresses.click();
		Thread.sleep(1000);
		
		WebElement printdress = driver.findElement(By.xpath("(//a[@title='Printed Dress'])[1]"));
		js.executeScript("arguments[0].scrollIntoView()", printdress);
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
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement proceedtocheckout = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		proceedtocheckout.click();
		Thread.sleep(1000);

	    WebElement summary = driver.findElement(By.id("cart_title"));
	    js.executeScript("arguments[0].scrollIntoView()", summary);
	    Thread.sleep(1000); 
	    
	    TakesScreenshot ss = (TakesScreenshot) driver;
	    File source = ss.getScreenshotAs(OutputType.FILE);
	    File destination = new File("C:\\Users\\SyedAli\\Desktop\\Miniproject\\summaryscreenshot.png");
	    FileHandler.copy(source, destination);
	    Thread.sleep(1000);
	    
//	    WebElement summary_checkout = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
	    WebElement summart_address = driver.findElement(By.className("page-subheading"));
	    js.executeScript("arguments[0].scrollIntoView()", summart_address);
	    summart_address.click();
	    Thread.sleep(1000);
	    
	    WebElement summary_checkout = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
	    summary_checkout.click();
	    Thread.sleep(1000);
	    
	    WebElement address = driver.findElement(By.className("page-heading"));
	    js.executeScript("arguments[0].scrollIntoView()",address);
	    Thread.sleep(1000);
	    
	    File source1 = ss.getScreenshotAs(OutputType.FILE);
	    File destination1 = new File("C:\\Users\\SyedAli\\Desktop\\Miniproject\\addressscreenshot.png");
	    FileHandler.copy(source1, destination1);
	    Thread.sleep(1000);
	    
	    WebElement delivery_address = driver.findElement(By.className("page-subheading"));
	    js.executeScript("arguments[0].scrollIntoView()", delivery_address);
	    Thread.sleep(1000);
	    
	    WebElement address_checkout = driver.findElement(By.name("processAddress"));
	    address_checkout.sendKeys(Keys.RETURN);
	    Thread.sleep(1000);
	    
	    WebElement shipping = driver.findElement(By.className("page-heading"));
	    js.executeScript("arguments[0].scrollIntoView()", shipping);
	    Thread.sleep(1000);
	    
	    File source2 = ss.getScreenshotAs(OutputType.FILE);
	    File destination2 = new File("C:\\Users\\SyedAli\\Desktop\\Miniproject\\shippingscreenshot.png");
	    FileHandler.copy(source2, destination2);
	    Thread.sleep(1000);
	    
	    WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
	    checkbox.click();
	    Thread.sleep(1000);
	    
	    WebElement shipping_checkout = driver.findElement(By.name("processCarrier"));
	    shipping_checkout.sendKeys(Keys.RETURN);
	    Thread.sleep(1000);
	    
	    WebElement payment_summary = driver.findElement(By.className("page-heading"));
	    js.executeScript("arguments[0].scrollIntoView()", payment_summary);
	    Thread.sleep(1000);
	    
	    File source3 = ss.getScreenshotAs(OutputType.FILE);
	    File destination3 = new File("C:\\Users\\SyedAli\\Desktop\\Miniproject\\paymentscreenshot.png");
	    FileHandler.copy(source3, destination3);
	    Thread.sleep(2000);
	    
	    driver.close();
	    driver.quit();
	    
	}

}
