package Factory;

import java.io.IOException;

import DataProvider.ConfigDataProvider;
import DataProvider.ExcelDataProvider;

public class DataFactory {

	
	public static ConfigDataProvider getConfig() throws IOException {
	 
		ConfigDataProvider config = new ConfigDataProvider();
		return config;
		
	}
	
	public static ExcelDataProvider getExceldata() {
		
		ExcelDataProvider excel = new ExcelDataProvider();
		return excel;
	}
	
	
	
}
