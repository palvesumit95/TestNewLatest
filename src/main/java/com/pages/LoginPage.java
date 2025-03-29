package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	@FindBy(id="//input[@type='email']")
	public static WebElement emailBox;
	
	@FindBy(id="//input[@type='password']")
	public static WebElement passwordBox;
	
}
