package seleniumproject;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataExcel {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook book=new XSSFWorkbook("D:\\Core-Java\\HospitalManagment_MavenProject\\ExcelTestData\\datafile.xlsx");
		XSSFSheet  sheet=	book.getSheetAt(0);
		int rows=sheet.getLastRowNum();
		System.out.println(rows);
		int cols=sheet.getRow(0).getLastCellNum();
		System.out.println(cols);
		
		for(int r=0;r<4;r++) {
			for(int c=0;c<2;c++) {
				XSSFRow row=sheet.getRow(r);
				XSSFCell cell=row.getCell(c);
				String value=cell.getStringCellValue();
				System.out.print(value+" ");
			}
			System.out.println();
		}

	}

}
