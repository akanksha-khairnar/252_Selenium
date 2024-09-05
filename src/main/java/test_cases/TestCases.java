package test_cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageobjectmodel1.ResisterPage;

public class TestCases {
	@Test
	void Execution() {
		WebDriver driver = new ChromeDriver();
		ResisterPage page=new ResisterPage(driver);
		page.URL();
		page.access();
	}
}
