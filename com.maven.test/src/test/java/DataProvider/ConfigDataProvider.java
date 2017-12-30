package DataProvider;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {
	
	FileInputStream fi;
	Properties prop;
	public ConfigDataProvider() throws IOException{
		try {
			 fi = new FileInputStream(System.getProperty("user.dir")+"/Configuration/config.properties");
			 
			 prop = new Properties();
			 prop.load(fi);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Property file not loaded properly"+ e.getMessage());
		}
		
			
	} 

	
	public String getBrowser() {
	
			String browser = prop.getProperty("browser");
			return browser;
		}
	
	public String getURL() {
		
		String url = prop.getProperty("appurl");
		return url;
	}
}
