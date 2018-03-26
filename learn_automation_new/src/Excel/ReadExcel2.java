package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File src=new File("C:\\Suvarna\\Exceldata\\TestData.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);
		int rowcount=sheet1.getLastRowNum();
		System.out.println("Total no of rows are:" +rowcount);
		for (int i=0;i<rowcount;i++) {
			String data0=sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Data from Row"+i+"is"+data0);
		}
		wb.close();
	}

}
