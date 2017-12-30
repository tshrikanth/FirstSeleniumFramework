package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper {
	
	public static String ScreenShot(WebDriver driver) {
		
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String File = System.getProperty("user.dir")+"/Screenshots/"+System.currentTimeMillis()+".png";
		File destFile = new File(File);
		
		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Please check Screenshot "+ e.getMessage());
		}
		return File;
	}

}
