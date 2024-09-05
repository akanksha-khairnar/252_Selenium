package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Anotations {
	WebDriver driver;
	@BeforeMethod
	void BM() {
		 driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
}	
	@AfterMethod
	void Am() {
		driver.quit();
	}
	@Test(priority=1)
	void signim() {
		driver.findElement(By.xpath("//input[@title='Sign in']")).click();
	}
	@Test(priority=2)
	void CreateAccount() {
		driver.findElement(By.xpath("//u[normalize-space()='Create a new account']")).click();
	}
	
}
