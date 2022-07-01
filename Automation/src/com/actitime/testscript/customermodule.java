package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.Generic.BaseClass;
import com.actitime.Generic.base1;



@Listeners(com.actitime.Generic.Listener.class)
public class customermodule extends BaseClass {
	@Test
	public void createcustomer() {
		Reporter.log("createcustomer",true);
		Assert.fail();
	}
	@Test
	public void modifycustomer() {
		Reporter.log("modifycustomer",true);
		Assert.fail();
	}
	@Test
	public void deletecustomer() {
		Reporter.log("deletecustomer",true);
		Assert.fail();
	}


}
