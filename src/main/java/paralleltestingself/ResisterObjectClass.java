package paralleltestingself;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResisterObjectClass {
  
	 ResisterObjectClass(WebDriver driver) throws InterruptedException{
		 PageFactory.initElements(driver, this);
		 Thread.sleep(3000);
	 }
	
	@FindBy(xpath="//input[@id='first_name']")
	WebElement firstname;
	
	@FindBy(xpath="//input[@id='last_name']") 
	WebElement  lastname ;
	
	@FindBy(xpath="//input[@id='user_login']") 
	WebElement  username;
	
	@FindBy(xpath="//input[@id='user_email']") 
	WebElement  email;
	
	@FindBy(xpath="//input[@id='user_pass']")
	WebElement  pass;
	
	@FindBy(xpath="//input[@id='user_confirm_password']") 
	WebElement confirmpass;
	
	@FindBy(xpath="//textarea[@id='description']") 
	WebElement bio ;
	
	@FindBy(xpath="//button[normalize-space()='Submit']") 
	WebElement  button;
	
	
	public void Action() {
		firstname.sendKeys("akanksha");
		lastname.sendKeys("somwanshi");
		username.sendKeys("akanksha123");
		email.sendKeys("abc@gmail.com");
		pass.sendKeys("123@abc");
		confirmpass.sendKeys("123@abc");
		bio.sendKeys("hi Everyone");
		button.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
