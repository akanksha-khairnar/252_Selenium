package pageobjectmodel1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class NaukariDotCom {
	WebDriver driver;
	public NaukariDotCom(WebDriver driver) {
	this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@id='name']")
	WebElement name;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement pass;
	
	@FindBy(xpath="//input[@id='mobile']")
	WebElement monum;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/form/div[2]/div[4]/div[2]/div[2]")
	WebElement status;
	
	@FindBy(xpath="//div[@class='registerWrapper']//div[1]//div[1]//a[1]//i[1]")
	WebElement outside;
	
	@FindBy(xpath="//input[contains(@placeholder,'Mention the city you live in')]")
	WebElement city;
	
	@FindBy(id="currentCountry")
	WebElement country;
	
//	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/form/div[2]/div[5]/div/div[2]/div/div[3]/span[1]")
//	WebElement pune;
//	
	@FindBy(xpath="//body/div[@id='root']/div[contains(@class,'container')]/div[contains(@class,'content')]/div[contains(@class,'right-container')]/div[contains(@class,'right-pane')]/div[contains(@class,'registerWrapper')]/div[contains(@class,'formWrapper')]/form[contains(@name,'register')]/div[contains(@class,'formElems')]/div[contains(@class,'formField')]/a[contains(@class,'')]/i[1]")
	WebElement box;
	
public void access() {
		
		name.sendKeys("Akanksha");
		email.sendKeys("abc@gmail.com");
		pass.sendKeys("abcdfg");
		monum.sendKeys("0987654323");
		status.click();
		outside.click();
		city.sendKeys("pune");
		country.sendKeys("Australia");;
//		pune.click();
		box.click();
		
//		lang.click();
//		ele.click();
	}
	
	public void URL() throws InterruptedException {
		
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=11496&wExp=N");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
}
