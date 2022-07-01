package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class testMethod1 {
static{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
@Test
public void testmethod1() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com");
	login1 l = new login1();
	PageFactory.initElements(driver, l);
	l.setlogin("admin","manager");
}
}
