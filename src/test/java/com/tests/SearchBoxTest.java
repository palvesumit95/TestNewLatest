package com.tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pages.SearchBox;
import com.utilities.PropertiesUtils;

public class SearchBoxTest extends BaseClass {

	public static SearchBox sb;

	@BeforeSuite
	public void initialise() throws IOException, InterruptedException {
		initialisation();
		reportInit();
	}

	@Test
	public void seachBoxTestEx() throws IOException {
		sb = new SearchBox(driver);
		sb.searchBoxEle.sendKeys(PropertiesUtils.readProperty("Product"));
	}
	
	@AfterSuite
	public void tearDown() {
		reports.flush();
		driver.close();

	}
}
