package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;

import Factory.BrowserFactory;
import Factory.DataFactory;




public class BaseClass {
	WebDriver driver;
	ExtentReports report;
	
	@BeforeSuite
	public void StartReport() {
		
		report = new ExtentReports("C:\\Users\\SRIKANTH HP\\Desktop\\Shrikanth\\workspace\\com.maven.test\\Reports\\"+System.currentTimeMillis()+".html");
		//report = new ExtentReports(System.getProperty("user.dir")+"\\Reports\\"+System.currentTimeMillis()+".html");
	
		}
	
	@AfterSuite
	public void EndReport() {
		report.flush();
	}
	
	@BeforeTest
	public void startBrowser() 
	{

		System.out.println("========== Starting Browser==================");
		
		try {
			
			driver = BrowserFactory.StartBrowser(DataFactory.getConfig().getBrowser(), DataFactory.getConfig().getURL());
			//driver = BrowserFactory.StartBrowser("Firefox", "http://google.com");
			System.out.println("Opened Login Page");
			
		} 
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Issue in loading browser" + e.getMessage());
		}
		
		
		//System.out.println("========== Browser Started and Application is running==================");
	}

	@AfterTest
	public void closeBrowser() 
	
	{

		System.out.println("========== Closing Browser==================");
		
		driver.quit();
		
		System.out.println("==========Browser closed==================");
	}

}
