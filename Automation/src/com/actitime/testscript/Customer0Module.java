package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Customer0Module {

	@BeforeMethod
	public void login() {
		Reporter.log("login",true);		
	}
	
	@AfterMethod
	public void logout() {
		Reporter.log("logout",true);
	}
	@Test
	public void createcustomer() {
		Reporter.log("createcustomer",true);
	}
	
	@Test
	public void modifycustomer() {
		Reporter.log("modifycustomer",true);
	}
	}
	
	

