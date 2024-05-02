package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetNumericdata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fise= new FileInputStream("C:\\Users\\prava\\OneDrive\\文档\\testdata.xlsx");
		double data1=WorkbookFactory.create(fise).getSheet("sheet1").getRow(0).getCell(1).getNumericCellValue();
		System.out.println(data1);
	}

	}


