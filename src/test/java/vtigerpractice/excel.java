package vtigerpractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.remote.http.HttpClient.Factory;

public class excel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\prava\\OneDrive\\文档\\workbook.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		String data1=wb.getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(data1);
	}

}
