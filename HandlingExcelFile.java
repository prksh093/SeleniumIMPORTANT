package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.ReadOnlyFileSystemException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcelFile {


	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\Prakash\\Desktop\\createcustomer.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet("create customer").getRow(1).getCell(3).getStringCellValue();
		System.out.println(data);

	}

}
