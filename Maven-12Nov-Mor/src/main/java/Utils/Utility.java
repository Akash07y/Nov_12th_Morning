package Utils;

import java.io.File;

import org.openqa.selenium.WebDriver;

public class Utility {
	// Repeted code / common code
	// 2 methods for Exel sheet data, screenshot
	
	public static void captureScrren(WebDriver driver, String testID) {
		
		// Image name ->   Test-testID-DateAndTime.jpg
		// e.g. ->         Test-T1023 30-03-2023 08 33 44.jpg
		
		
		File dest = new File("test-output\\FailTestScreesnhots"+ + ".jpeg");
	}
	
	// Test Class input -> SheetName, Row No, Cell No. 
	public static String getExcelData(String sheet, int row, int cell) {
		
		String path = "src/main/resources/data/ProjectTestData.xlsx";
		
		try {
			String data = getStringCellValue();
		}
		catch(exceptionName e) {
			double value = getNumericCellValue();
			// convert double to string
			String data = value to string data;
		}		
	}
}
