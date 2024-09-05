package parallel_crossbrowseringtesting;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginPageTest {
 
	WebDriver driver;
	@BeforeClass
	@Parameters({"browser"})
	 public void setUp(String brow) {
		 switch(brow.toLowerCase()) {
		 case "chrome": driver=new ChromeDriver();
		 break;
		 case "edge":  driver=new EdgeDriver();
		 break;
		 case "firefox":  driver=new FirefoxDriver();
		 break;
		 default:System.out.println("invalide browser");
		 return;
		 }
		 
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	 }
	
	@Test
	public void loginTestCase() throws InterruptedException {
		LoginPage lp=new LoginPage(driver);
		lp.Operations();
	
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		
		
	}
	
	//@AfterClass
//	public void tearDown() {
//		
//		driver.close();
//	}
//	
	
	
	
	
	
	
	
	
	
	
}
