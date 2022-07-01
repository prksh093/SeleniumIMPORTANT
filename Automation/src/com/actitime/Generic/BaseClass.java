package com.actitime.Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
		static {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
		public static WebDriver driver;
		@BeforeClass
		public void openbrowser() {
			Reporter.log("openbrowser",true);
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		}

		@AfterClass
		public void closebrowser() {
			Reporter.log("closebrowser",true);
			driver.close();
			
		}

		
		@BeforeMethod
		public void login() {
			Reporter.log("login",true);
			driver.get("https://demo.actitime.com/");
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.xpath("//div[text()='Login ']")).click();
		}
		
		@AfterMethod
		public void logout() throws InterruptedException {
			Reporter.log("logout",true);
			driver.findElement(By.id("logoutLink")).click();
	
	}

	}


