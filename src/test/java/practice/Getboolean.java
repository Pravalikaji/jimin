package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Getboolean {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fise= new FileInputStream("C:\\Users\\prava\\OneDrive\\文档\\testdata.xlsx");
		boolean data1=WorkbookFactory.create(fise).getSheet("sheet1").getRow(0).getCell(2).getBooleanCellValue();
		System.out.println(data1);
	}

	}


