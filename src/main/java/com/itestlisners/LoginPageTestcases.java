package com.itestlisners;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageTestcases {
		WebDriver driver;
		
		@BeforeMethod
		void setup() {
			driver=new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		@AfterMethod()
		void tearDown(){
			driver.quit();
		}
		@Test(dataProvider="tdata")
		void display(String username,String pass) {
			LoginPage lg=new LoginPage(driver);
			lg.username(username);
			lg.password(pass);
			lg.login();
			Assert.assertTrue(driver.getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index"));
		}
		
	
		@DataProvider(name="tdata")
		Object [][]  testdata() throws IOException {
			FileInputStream file=new FileInputStream("D:\\Core-Java\\HospitalManagment_MavenProject\\DataOFExcel\\datafile.xlsx");
			XSSFWorkbook book=new XSSFWorkbook(file);
			XSSFSheet  sheet=book.getSheetAt(0);
			int rows=sheet.getLastRowNum();
			System.out.println(rows);
			
			int cols=sheet.getRow(0).getLastCellNum();
			System.out.println(cols);
			Object [][] data=new Object[rows][cols];
			for(int i=0;i<rows;i++) {
				XSSFRow row=sheet.getRow(i);
				for(int j=0;j<cols;j++) {
					XSSFCell  cell=row.getCell(j);
					data[i][j]=cell.toString();
				}
			}
			return data;
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
}
