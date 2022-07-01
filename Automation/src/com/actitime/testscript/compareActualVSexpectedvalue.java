package com.actitime.testscript;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class compareActualVSexpectedvalue {
	static{
		System.setProperty("webdriver.chrome.driver", ",./driver/chromedriver.exe");
	}
	@Test
	public void verifytitle() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String expectedtitle="Google";
		String actualtitle=driver.getTitle();
		Assert.assertEquals(actualtitle,expectedtitle );
		driver.close();
	}
}



//doubt=not getting answer
