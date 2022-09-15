package com.selenium;

import java.sql.Driver;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class ParentChildWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\anee\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		int j=0;
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	driver.findElement(By.cssSelector("a[class$='blinkingText']")).click();
	Set<String> windows =driver.getWindowHandles();
	Iterator<String>it = windows.iterator();
	String parentId =it.next();
	String childId =it.next();
	driver.switchTo().window(childId);
	String emailId = driver.findElement(By.cssSelector("a[href='mailto:mentor@rahulshettyacademy.com']")).getText();
	System.out.println(driver.findElement(By.cssSelector("a[href='mailto:mentor@rahulshettyacademy.com']")).getText());
	driver.switchTo().window(parentId);
	driver.findElement(By.id("username")).sendKeys(emailId);
	}

}
