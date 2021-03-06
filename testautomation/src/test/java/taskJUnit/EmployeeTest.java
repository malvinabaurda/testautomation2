package taskJUnit;

import junit.framework.TestCase;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class EmployeeTest extends TestCase {

	Employee myInstance = new Employee();

	@Before
	public void start() {
		System.out.print("Test start");
	}

	@Test
	public void testCalculateSalary1() {
		assertTrue(myInstance.calculateSalary(1200, 2, 500) == 2900);
	}

	@Test
	public void testCalculateSalary2() {
		assertFalse(myInstance.calculateSalary(1200, 2, 500) != 2900);
	}

	@Test
	public void testCalculateFinancialAid() {
		assertTrue(myInstance.calculateFinancialAid(1200, 100) == 1200);
	}

	@Test
	public void testCalculateDetailsPerHour() {
		assertTrue(myInstance.calculateDetailsPerHour(10, 10) == 1);
	}

	@Test
	public void testCalculateTaxesOnNaturalPerson() {
		assertTrue(myInstance.calculateTaxesOnNaturalPerson(1200, 2, 500, 18, 2) == 580);
	}

	@Test
	public void testCalculatePaymentsToTheTradeUnion() {
		assertTrue(myInstance.calculatePaymentsToTheTradeUnion(1200, 2, 500, 1) == 29);
	}

	@Test
	public void testCalculateBonus() {
		assertTrue(myInstance.calculateBonus(10, 20) == 200);
	}

	@After
	public void finish() {
		System.out.print("Test finish");
	}

	/*
	 * 
	 * @Test public void testCalculateExperianceOnThePosition() {
	 * assertTrue(calculateExperianceOnThePosition("01.01.2017", "03.01.2017")
	 * == 3); }
	 */

}