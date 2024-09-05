package test_cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageobjectmodel1.NaukariDotCom;
import pageobjectmodel1.ResisterPage;

public class Naukritest {
	@Test
	void Execution() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		NaukariDotCom page=new NaukariDotCom(driver);
		page.URL();
		page.access();
	}
}
