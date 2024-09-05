package paralleltestingself;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class resisterTestCases {
	 WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser"})
	 public void SetUp(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
			
		}
		else if(browser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
			
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			
			driver=new FirefoxDriver();
		}
		else {
			System.out.println("default browser");
		}
		driver.get("https://demo.wpeverest.com/user-registration/simple-registration-form/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	 @Test
	public void validation() throws InterruptedException {
		ResisterObjectClass resister=new ResisterObjectClass(driver);
		resister.Action();
		
		boolean status=driver.findElement(By.xpath("//ul[normalize-space()='User successfully registered.']")).isDisplayed();
	Assert.assertEquals(status, true);
	
	} 
	 
	 
	 
	 
}
