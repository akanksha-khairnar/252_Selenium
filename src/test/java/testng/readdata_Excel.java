package testng;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class readdata_Excel {
	@Test
	public void testData() throws IOException {
	FileInputStream file=new FileInputStream("D:\\Core-Java\\HospitalManagment_MavenProject\\ExcelTestData\\TestData.xlsx");
		XSSFWorkbook work=new XSSFWorkbook(file);
		XSSFSheet sheet= work.getSheetAt(0);
		int row=sheet.getLastRowNum();
		System.out.println(row);
		int cols=sheet.getRow(0).getLastCellNum();
		System.out.println(cols);
//		for(int i=0;i<row;i++) {
//			XSSFRow singlerow	=sheet.getRow(i);
//			for(int j=0;j<cols;j++){
//				XSSFCell cell= singlerow.getCell(j);
//			String value=	cell.getStringCellValue();
//			System.out.println(value);
//			}
//		}
//		System.out.println();
		
		
		for(int i=0;i<=row;i++) {
			XSSFRow singlerow	=sheet.getRow(i);
			for(int j=0;j<cols;j++){
				XSSFCell cell=singlerow.getCell(j);
				//String value=cell.getStringCellValue();
				switch(cell.getCellType()) {
				case STRING: System.out.print(cell.getStringCellValue()+" ||");break;
				case BOOLEAN:System.out.print(cell.getBooleanCellValue()+"||");break;
				case NUMERIC:System.out.print(cell.getNumericCellValue()+"|| ");break;
				default:System.out.print(cell.getDateCellValue());break;
				}
				
			}
		
		System.out.println();
	}
}
}
