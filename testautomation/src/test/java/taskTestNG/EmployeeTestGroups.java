package taskTestNG;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.Test;

public class EmployeeTestGroups {
	private Employee myInstance1 = new Employee();

	@Test(groups = {"Salary"})
	public void testCalculateSalary() {
		 assertEquals(2900, (int) myInstance1.calculateSalary(1200, 2, 500));
	}

	@Test(groups = {"Salary"})
	public void testCalculateFinancialAid1() {
		assertEquals(1200, (int) myInstance1.calculateFinancialAid(1200, 100));
	}

	@Test(groups = {"Other"})
	public void testCalculateDetailsPerHour1() {
		assertEquals(1, (int) myInstance1.calculateDetailsPerHour(10, 10));
	}


	@Test(groups = {"Salary"})
	public void testCalculateTaxesOnNaturalPerson1() {
		assertEquals(580, (int) myInstance1.calculateTaxesOnNaturalPerson(1200, 2, 500, 18, 2));}


	@Test(groups = {"Other"})
	public void testCalculatePaymentsToTheTradeUnion1() {
		assertEquals(29, (int) myInstance1.calculatePaymentsToTheTradeUnion(1200, 2, 500, 1));
	}


	@Test (groups = {"Salary"})
	public void testCalculateBonus1() {
		assertEquals(200, (int) myInstance1.calculateBonus(10, 20));
	}
}
