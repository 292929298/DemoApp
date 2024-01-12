package geniricsUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileUtility {
	public String fetchDataFromPropertyFile(String key) throws Exception {
		FileInputStream file = new FileInputStream(
				"C:\\Users\\hp\\eclipse-workspace\\api\\Auto\\testData\\commonData.properties");
		Properties prop = new Properties();
		prop.load(file);
		return prop.getProperty(key);
	}

	public String fetchStringDataFromExcelSheet(String sheetName, int rowno, int cellno) throws Exception {
		FileInputStream file = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\api\\Auto\\testData\\ecxel\\book2.xlsx");
		return WorkbookFactory.create(file).getSheet(sheetName).getRow(rowno).getCell(cellno).getStringCellValue();
	}

	public double fetchNumericDataFromExcelSheet(String sheetName, int rowno, int cellno) throws Exception {
		FileInputStream file = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\api\\Auto\\testData\\ecxel\\book2.xlsx");
		return WorkbookFactory.create(file).getSheet(sheetName).getRow(rowno).getCell(cellno).getNumericCellValue();
	} 

}
