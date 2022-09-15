package com.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ActionInAmazonPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\anee\\chromedriver.exe"); 
		 ChromeDriver driver = new ChromeDriver(); 
		 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		   driver.get("https://www.amazon.com"); 
		   driver.manage().window().maximize();
		  
		   Actions a= new Actions(driver);
		   //Thread.sleep(2000);
		   a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).build().perform();
		   a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		   a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).contextClick().build().perform();
	
	
	
	
	}

}
