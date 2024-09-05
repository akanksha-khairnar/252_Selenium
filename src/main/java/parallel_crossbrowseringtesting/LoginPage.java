package parallel_crossbrowseringtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
		  
	
	 public LoginPage(WebDriver driver) throws InterruptedException{
		
		PageFactory.initElements(driver, this);
		Thread.sleep(5000);
	}
	
		@FindBy(name="username") 
		WebElement username;
		
		@FindBy(name="password") 
		WebElement pass;
		
		@FindBy(xpath="//button[normalize-space()='Login']") 
		WebElement button;
		
	public	void Operations() {
		username.sendKeys("Admin");
		pass.sendKeys("admin123");
		button.click();
			
		}
		
		}
