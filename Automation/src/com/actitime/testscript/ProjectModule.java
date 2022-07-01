package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.Generic.BaseClass;

public class ProjectModule extends BaseClass {

	@Test(groups= {"smokeTest","regressionTest"})
	public void createcustomer() {
		Reporter.log("createcustomer1",true);
	}


	@Test(groups= {"regressionTest"})
	public void modifycustomer() {
		Reporter.log("modifycustomer1",true);
	}


	@Test(groups= {"regressionTest"})
	public void deletecustomer() {
		Reporter.log("deletecustomer1",true);
	}


}


