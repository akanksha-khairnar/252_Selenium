package testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticalDemo {
	WebDriver driver;
	@Test
	void show() {
		driver=new ChromeDriver();
		driver.get("https://trytestingthis.netlify.app/");
		
		List<WebElement> data=driver.findElements(By.xpath("//div[@class='main']//fieldset//table//tbody//tr//td"));
		System.out.println("size of table : "+data.size());
		List<WebElement> rows=	driver.findElements(By.xpath("//div[@class='main']//fieldset//table//tbody//tr"));
		System.out.println( "Number of rows : "+rows.size());
		List<WebElement> cols=	driver.findElements(By.xpath("//div[@class='main']//fieldset//table//tbody//tr//th"));
		System.out.println("Number of cols : "+cols.size());
		
		for(int r=2;r<=rows.size();r++) {
			for(int c=1;c<=cols.size();c++) {
				WebElement ele=driver.findElement(By.xpath("//div[@class='main']//fieldset//table//tbody//tr["+r+"]//td["+c+"]"));
				String txt=ele.getText();
				System.out.print(txt+"  ");
			}
			System.out.println();
		}
	}
	
}
