package seleniumproject;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_TestData {
 static void excelData() throws IOException {
	 
	 FileInputStream stm=new FileInputStream("D:\\Core-Java\\HospitalManagment_MavenProject\\ExcelTestData\\xcelfile.xlsx");
	 
	 XSSFWorkbook workbook=new XSSFWorkbook(stm);
	 XSSFSheet sheet=workbook.getSheetAt(0);//workbook.getsheet("Sheet1");
	 
	 //coutn no of rows
	int noofrows= sheet.getLastRowNum();
	System.out.println("no of rows "+noofrows);
	
	//count no of cols
	int Noofcols=sheet.getRow(0).getLastCellNum();
	System.out.println("no of columns "+Noofcols);
	 
	/* //to read single cell value
	 XSSFRow row= sheet.getRow(0);
	 XSSFCell cell= row.getCell(1);
	String value= cell.getStringCellValue();
	System.out.println(value);*/
	
	/*first way //To read all data
	for(int i=0;i<4;i++) {
		 for(int j=0;j<2;j++) {
	 XSSFRow row= sheet.getRow(i);
	 XSSFCell cell= row.getCell(j);
	String value= cell.getStringCellValue();
	System.out.print(value+"  ");
		 }
		 System.out.println();
	 }*/
	
	 //2nd way
//	for(Row row:sheet) {
//		for(Cell cell:row) {
//			String data=cell.getStringCellValue();
//			System.out.print(data+"   ");
//		}
//		System.out.println();
//	}
	
	//3rr way
	for(int i=0;i<5;i++) {
		XSSFRow row= sheet.getRow(i);
	   for(int j=0;j<2;j++) {
	
	 XSSFCell cell= row.getCell(j);
	 switch(cell.getCellType()) {
	 case STRING:System.out.print(cell.getStringCellValue()+"  ");break;
	 case NUMERIC:System.out.print(cell.getNumericCellValue()+"  ");break;
	 case BOOLEAN:System.out.print(cell.getBooleanCellValue()+"  ");break;
	 }
	   }
	 System.out.println(); 
	}
	
	
 }
	public static void main(String[] args) throws IOException {
		
		Excel_TestData .excelData();

	}

}
