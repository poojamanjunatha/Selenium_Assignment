package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selen {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sys\\Desktop\\Workspace\\Assign\\Driver\\chromedriver.exe");
	 // Initialize browser
	 WebDriver driver=new ChromeDriver();
	  
	 // Open facebook
	 driver.get("https://www.seleniumeasy.com/test/");
	 Thread.sleep(10000);
	 
	 WebElement parText = driver.findElement(By.partialLinkText("No, thanks!"));
	 parText.click();
	 
	// driver.findElement(By.xpath("//*[@id=\"at-cv-lightbox-button-holder\"]/a[2]")).click();
	  WebElement linkText = driver.findElement(By.linkText("Input Forms"));
	  linkText.click();
	  
	  driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/ul/li[2]/a")).click();
	  Thread.sleep(1000);
	  WebElement box = driver.findElement(By.id("isAgeSelected"));
	  box.click();
	  Thread.sleep(1000);
	  
	  WebElement sim = driver.findElement(By.linkText("Simple Form Demo"));
	  sim.click();
	  Thread.sleep(1000);
	 
	  WebElement sm = driver.findElement(By.id("sum1"));
	  sm.sendKeys("33");
	  Thread.sleep(1000);

	  WebElement sm1 = driver.findElement(By.id("sum2"));
	  sm1.sendKeys("33");
	  Thread.sleep(1000); 
	  
	  WebElement txt = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div[2]/form/button"));
	  txt.click();
	  Thread.sleep(1000); 
	 
	  
	 
	
	 }
}