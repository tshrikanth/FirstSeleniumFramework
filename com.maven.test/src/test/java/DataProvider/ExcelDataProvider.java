package DataProvider;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	XSSFWorkbook wb;
	
	public ExcelDataProvider() {
		
		//File fl = new File(System.getProperty("user.dir"+"/TestData/Data.xlsx"));
		File fl = new File("C:/Users/SRIKANTH HP/Desktop/Shrikanth/workspace/com.maven.test/TestData/Data.xlsx");
		//C:\Users\SRIKANTH HP\Desktop\Shrikanth\workspace\com.maven.test\TestData
		try {
			FileInputStream fi = new FileInputStream(fl);
			wb = new XSSFWorkbook(fi);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Issue in reading Excel File "+ e.getMessage());
		}
		
		
	}
	
	public String getData(String sheet,int Row, int Column ) {
		
		String Value = wb.getSheet(sheet).getRow(Row).getCell(Column).getStringCellValue();
		return Value;
	}

}
