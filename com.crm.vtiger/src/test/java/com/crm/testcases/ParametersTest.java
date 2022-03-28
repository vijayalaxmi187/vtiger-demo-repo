package com.crm.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ParametersTest {
    @Test
	public void getData() {
    	 System.out.println(System.getProperty("browser"));
    	 String Browser = System.getProperty("browser");
		 System.out.println(System.getProperty("url"));
		// String Url = System.getProperty("url");
		 System.out.println(System.getProperty("username"));
		 //String Username = System.getProperty("username");
		 System.out.println(System.getProperty("password"));
		// String Password = System.getProperty("password");
		 
		 WebDriver driver=null;
		 
			
			if(Browser.equalsIgnoreCase("chrome")) {
				driver=new ChromeDriver(); 
				}else if(Browser.equalsIgnoreCase("firefox")) { 
				 driver=new FirefoxDriver();
				 }else {
			 System.out.println("supports only two browsers");
			 }
			 
				/*
				 * driver.manage().window().maximize();
				 * driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				 * 
				 * driver.get(Url); driver.findElement(By.name("user_name")).sendKeys(Username);
				 * driver.findElement(By.name("user_password")).sendKeys(Password);
				 * driver.findElement(By.id("submitButton")).click();
				 * 
				 * Actions action=new Actions(driver); WebElement web =
				 * driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
				 * 
				 * action.moveToElement(web).perform();
				 * 
				 * driver.findElement(By.linkText("Sign Out")).click(); driver.quit();
				 * 
				 */		
		 
		 	}
}
