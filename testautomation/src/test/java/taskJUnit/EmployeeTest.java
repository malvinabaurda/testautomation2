package taskJUnit;

import junit.framework.TestCase;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
//@Ignore - перед классом - все тесты в этом классе будут отключены

@RunWith(Parameterized.class)
public class EmployeeTest extends TestCase {
	public double firstParameter;
	public double secondParameter;
	public double thirdParameter;
	public double expectedResult;

	public void test(double firstParameter, double secondParameter, double thirdParameter, double expectedResult) {
		this.firstParameter = firstParameter;
		this.secondParameter = secondParameter;
		this.thirdParameter = thirdParameter;
		this.expectedResult = expectedResult;
	}

	@Test
	public void testCalculateSalary1() {
		Employee myInstance = new Employee(firstParameter, secondParameter, thirdParameter);
		int result = myInstance.getResult();
		assertTrue(result == expectedResult);
	}

	@Parameterized.Parameters
	public static Collection<Object[]> getTestData() {
		return Arrays.asList(new Object[][] { { 1200, 2, 500, 2900 }, { 1000, 2, 500, 2500 }, { 100, 2, 500, 700 },
				{ 1500, 2, 500, 3500 } });
	}

	/*
	 * @Test public void testCalculateSalary2() {
	 * assertFalse(myInstance.calculateSalary(1200, 2, 500) != 2900); }
	 * 
	 * @Test public void testCalculateSalary3() { assertEquals(2900.0,
	 * myInstance.calculateSalary(1200, 2, 500)); }
	 * 
	 * @Test public void testCalculateFinancialAid1() {
	 * assertTrue(myInstance.calculateFinancialAid(1200, 100) == 1200); }
	 * 
	 * @Test public void testCalculateFinancialAid2() {
	 * assertFalse(myInstance.calculateFinancialAid(1200, 100) != 1200); }
	 * 
	 * @Test public void testCalculateFinancialAid3() { assertEquals(1200.0,
	 * myInstance.calculateFinancialAid(1200, 100)); }
	 * 
	 * @Test public void testCalculateDetailsPerHour1() {
	 * assertTrue(myInstance.calculateDetailsPerHour(10, 10) == 1); }
	 * 
	 * @Test public void testCalculateDetailsPerHour2() {
	 * assertFalse(myInstance.calculateDetailsPerHour(10, 10) != 1); }
	 * 
	 * @Test public void testCalculateDetailsPerHour3() { assertEquals(1.0,
	 * myInstance.calculateDetailsPerHour(10, 10)); }
	 * 
	 * @Test public void testCalculateTaxesOnNaturalPerson1() {
	 * assertTrue(myInstance.calculateTaxesOnNaturalPerson(1200, 2, 500, 18, 2)
	 * == 580); }
	 * 
	 * @Test public void testCalculateTaxesOnNaturalPerson2() {
	 * assertFalse(myInstance.calculateTaxesOnNaturalPerson(1200, 2, 500, 18, 2)
	 * != 580); }
	 * 
	 * @Test public void testCalculateTaxesOnNaturalPerson3() {
	 * assertEquals(580.0, myInstance.calculateTaxesOnNaturalPerson(1200, 2,
	 * 500, 18, 2)); }
	 * 
	 * @Test public void testCalculatePaymentsToTheTradeUnion1() {
	 * assertTrue(myInstance.calculatePaymentsToTheTradeUnion(1200, 2, 500, 1)
	 * == 29); }
	 * 
	 * @Test public void testCalculatePaymentsToTheTradeUnion2() {
	 * assertFalse(myInstance.calculatePaymentsToTheTradeUnion(1200, 2, 500, 1)
	 * != 29); }
	 * 
	 * @Test public void testCalculatePaymentsToTheTradeUnion3() {
	 * assertEquals(29.0, myInstance.calculatePaymentsToTheTradeUnion(1200, 2,
	 * 500, 1)); }
	 * 
	 * @Test public void testCalculateBonus1() {
	 * assertTrue(myInstance.calculateBonus(10, 20) == 200); }
	 * 
	 * @Test public void testCalculateBonus2() {
	 * assertFalse(myInstance.calculateBonus(10, 20) != 200); }
	 * 
	 * @Test public void testCalculateBonus3() { assertEquals(200.0,
	 * myInstance.calculateBonus(10, 20)); }
	 * 
	 
	 * /*
	 * 
	 * @Test public void testCalculateExperianceOnThePosition() {
	 * assertTrue(calculateExperianceOnThePosition("01.01.2017", "03.01.2017")
	 * == 3); }
	 */

}