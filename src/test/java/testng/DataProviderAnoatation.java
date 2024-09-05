package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnoatation {

	WebDriver driver;
	@Test(dataProvider="TData")
	void Singin(String username,String password) {
		driver=new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

			//validate using URL
	/*	String ActualUrl=driver.getCurrentUrl();
		String ExpectedUrl="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		Assert.assertEquals(ActualUrl,ExpectedUrl );
		System.out.println("done");*/
		
		//validate using title
	/*	String Actualtitle=driver.getTitle();
		String ExpectedTitle="OrangeHRM";
		Assert.assertEquals(Actualtitle, ExpectedTitle);
	/*	if(Actualtitle.equals(ExpectedTitle)) {
			Assert.assertTrue(true);
		}
			else {
				Assert.assertFalse(true);
			}*/
		
		//validate using page source
		
		boolean ActualPagesourc=driver.getPageSource().contains("Dashboard");
	boolean expectedpagesrc=true;
		//Assert.assertEquals(ActualPagesourc,expectedpagesrc);
		if(ActualPagesourc==true) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertFalse(true);

		}
		
	}

	
	@DataProvider(name="TData")//used to provide different data to methods
	Object[][] TestData() {
		Object data[][]=new Object[5][2];
		//Test data set1
		data[0][0]="Admin";
		data[0][1]="admin123";

		//Test data set2
		data[1][0]="admin";
		data[1][1]="admin@123";

		//Test data set3
		data[2][0]="Admin123";
		data[2][1]=" ";


		//Test data set4
		data[3][0]=" ";
		data[3][1]="admin123";

		//Test data set5
		data[4][0]="Admin@123";
		data[4][1]="admin";
 return data;
	}
}
