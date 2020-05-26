package com.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Cross_Browser {
	static WebDriver driver;

    @BeforeTest
    @Parameters("browser")
    public void setup(String browserName) throws Exception{
        if (browserName.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        }
        else if (browserName.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver",
                    "C:\\Users\\sys\\Desktop\\Workspace\\Assign\\Driver\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        
    
        else {
            throw new Exception("Browser is not correct");
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void testParameterWithXML() throws InterruptedException{
        driver.get("https://www.google.co.in/");
        System.out.println(""+driver.toString());
        driver.findElement(By.name("q")).sendKeys("login");
    }
}
	