package datadriventesting;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	@Test(dataProvider="tdata")
	void show(String username,String password) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/recruitment/viewCandidates");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		String url=driver.getCurrentUrl();
		//String text =driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")).getText().equals("Invalid credentials");
	//	System.out.println(text);
		String exurl="https://opensource-demo.orangehrmlive.com/web/index.php/recruitment/viewCandidates";
	//	Assert.assertEquals(url, exurl);//pass testcase for only positive data
		//Assert.assertEquals(text, "Invalid credentials");//pass negative data
	if(url.equals(exurl)) {
		Assert.assertTrue(true);
	}
	else if(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")).getText().equals("Invalid credentials")) {
		Assert.assertTrue(true);
	}
	else {
		Assert.assertFalse(true);
	}
	//driver.quit();	
	}
	
	@DataProvider(name="tdata")
	Object[][] ProvidedData() throws IOException{
		Object[][] testdata=ExcelData.readData(); 
		return testdata;
	}
}
