package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage{
	
	WebDriver driver;
	
	public LoginPage(WebDriver ldriver) {
		this.driver=ldriver;
	}
	
	@FindBy(name="txtUsername") WebElement uname;
	@FindBy(id="txtPassword")WebElement pass;
	@FindBy(id="btnLogin") WebElement submit;
	
	public Boolean LoginApplication(String username, String password) {
	
		uname.sendKeys(username);
		pass.sendKeys(password);
		submit.click();
		
		Boolean DashBoardStatus = false;
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		try {
			
			WebElement Dashboard = wait
						
			.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Dashboard']")));
			DashBoardStatus = Dashboard.isDisplayed();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("User is not able to log in and DashBoard is not displayed");
			}
		return DashBoardStatus;
	}
	
}
