package pageobjectmodel1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResisterPage {
public	WebDriver driver;
	
	public ResisterPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")
	WebElement firstname;
	
	@FindBy(xpath="//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")
	WebElement lastname;
	
	@FindBy(xpath="//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")
	WebElement address;
	
	@FindBy(xpath="//*[@id=\"eid\"]/input")
	WebElement mail;
	
	@FindBy(xpath="//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")
	WebElement phonenum;
	
	@FindBy(xpath="//input[@value='FeMale']")
	WebElement gender;
	
	@FindBy(xpath="//input[@id='checkbox1']")
	WebElement checkbox1;
	
	@FindBy(xpath="//input[@id='checkbox2']")
	WebElement checkbox2;
	
//	@FindBy(id="msdd")
//	WebElement lang;
//	
//	@FindBy(xpath="//a[contains(text(),'English')]")
//	WebElement ele;
	public void access() {
		
		firstname.sendKeys("Akanksha");
		lastname.sendKeys("Khairnar");
		address.sendKeys("Pune");
		mail.sendKeys("abc@gmail.com");
		phonenum.sendKeys("1234567890");
		gender.click();
		checkbox1.click();
		checkbox2.click();
//		lang.click();
//		ele.click();
	}
	
	public void URL() {
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
	}
}
