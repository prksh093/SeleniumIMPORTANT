package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.actitime.Generic.BaseClass;

public class TaskModule extends BaseClass{
	@Test(groups= {"regressionTest"})
	public void createcustomer() {
		Reporter.log("createcustomer2",true);
	}

	
	@Test(groups= {"regressionTest"})
	public void modifycustomer() {
		Reporter.log("modifycustomer2",true);
	}

	
	@Test(groups= {"regressionTest"})
	public void deletecustomer() {
		Reporter.log("deletecustomer2",true);
	}


}


