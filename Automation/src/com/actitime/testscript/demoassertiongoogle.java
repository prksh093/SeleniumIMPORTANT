package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class demoassertiongoogle {
	static{
		System.setProperty("webdriver.chrome.driver", ",./driver/chromedriver.exe");
		}
	@Test
	public void verifytitle() {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
		String expectedtitle="soogle";
		String actualtitle=driver.getTitle();
		if(actualtitle.equals(expectedtitle)) {
			Reporter.log("title is matching and pass",true);
		}
		else
		{
			Reporter.log("title is not matching and fail",true);
		}
	}
	}

