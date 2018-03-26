package library;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	XSSFWorkbook wb;
	XSSFSheet sheet;
	public ExcelDataConfig(String Excelpath){
		try {
			File src=new File(Excelpath);
			FileInputStream fis=new FileInputStream(src);
			 wb=new XSSFWorkbook(fis);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
		
	}
	
	public String getData(int Sheetnumber,int rownum,int column) {
		 sheet=wb.getSheetAt(Sheetnumber);
		String data=sheet.getRow(rownum).getCell(column).getStringCellValue();
		return data;
		
	}
	
	public int getrowcount(int sheetindex) {
		int row=wb.getSheetAt(sheetindex).getLastRowNum();
		row=row+1;
		return row;
	}
}
