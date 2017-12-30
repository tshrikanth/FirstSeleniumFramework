package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Factory.DataFactory;
import pageObjects.LoginPage;
import utility.Helper;


public class Testing01 extends BaseClass{
	
	
	ExtentTest logger;
	
	@BeforeMethod
	public void setup() 
	{
		logger = report.startTest("Login Testing");
		
	}
	@AfterMethod
	public void teardown(ITestResult result) {
		
		if(result.getStatus()==ITestResult.FAILURE) {
			logger.log(LogStatus.FAIL, logger.addScreenCapture(Helper.ScreenShot(driver)));
		}
		report.endTest(logger);
	}
	
	@Test
	public void LaunchApplication() throws Exception 
	
	
	{
		
		
		LoginPage login=PageFactory.initElements(driver, LoginPage.class);
		Boolean DashBoardStatus1 = login.LoginApplication(DataFactory.getExceldata().getData("Login", 1, 0), DataFactory.getExceldata().getData("Login", 1, 1));
		//Boolean DashBoardStatus1 =login.LoginApplication("admin","admin");
		System.out.println("Status is" + DashBoardStatus1);
		if(DashBoardStatus1) {
			logger.log(LogStatus.PASS, "Dashboard is displayed Shrikanth");
			
			logger.log(LogStatus.PASS, logger.addScreenCapture(Helper.ScreenShot(driver)));
		}else {
			logger.log(LogStatus.FAIL, "Dashboard not displayed Shriknath");
			Assert.assertTrue(DashBoardStatus1);
			
			}
		
		
		
	}
	
	
}
