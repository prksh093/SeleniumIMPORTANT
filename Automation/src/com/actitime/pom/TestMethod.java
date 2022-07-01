package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestMethod {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
@Test
public void testmethod() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.actitime.com/");
	Loginpage l= new Loginpage(driver);
	l.setlogin("admin","manager");
}
}
