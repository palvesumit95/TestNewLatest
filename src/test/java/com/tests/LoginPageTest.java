package com.tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pages.LoginPage;

public class LoginPageTest extends BaseClass {

	public  LoginPage lp = null;
	
	@BeforeTest
	public void initialise() throws IOException, InterruptedException {
		initialisation();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
	}
	
	@Test
	public void loginPageTest() throws InterruptedException {
		lp = new LoginPage();
		lp.emailBox.sendKeys("8983499900");
		lp.passwordBox.sendKeys("8983499900");
		Thread.sleep(5000);
	
		
	}
	
	
	
}
