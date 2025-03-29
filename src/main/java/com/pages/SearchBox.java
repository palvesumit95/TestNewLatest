package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SearchBox extends BaseClass {

	
	@FindBy(xpath="//input[@type='text']")
	public WebElement searchBoxEle;

	public SearchBox(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
}
