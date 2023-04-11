package module;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPopUp {

		@FindBy (xpath = "//table//div") 
		private WebElement firstName ;
		
		@FindBy (xpath = "(//input[@name='email'])[2]") 
		private WebElement lastName ;
		
		@FindBy (xpath = "//a[text()='Cancel']") 
		private WebElement dayOfBirth ;
		
		@FindBy (xpath = "//button[text()='Search']") 
		private WebElement monthOfBirth ;
		
		@FindBy (xpath = "//button[text()='Search']") 
		private WebElement yearOfBirth ;
		
		@FindBy (xpath = "//button[text()='Search']") 
		private WebElement custom ;
		
		@FindBy (xpath = "//button[text()='Search']") 
		private WebElement male ;
		
		@FindBy (xpath = "//button[text()='Search']") 
		private WebElement female ;
		
		private WebDriver driver;
		private WebDriverWait wait ;
		private Actions action;
		private JavascriptExecutor javascriptExecutor ;
		
		// Variable Initialization 
		public SignUpPopUp(WebDriver driver) {
			PageFactory.initElements(driver, this);
			this.driver = driver ;
			wait = new WebDriverWait(driver, 20) ;
			action = new Actions(driver);
			javascriptExecutor = (JavascriptExecutor)driver ;
		}
	
		public void clickOnCustom() {
			//Actions action = new Actions(driver);
			
			//WebDriverWait wait = new WebDriverWait(driver, 20) ;  // 20Sec
			wait = new WebDriverWait(driver, 30) ;
			wait.until(ExpectedConditions.visibilityOf(custom));
			javascriptExecutor.executeScript("arguments[0].scrillIntoView(true);", custom);
			javascriptExecutor.executeScript("window.scrollBy(0,-50)");
			
			action.moveToElement(custom).click().build().perform();
		}
		public void selectDayOfBirth() {
			
			//WebDriverWait wait = new WebDriverWait(driver, 20) ;  // 20Sec
			wait = new WebDriverWait(driver, 30) ;
			wait.until(ExpectedConditions.visibilityOf(dayOfBirth));
			
			Select select = new Select(dayOfBirth);
			// text "2" is not present now so using select by index
			//select.selectByVisibleText("2"); 
			select.selectByIndex(2);
		}
		
		public void selectMonthOfBirth() {
			Select select = new Select(monthOfBirth);
			select.selectByVisibleText("May");	
		}
		
		public void sendFirstName() {
			firstName.sendKeys("dbgfbg");	
		}
		
}
