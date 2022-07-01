package com.actitime.Generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class excelgeneric {

	public void  getexcelData(String Name ,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./Data/createcustomer.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		wb.getSheet("sheetName").getRow(row).getCell(cell).setCellValue("value");
		FileOutputStream fos=new FileOutputStream("./Data/testscripy.xlsx");
		wb.write(fos);
		wb.close();
	}
}



