package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	// Variable Declaration
	@FindBy (xpath = "//input[@id='email']") 
	private WebElement userName ;
	
	@FindBy (xpath = "//input[@type='password']") 
	private WebElement password ;
	
	@FindBy (xpath = "//button[@name='login']") 
	private WebElement loginButton ;
	
	@FindBy (xpath = "//a[text()='Forgotten password?']") 
	private WebElement forgotPassword ;
	
	@FindBy (xpath = "//a[text()='Create new account']") 
	private WebElement creatNewAcc ;
	
	// Variable Initialization 
	//driver123 = driver = new ChromeDriver
	public LoginPage(WebDriver driver123) {
		PageFactory.initElements(driver123, this);
	}
	
	// Variable Use
	public void sendUserName(String user) {
		userName.sendKeys(user);
	}
	
	public void getTextofUserName() {
		String text = userName.getAttribute("aria-label");
	}
	
	public void sendPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void clickOnLoginButton() {
		loginButton.click();
	}
	
	public String getTextOfLoginButton() {
		return loginButton.getText();
	}
	
	public void loginButoonAction() {
		loginButton.click();
		
		loginButton.getText();
	}
	
	public void clickForgotPassword() {
		forgotPassword.click();
	}
	
	public void clickCreatNewAcc() {
		creatNewAcc.click();
	}
	
	public void loginToApplication() {
		userName.sendKeys("Velocity@gmail.com");
		password.sendKeys("123456789");
		loginButton.click();
	}
}
