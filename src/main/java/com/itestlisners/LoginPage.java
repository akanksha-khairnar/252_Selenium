package com.itestlisners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	LoginPage(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	

		@FindBy(xpath="//input[@placeholder='Username']") WebElement username;
		@FindBy(xpath="//input[@placeholder='Password']") WebElement pass;
		
		@FindBy(xpath="//button[normalize-space()='Login']") WebElement login;
		
		
		public void username(String user) {
			username.sendKeys(user);
		}
		
		public void password(String pas) {
			pass.sendKeys(pas);
		}
		
		public void login() {
			login.click();
		}
}
