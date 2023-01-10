package com.flipkart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginAlertDialogBox {
	
	
	WebDriver driver;
	
	// Constructor
	public LoginAlertDialogBox(WebDriver driver) 
	{	
		this.driver = driver;
		
		// This method will create web Elements
		PageFactory.initElements(driver, this);
	}
	
	
	
	// Identifying Web Elements
	
	@FindBy(xpath = "//button[contains(text(),'✕')]")
	public WebElement HomePage_login_close_btn;
	
	public WebElement clickingLoginAlertDialogBox()
	{
		return HomePage_login_close_btn;
	}

}
