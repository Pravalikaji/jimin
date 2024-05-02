package vtigergeneric;

import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFIleUtility {

	public String readdatafromexcelfile(String sheetname,int rownum,int cellnum) throws Throwable {
		FileInputStream fisp=new FileInputStream("");

		return WorkbookFactory.create(fisp).getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
	}

}
