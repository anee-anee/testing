package com.selenium;

import java.sql.Driver;
import java.time.Duration;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSelenium {

	public static void main(String[] args) {
		try {
		 System.setProperty("webdriver.chrome.driver","C:\\anee\\chromedriver.exe"); 
		 ChromeDriver driver = new ChromeDriver(); 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		   driver.get("https://www.selenium.dev/selenium/web/web-form.html");    
		   System.out.println(driver.getTitle());
		   System.out.println(driver.getCurrentUrl());
			  //WebElement text_input = driver.findElement(By.name("my-text"));			  
			 // text_input.sendKeys("ChromeDriver");
			  driver.findElement(By.name("my-text")).sendKeys("aaa");
			  
              WebElement password = driver.findElement(By.name("my-password"));			  
              password.sendKeys("abcdef");
              
              WebElement text_inputArea =driver.findElement(By.name("my-textarea"));
              text_inputArea.sendKeys("Anee is a good Mom. She loves her son a lots.");
              
              Select drpSelectMenu = new Select(driver.findElement(By.name("my-select")));
              drpSelectMenu.selectByVisibleText("One");
              
               /*WebElement text_input1 = driver.findElement(By.name("my-datalist"));              
			  text_input1.sendKeys("S");
			   Thread.sleep(3000);
              List<WebElement> options =driver.findElements(By.cssSelector("datalist[id='my-options'] option "));

             for(WebElement option :options)

              {

              if(option.getText().equalsIgnoreCase("San Francisco"))

              {

              option.click();

              break;

              }

              }  */     
              driver.findElement(By.xpath("//label[@class='form-check-label w-100']/input[@id='my-check-2']")).click();
              driver.findElement(By.xpath("//label[@class='form-check-label w-100']/input[@id='my-radio-2']")).click();
              /*driver.findElement(By.xpath("//label[@class='form-label w-100']/input[@name='my-colors']")).click();
              WebElement valus =driver.findElement(By.xpath("//label[@class='form-label w-100']/input[@name='my-colors']"));
              valus.sendKeys("#455");*/
              
              //Select file= new Select(driver.findElement(By.xpath("//label[@class='form-check-label w-100']/input[@id='my-check-2']")));
              //file.selectByVisibleText("Default checkbox");
             
              
             /* WebElement color =driver.findElement(By.xpath("//label[@class='form-label w-100']/input[@name='my-colors']"));
              color.click();
              
              Select chosecolor = new Select(driver.findElement(By.xpath("//label[@class='form-label w-100']/input[@name='my-colors']")));
              chosecolor.selectByVisibleText("#DF1616");*/
            
              
              
              
              WebElement submit = driver.findElement(By.tagName("button"));
             submit.click();
             Thread.sleep(3060);
              
            

			  
             
			  
              
			  //driver.findElement(By.id("my-options")).click();
			  //Select se = new Select(driver.findElement(By.xpath("id='my-options'")));
				
			 //Select the option by index
			//se.selectByIndex(2);
			  
			  /*System.out.println(driver.findElement(By.xpath("//div[@class='col-12 py-2']/p[@id='message']")).getText());
			  Assert.assertEquals(driver.findElement(By.xpath("//div[@class='col-12 py-2']/p[@id='message']")).getText(),"Received!");*/
             System.out.println(driver.findElement(By.tagName("p")).getText());
			  Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"Received!");
			  
			  
		 driver.close();  
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
