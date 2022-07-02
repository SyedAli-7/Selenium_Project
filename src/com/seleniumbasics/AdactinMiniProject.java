package com.seleniumbasics;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class AdactinMiniProject {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SyedAli\\eclipse-workspace\\Selenium\\cdeem\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("Syedali786");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("12345678");
		Thread.sleep(1000);
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		
		
		
		WebElement location = driver.findElement(By.id("location"));
		Select sel1 = new Select(location);
		sel1.selectByValue("Paris");
		WebElement hotel = driver.findElement(By.name("hotels"));
		Select sel2 = new Select(hotel);
		sel2.selectByValue("Hotel Sunshine");
		WebElement roomtype = driver.findElement(By.id("room_type"));
		Select sel3 = new Select(roomtype);
		sel3.selectByValue("Deluxe");
		WebElement roomnum = driver.findElement(By.id("room_nos"));
		Select sel4 = new Select(roomnum);
		sel4.selectByValue("7");
		WebElement checkin = driver.findElement(By.name("datepick_in"));
		checkin.clear();
		checkin.sendKeys("31/07/2022");
		WebElement checkout = driver.findElement(By.name("datepick_out"));	
		checkout.clear();
		checkout.sendKeys("01/08/2022");
		WebElement adultsroom = driver.findElement(By.name("adult_room"));
		Select sel5 = new Select(adultsroom);
		sel5.selectByValue("2");
		WebElement childsroom = driver.findElement(By.id("child_room"));
		Select sel6 = new Select(childsroom);
		sel6.selectByValue("4");
		Thread.sleep(1000);
		WebElement search = driver.findElement(By.id("Submit"));
		search.click();
		
//		WebElement reset = driver.findElement(By.id("Reset"));
//		reset.click();
		
		
		WebElement radiobuton = driver.findElement(By.id("radiobutton_0"));
		radiobuton.click();
		Thread.sleep(1000);
		WebElement continu = driver.findElement(By.name("continue"));
		continu.click();
		
		
		
		WebElement frstname = driver.findElement(By.name("first_name"));
		frstname.sendKeys("Ayesha");
		WebElement lstname = driver.findElement(By.name("last_name"));
		lstname.sendKeys("Fathima");
		WebElement billaddrs = driver.findElement(By.name("address"));
		billaddrs.sendKeys("No.27, ECR Road, Chennai-600017");
		WebElement creditcard = driver.findElement(By.name("cc_num"));
		creditcard.sendKeys("9876543210123456");
		WebElement cardtype = driver.findElement(By.name("cc_type"));
		Select sel7 = new Select(cardtype);
		sel7.selectByVisibleText("Master Card");
		WebElement expmonth = driver.findElement(By.name("cc_exp_month"));
		Select sel8 = new Select(expmonth);
		sel8.selectByVisibleText("August");
		WebElement expyear = driver.findElement(By.name("cc_exp_year"));
		Select sel9 = new Select(expyear);
		sel9.selectByVisibleText("2022");
		WebElement cvvnum = driver.findElement(By.name("cc_cvv"));
		cvvnum.sendKeys("143");
		Thread.sleep(1000);
		WebElement booknow = driver.findElement(By.xpath("//input[@name='book_now']"));
		booknow.click();
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement itinerary = driver.findElement(By.id("my_itinerary"));
		itinerary.click();
		
		
		WebElement bookeditinerary = driver.findElement(By.partialLinkText("Booked Itinerary"));
		bookeditinerary.click();
		WebElement checkbox = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		checkbox.click();
		Thread.sleep(1000);
		WebElement cancel = driver.findElement(By.name("cancelall"));
		cancel.click();
		Thread.sleep(1000);
		Alert alertbutton = driver.switchTo().alert();
		alertbutton.accept();
		Thread.sleep(1000);
		TakesScreenshot ss = (TakesScreenshot) driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\SyedAli\\Desktop\\Miniproject\\screenshot.png");
		FileHandler.copy(source, destination);
		Thread.sleep(2000);
		WebElement logout = driver.findElement(By.id("logout"));
		logout.click();
		}
		
	}


