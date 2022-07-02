package com.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SyedAli\\eclipse-workspace\\Selenium\\cdeem\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
//		driver.get("http://www.leafground.com/pages/drop.html");
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
//		WebElement drag = driver.findElement(By.id("draggable"));
//		WebElement droppable = driver.findElement(By.id("droppable"));
        Actions act = new Actions(driver);
        
//        act.clickAndHold(drag).release(droppable).build().perform();        
//        act.dragAndDrop(drag, droppable).build().perform();
        
        WebElement dresses = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
	    act.moveToElement(dresses).build().perform();
	    act.click(dresses).build().perform();
	    
	    WebElement tshirts = driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]"));
	    act.contextClick(tshirts).build().perform();
	    
	    WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
	    act.moveToElement(women).build().perform();
	    act.doubleClick(women).build().perform();
	    
	}

}
