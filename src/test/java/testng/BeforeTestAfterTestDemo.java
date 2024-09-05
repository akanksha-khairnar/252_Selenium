package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeTestAfterTestDemo {
	WebDriver driver;
	@BeforeTest
	void BT() {
		System.out.println("Hiiii");
}	
	@AfterTest
	void AT() {
		System.out.println("Hello");
	}
	@Test(priority=1)
	void signim() {
	System.out.println("this is signin method");
	}
	@Test(priority=2)
	void CreateAccount() {
		System.out.println("this is CreateAccount  method");
	}
	
}
