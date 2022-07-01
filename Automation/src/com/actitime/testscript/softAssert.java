package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssert {
static
{
	System.setProperty("webdriver.chrome.driver", "./driver/chroemdriver.exe");
}
@Test
public void verifyTitle() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	String expectedtitle = "Google";
	String actualtitle = driver.getTitle();
	SoftAssert s =new SoftAssert();
	s.assertEquals(actualtitle, expectedtitle );
	driver.close();
	s.assertAll();
	
}

}
