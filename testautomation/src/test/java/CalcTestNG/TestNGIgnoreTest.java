package CalcTestNG;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class TestNGIgnoreTest {

	private Calc calc1 = new Calc();
	
	@Test
	public void testSum1(){
		assertEquals(6, calc1.sum(3, 3));
	}
	//ignored test
	@Test(enabled = false)
	public void testSum2(){
		assertEquals(5, calc1.sum(2,3));
	}
	
	@Test
	public void testSum3(){
		assertEquals(4, calc1.sum(2, 2));
	}
	
	@Test
	public void testSum4(){
		assertEquals(3, calc1.sum(1, 2));
	}
}
