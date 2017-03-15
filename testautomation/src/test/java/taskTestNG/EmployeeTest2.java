package taskTestNG;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EmployeeTest2 {
	Employee myInstance1 = new Employee();

	@Test
	public void testCalculateSalary() {
		 assertEquals(2900, (int) myInstance1.calculateSalary(1200, 2, 500));
	}

	@Test
	public void testCalculateSalary3() {
		assertEquals(2900, (int) myInstance1.calculateSalary(1200, 2, 500));
	}

	@Test
	public void testCalculateFinancialAid1() {
		assertEquals(1200, (int) myInstance1.calculateFinancialAid(1200, 100));
	}

	@Test
	public void testCalculateDetailsPerHour1() {
		assertEquals(1, (int) myInstance1.calculateDetailsPerHour(10, 10));
	}


	@Test
	public void testCalculateTaxesOnNaturalPerson1() {
		assertEquals(580, (int) myInstance1.calculateTaxesOnNaturalPerson(1200, 2, 500, 18, 2));}


	@Test(enabled = false)
	public void testCalculatePaymentsToTheTradeUnion1() {
		assertEquals(29, (int) myInstance1.calculatePaymentsToTheTradeUnion(1200, 2, 500, 1));
	}


	@Test(enabled = false)
	public void testCalculateBonus1() {
		assertEquals(200, (int) myInstance1.calculateBonus(10, 20));
	}

}
