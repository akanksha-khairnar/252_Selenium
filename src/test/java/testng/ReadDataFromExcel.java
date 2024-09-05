package testng;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class ReadDataFromExcel {
	
	@Test
	void dataReader() throws IOException {
		FileInputStream file=new FileInputStream("D:\\Core-Java\\HospitalManagment_MavenProject\\DataOFExcel\\MyFile.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(file);
		XSSFSheet  sheet=book.getSheetAt(0);
		
			int NumOfrows=		sheet.getLastRowNum();
			System.out.println("no of rows"+NumOfrows);
			
			short cols=sheet.getRow(1).getLastCellNum();
			System.out.println("no of cols"+cols);
		for(int i=0;i<5;i++) {
			for(int j=0;j<2;j++) {
				Row row=sheet.getRow(i);
				Cell cell=row.getCell(j);
				String data=cell.getStringCellValue();
				System.out.print(data+"  ");
			}
			System.out.println();
		}
			
			
	}
	}


