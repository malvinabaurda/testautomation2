package MavenTestAutomationProject.TAF;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.Assert.*;
public class AppTest extends TestCase {
	App myInstance = new App();
	  /*@Test
	public void testFunctionOne() {
		App myInstance = new App(4);
		int result = myInstance.myFunctionOne(4);
		assertEquals(41, myInstance.myFunctionOne(4));
		
	} */
	@Test
	public void testFunctionOne() {
		assertTrue(myInstance.myFunctionOne(10) == 165);
	}
    @Test
	public void testFunctionTwo() {
		assertTrue(myInstance.myFunctionTwo(10) == 990);
	}

}
