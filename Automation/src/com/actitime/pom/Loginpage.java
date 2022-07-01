package com.actitime.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage{

	private WebElement untbx; 
	private WebElement pwtbx;   
	private WebElement lgbt;           //declaration


	public Loginpage (WebDriver driver)
	{            //initilization  
		untbx=driver.findElement(By.id("username"));
		pwtbx=driver.findElement(By.name("pwd"));
		lgbt=driver.findElement(By.xpath("//div[.='Login ']"));
	}
	
	          //Business Login Method
	public void setlogin(String un,String pw)  {
			untbx.sendKeys(un);
		
			pwtbx.sendKeys(pw);
//			Thread.sleep(3000);
			lgbt.click();
     }
}

	