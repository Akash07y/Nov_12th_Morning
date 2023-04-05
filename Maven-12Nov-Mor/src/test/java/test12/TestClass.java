package test12;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import module.SignUpPopUp;
import page.ForgotPasswordPage;
import page.LoginPage;

public class TestClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akash\\OneDrive\\Documents\\Automation\\Selenium\\chromedriver_win32 (6)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver() ;
		
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS) ;
		
		driver.get("https://www.facebook.com/");
	
		Thread.sleep(3000);
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.sendUserName();
		loginPage.sendPassword();
		loginPage = new LoginPage(driver);
		Thread.sleep(3000);
		loginPage.clickForgotPassword();
		Thread.sleep(3000);
		ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage(driver);
		forgotPasswordPage.clickOnCancelButton();
		
		
		driver.switchTo().frame("id") ;
		// iframe - int , String
		// parent frame and default contatint
	}

}
