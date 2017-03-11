package taskTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EmployeeTest {
	Employee myInstance1 = new Employee();

	@Test
	public void testCalculateSalary() {
		 Assert.assertEquals(2900, myInstance1.calculateSalary(1200, 2, 500));
	}

	/*@Test
	public void testCalculateSalary3() {
		assertEquals(2900.0, myInstance.calculateSalary(1200, 2, 500));
	}

	@Test
	public void testCalculateFinancialAid1() {
		assertTrue(myInstance.calculateFinancialAid(1200, 100) == 1200);
	}

	@Test
	public void testCalculateDetailsPerHour1() {
		assertTrue(myInstance.calculateDetailsPerHour(10, 10) == 1);
	}


	@Test
	public void testCalculateTaxesOnNaturalPerson1() {
		assertTrue(myInstance.calculateTaxesOnNaturalPerson(1200, 2, 500, 18, 2) == 580);


	@Test
	public void testCalculatePaymentsToTheTradeUnion1() {
		assertTrue(myInstance.calculatePaymentsToTheTradeUnion(1200, 2, 500, 1) == 29);
	}


	@Test
	public void testCalculateBonus1() {
		assertTrue(myInstance.calculateBonus(10, 20) == 200);
	}
*/
}
