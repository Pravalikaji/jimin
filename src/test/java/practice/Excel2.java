package practice;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel2 {

	public static void main(String[] args) throws Throwable   {
		// TODO Auto-generated method stub
		FileInputStream fise= new FileInputStream("C:\\Users\\prava\\OneDrive\\文档\\testdata.xlsx");
		String data1=WorkbookFactory.create(fise).getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(data1);
	}
}




