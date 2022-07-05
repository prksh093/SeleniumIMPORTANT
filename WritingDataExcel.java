package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WritingDataExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
FileInputStream fis=new FileInputStream("C:\\Users\\Prakash\\Desktop\\createcustomer.xlsx");
Workbook wb = WorkbookFactory.create(fis);
wb.getSheet("create customer").getRow(1).getCell(0).getStringCellValue();
FileOutputStream fos=new FileOutputStream("C:\\Users\\Prakash\\Desktop\\createcustomer.xlsx");
wb.write(fos);
wb.close();
	}
}



//                     not getting answer