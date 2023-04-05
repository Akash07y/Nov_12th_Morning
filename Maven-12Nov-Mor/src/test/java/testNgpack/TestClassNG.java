package testNgpack;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class TestClassNG {
	SoftAssert soft ;

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite   TestClassNG_1");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test   TestClassNG_1");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class TestClassNG_1");
		//soft = new SoftAssert(); Wrong Code
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method TestClassNG_1");
		soft = new SoftAssert(); // Right
	}
	
	@Test (dependsOnMethods = "test2")
	public void test1() {
		//soft = new SoftAssert(); // Right
		System.out.println("Test 1");
		
		String actualTitle = "Amezon Login Page" ;
		String expectedTitle = "Amezon Login Page123";
		
		String actaulURL = "https://www.Amezon.com/" ;
		String expectedURL = "https://www.Amezon.com/home";
		
		String actualText = "Sign In New Account" ;
		String expectedText = "Sign In  New Account234";
		
		// Soft Assertion 
//		soft.assertEquals(actualTitle, expectedTitle, "Sign In  Title is wrong");
//		soft.assertEquals(actaulURL, expectedURL, " Sign In  URL not found");
//		soft.assertEquals(actualText, expectedText, " Sign In  Button Text is wrong");
//		soft.assertAll();
	}
	
	@Test (priority = 2)
	public void test2() {
		//soft = new SoftAssert(); // Right
		System.out.println("Test 2");
		
		String actualTitle = "Facebook Login Page" ;
		String expectedTitle = "Facebook Login Page123";
		
		String actaulURL = "https://www.facebook.com/" ;
		String expectedURL = "https://www.facebook.com/home";
		
		String actualText = "Create New Account" ;
		String expectedText = "Create New Account234";
		
		// Soft Assertion 
//		Assert.assertEquals(actualTitle, expectedTitle, "Facebook Title is wrong");
//		soft.assertEquals(actaulURL, expectedURL, "URL not found");
//		soft.assertEquals(actualText, expectedText, "Button Text is wrong");
//		soft.assertAll();
		
		
	}
	
	@Test (priority = 3)
	public void test3() {
		//soft = new SoftAssert(); // Right
		System.out.println("Test 3");
		
		String actualTitle = "Facebook Login Page" ;
		String expectedTitle = "Facebook Login Page";
		
		String actaulURL = "https://www.facebook.com/" ;
		String expectedURL = "https://www.facebook.com/";
		
		String actualText = "Create New Account" ;
		String expectedText = "Create New Account";
		
		// Soft Assertion 
//		Assert.assertEquals(actualTitle, expectedTitle, "Facebook Title is wrong");
//		soft.assertEquals(actaulURL, expectedURL, "URL not found");
//		soft.assertEquals(actualText, expectedText, "Button Text is wrong");
//		soft.assertAll();
		
		
	}
	
	@AfterMethod
	public void afterMethod() {
		//soft.assertAll();  Wrong code 
		System.out.println("After Method TestClassNG_1");
	}
	
	@AfterClass()
	public void afterClass() {
		System.out.println("After Class TestClassNG_1");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test   TestClassNG_1");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite   TestClassNG_1");
	}

}
