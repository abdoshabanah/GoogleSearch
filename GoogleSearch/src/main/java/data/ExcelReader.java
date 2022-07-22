package data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	static FileInputStream fis = null;
	public FileInputStream getFileInputStream() {

		String filePath = System.getProperty("user.dir")+"/src/main/java/data/test.xlsx";  

		File srcFile = new File(filePath);
		try {
			fis = new FileInputStream(srcFile);
		} catch (FileNotFoundException e) {
			System.out.println("Error Occured: "+ e.getMessage());
		}

		return fis;
	}
		public Object [][]SearchData() throws IOException{
		fis = getFileInputStream();
		XSSFWorkbook wb =new XSSFWorkbook (fis);
		XSSFSheet sheet = wb.getSheet("Search");    

		int TotalNumberofRows = (sheet.getLastRowNum()+1);
		int TotalNumberofCols = 1;

		String [][] arrayofExcelData = new String[TotalNumberofRows][TotalNumberofCols];
		for (int i = 0; i < TotalNumberofRows; i++) {
			for (int j = 0; j < TotalNumberofCols; j++) {
				XSSFRow row = sheet.getRow(i);
				arrayofExcelData[i][j] = row.getCell(j).toString();

			}
		}
		wb.close();
		return arrayofExcelData;


	}
	
}
