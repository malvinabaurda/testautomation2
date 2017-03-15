package CalcTestNG;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CalcTest {

	private Calc calc = new Calc();
	@BeforeMethod
	 
	public void beforeMethod1() {
	 
	System.out.println("This will execute before every Method");
	 
	}
	 
	@AfterMethod
	 
	public void afterMethod1() {
	 
	System.out.println("This will execute after every Method");
	 
	}
	 
	@BeforeClass
	 
	public void beforeClass1() {
	 
	System.out.println("This will execute before Class");
	 
	}
	 
	@AfterClass
	 
	public void afterClass1() {
	 
	System.out.println("This will execute after the Class");
	 
	}
	 
	@BeforeTest
	 
	public void beforeTest1() {
	 
	System.out.println("This will execute before the Test");
	 
	}
	 
	@AfterTest
	 
	public void afterTest1() {
	 
	System.out.println("This will execute after the Test");
	 
	}
	 
	@BeforeSuite
	 
	public void beforeSuite1() {
	 
	System.out.println("This will execute before the Test Suite");
	 
	}
	 
	@AfterSuite
	 
	public void afterSuite1() {
	 
	System.out.println("This will execute after Test Suite");
	 
	}
	
	@BeforeMethod
	public void setUp() throws Exception {
		System.out.println("@BeforeMethod");
	}

	@AfterMethod
	public void tearDown() throws Exception {
		System.out.println("@AfterMethod");
	}

	@BeforeGroups
	public void beforeGroups() throws Exception {
		System.out.println("BeforeGroups");
	}

	@AfterGroups
	public void afterGroups() throws Exception {
		System.out.println("@AfterGroups");
	}

	@BeforeClass
	public void beforeClass() throws Exception {
		System.out.println("@BeforeClass");
	}

	@BeforeTest
	public void beforeTest() throws Exception {
		System.out.println("@BeforeTest");
	}

	@AfterTest
	public void afterTest() throws Exception {
		System.out.println("@AfterTest");
	}

	@AfterClass
	public void afterClass() throws Exception {
		System.out.println("@AfterClass");
	}

	@BeforeSuite
	public void beforeSuite() throws Exception {
		System.out.println("@BeforeSuite");
	}

	@AfterSuite
	public void afterSuite() throws Exception {
		System.out.println("@AfterSuite");
	}

	@Test
	public void testSum1() {
		assertEquals(6, calc.sum(3, 3));
	}
}
