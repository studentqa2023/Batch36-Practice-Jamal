package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {
	
	public MasterPageFactory(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(), 'Login')]")
	private WebElement logInBtn1;
	
	@FindBy(xpath="(//*[@name=\"email\"])[1]")
	private WebElement emailField;
	
	@FindBy(xpath="//*[@name=\"password\"]")
	private WebElement passwordField;
	
	@FindBy(xpath="(//*[contains(text(), 'Login')])[4]")
	private WebElement loginBtn2;

	public WebElement getEmailField() {
		return emailField;
	}

	public WebElement getPasswordField() {
		return passwordField;
	}

	public WebElement getLoginBtn2() {
		return loginBtn2;
	}

	public WebElement getLogInBtn1() {
		return logInBtn1;
	}

}
