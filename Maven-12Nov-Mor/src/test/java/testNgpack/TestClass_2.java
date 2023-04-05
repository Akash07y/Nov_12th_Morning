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

public class TestClass_2 {
	
SoftAssert soft ;
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite  TestClass_2");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test  TestClass_2");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class TestClass_2");
		//soft = new SoftAssert(); Wrong Code
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method TestClass_2");
		soft = new SoftAssert(); // Right
	}
	
	@Test (dependsOnMethods = "testB")
	public void testA() {
		//soft = new SoftAssert(); // Right
		System.out.println("Test A");
		
		String actualTitle = "Amezon Login Page" ;
		String expectedTitle = "Amezon Login Page123";
		
		String actaulURL = "https://www.Amezon.com/" ;
		String expectedURL = "https://www.Amezon.com/home";
		
		String actualText = "Sign In New Account" ;
		String expectedText = "Sign In  New Account234";
		
		// Soft Assertion 
		soft.assertEquals(actualTitle, expectedTitle, "Sign In  Title is wrong");
		soft.assertEquals(actaulURL, expectedURL, " Sign In  URL not found");
		soft.assertEquals(actualText, expectedText, " Sign In  Button Text is wrong");
		soft.assertAll();
	}
	
	@Test (priority = 2)
	public void testB() {
		//soft = new SoftAssert(); // Right
		System.out.println("Test B");
		
		String actualTitle = "Facebook Login Page" ;
		String expectedTitle = "Facebook Login Page123";
		
		String actaulURL = "https://www.facebook.com/" ;
		String expectedURL = "https://www.facebook.com/home";
		
		String actualText = "Create New Account" ;
		String expectedText = "Create New Account234";
		
		// Soft Assertion 
		Assert.assertEquals(actualTitle, expectedTitle, "Facebook Title is wrong");
		soft.assertEquals(actaulURL, expectedURL, "URL not found");
		soft.assertEquals(actualText, expectedText, "Button Text is wrong");
		soft.assertAll();
		
		
	}
	
	@Test (priority = 2)
	public void testC() {
		//soft = new SoftAssert(); // Right
		System.out.println("Test C");
		
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
	@Test (priority = 2)
	public void testD() {
		//soft = new SoftAssert(); // Right
		System.out.println("Test C");
		
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
	
	public void test3() {
		//soft = new SoftAssert(); // Right
		System.out.println("Test C");
		
		String actualTitle = "Facebook Login Page" ;
		String expectedTitle = "Facebook Login Page123";
		
		String actaulURL = "https://www.facebook.com/" ;
		String expectedURL = "https://www.facebook.com/home";
		
		String actualText = "Create New Account" ;
		String expectedText = "Create New Account234";
		
//		// Soft Assertion 
//		Assert.assertEquals(actualTitle, expectedTitle, "Facebook Title is wrong");
//		soft.assertEquals(actaulURL, expectedURL, "URL not found");
//		soft.assertEquals(actualText, expectedText, "Button Text is wrong");
//		soft.assertAll();
		
		
	}
	
	@AfterMethod
	public void afterMethod() {
		//soft.assertAll();  Wrong code 
		System.out.println("After Method TestClass_2");
	}
	
	@AfterClass()
	public void afterClass() {
		System.out.println("After Class TestClass_2");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test  TestClass_2");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite  TestClass_2");
	}

}
