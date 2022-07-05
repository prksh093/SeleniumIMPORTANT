package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MultipleDataFromtheExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
			FileInputStream fis=new FileInputStream("C:\\Users\\Prakash\\Desktop\\createcustomer.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			int rowcount = wb.getSheet("invalid login").getLastRowNum();
			for(int i=1;i<rowcount;i++) {
				String un = wb.getSheet("invalid login").getRow(i).getCell(0).getStringCellValue();
				String pwd = wb.getSheet("invalid login").getRow(i).getCell(1).getStringCellValue();
				System.out.println(un+"  "+pwd);
			}
			
		
		}

	}


