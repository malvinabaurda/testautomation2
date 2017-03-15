package CalcTestNG;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class TestNGGroups {
	private Calc calc1 = new Calc();

	@Test(groups = { "unit1" })
	public void testSum1() {
		assertEquals(6, calc1.sum(3, 3));
	}

	@Test(groups = { "unit1" })
	public void testSum2() {
		assertEquals(5, calc1.sum(2, 3));
	}

	@Test(groups = { "unit1" })
	public void testSum3() {
		assertEquals(4, calc1.sum(2, 2));
	}

	@Test(groups = { "unit2" })
	public void testSum4() {
		assertEquals(3, calc1.subtract(5, 2));
	}

	@Test(groups = { "unit2" })
	public void testSum5() {
		assertEquals(3, calc1.subtract(6, 3));
	}

	@Test(groups = { "unit2" })
	public void testSum6() {
		assertEquals(3, calc1.subtract(7, 4));

	}
}
/*Создайте TestNG xml вида:
 * suite name="Suite">
 * 
 * <test name="Practice Grouping">
 * 
 * <groups>
 * 
 * <run>
 * 
 * <include name="Unit1" />
 * 
 * </run>
 * 
 * </groups>
 * 
 * <classes>
 * 
 * <class name="testautomation.TestNGGroups" />
 * 
 * </classes>
 * 
 * </test>
 * 
 * </suite>
 */
