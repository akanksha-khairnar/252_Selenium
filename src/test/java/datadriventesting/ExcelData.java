package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {

	
	public static	Object[][] readData() throws IOException {
			
		FileInputStream file=new FileInputStream("D:\\Core-Java\\HospitalManagment_MavenProject\\ExcelTestData\\datafile.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheetAt(0);
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
