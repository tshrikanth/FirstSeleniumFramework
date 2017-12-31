package Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	
	static WebDriver driver=null;
	
	public static WebDriver StartBrowser(String browser, String url) throws InterruptedException
	{
		if(browser.equalsIgnoreCase("firefox")) {
			//System.setProperty("webdriver.gecko.driver","C:\\Users\\SRIKANTH HP\\Desktop\\Shrikanth\\workspace\\com.maven.test\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else
		{
			System.out.println("Please pass correct browser name Ex: firefox ");
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		return driver;
	}

}
