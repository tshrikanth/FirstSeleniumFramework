package Demo;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Demo {
	
	@Test
	public void startbrowser() throws Exception
	{
				
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName(BrowserType.FIREFOX);
		cap.setPlatform(Platform.WIN8_1);
		URL url = new URL("http://localhost:4444/wb/hub/");
				
		WebDriver driver = new RemoteWebDriver(url, cap);
		driver.get("http://google.com");
		
		String title = driver.getTitle();
		driver.findElement(By.id("top")).sendKeys(Keys.);
		System.out.println("URL title is "+ title);
	}
	
	
	

}
