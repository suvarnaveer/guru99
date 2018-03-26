package Excel;

import library.ExcelDataConfig;

public class ReadDatafromlib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExcelDataConfig obj=new ExcelDataConfig("C:\\Suvarna\\Exceldata\\TestData.xlsx");
	
		System.out.println(obj.getData(0, 0, 0));
	}

}
