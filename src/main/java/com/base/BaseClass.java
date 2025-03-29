package com.base;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.utilities.PropertiesUtils;

public class BaseClass {

	public static WebDriver driver = null;
	public static ExtentTest test = null;
	public static ExtentReports reports = null;
	public static ExtentSparkReporter spark = null;

	public static void initialisation() throws IOException, InterruptedException {

		String browserName = PropertiesUtils.readProperty("browser");

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:/geckodriver.exe");
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.get(PropertiesUtils.readProperty("urlmain"));

	}

	public static void reportInit() {

		spark = new ExtentSparkReporter(System.getProperty("user.dir") + "/target/ExtentReport.html");
		reports = new ExtentReports();
		reports.attachReporter(spark);
	}
}