package com.vtiger.genericLib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataUtility {
	public String getDataFromProperty(String key) throws IOException {

		FileInputStream fis = new FileInputStream("D:\\STUDY MATERIAL\\CRM Project\\VTIGER\\Vtiger.properties");

		Properties pobj = new Properties();
		pobj.load(fis);

		return pobj.getProperty(key);
	}

	public String getDataFromExcel(String sheetname, int rownum, int cellnum)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("D:\\STUDY MATERIAL\\CRM Project\\VTIGER\\Products.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet(sheetname);
		DataFormatter format = new DataFormatter();
		return format.formatCellValue(sh.getRow(rownum).getCell(cellnum));
	}
}