package page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage {

	// Variable Declaration
	@FindBy (xpath = "//table//div") 
	private WebElement textMessage ;
	
	@FindBy (xpath = "(//input[@name='email'])[2]") 
	private WebElement emailOrPhoneNumber ;
	
	@FindBy (xpath = "//a[text()='Cael']") 
	private WebElement cancelButton ;
	
	@FindBy (xpath = "//button[text()='Search']") 
	private WebElement searchButton ;
	
	@FindBy (xpath = "//button[text()='Search']") 
	private WebElement frame ;
	
	@FindBy (xpath = "(//form[@id='identify_yourself_flow']/div/div[2]//div)[2]") 
	private WebElement noSuchResultText ;
	
	@FindBy (xpath = "(//form[@id='identify_yourself_flow']/div/div[2]//div)[3]") 
	private WebElement errorMsg ;
	
	// findElements ()  -> List<WebElement>
	@FindBy (xpath = "//a") 
	private List<WebElement> links ;

	
	private WebDriver driver ;
	
	// Variable Initialization 
	public ForgotPasswordPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver ;
	}
	
	public String getErrorTitle() {
		return noSuchResultText.getText() ;
	}
	
	public String getErrorMessage() {
		return errorMsg.getText() ;
	}
	
	public void switchToFrame() {
		driver.switchTo().frame(frame) ;
	}
		
	
	// Variable Use
	public String getTextMessage() {
		String text = textMessage.getText();
		return text;
		// select date drom down 
	}
		
	public void sendEmailOrPhone() {
		emailOrPhoneNumber.sendKeys("velocity@gmail.com");
	}
	
	public void clickOnCancelButton() {
		cancelButton.click();
		// mouse action 
	}
	
	public void clickOnSearchButton() {
		searchButton.click();
	}
}
