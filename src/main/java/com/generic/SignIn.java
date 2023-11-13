package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignIn {
	
	public void getAccount() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://automationexercise.com/");
		driver.manage().window().maximize();
		
		MasterPageFactory mpf = new MasterPageFactory(driver);
		mpf.getLogInBtn1().click();
		mpf.getEmailField().sendKeys("mahnhiyan@gmail.com");
		mpf.getPasswordField().sendKeys("mahnHiyan!123");
		mpf.getLoginBtn2().click();
		
		
	}

}
