package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login1 {
	
@FindBy(id="username")
private WebElement untbx; 

@FindBy(name="pwd")
private WebElement pwdtx;

@FindBy(xpath = "//div[.='Login ']")
private WebElement lgbt;


	
	public void setlogin(String un, String pw) {
		untbx.sendKeys(un);
		pwdtx.sendKeys(pw);
		lgbt.click();
	}
	}