package seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MavenRepositery{
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml/5.2.5");
		
	}

}
