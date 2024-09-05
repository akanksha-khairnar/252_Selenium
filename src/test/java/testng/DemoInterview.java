package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoInterview {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		
	WebElement ele1=	driver.findElement(By.xpath("//div[@id='column-a']"));
	WebElement ele2=driver.findElement(By.xpath("//div[@id='column-b']"));
	
	Actions ac=new Actions(driver);
	ac.dragAndDrop(ele1, ele2).perform();
	}
	
	
	
}
