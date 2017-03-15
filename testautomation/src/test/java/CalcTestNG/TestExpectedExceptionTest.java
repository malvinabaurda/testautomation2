package CalcTestNG;

import java.util.List;

import org.testng.annotations.Test;

public class TestExpectedExceptionTest {
	 @Test(expectedExceptions = NullPointerException.class)
	    public void testNullPointerException() {
	        List list = null;
	        int size = list.size();
	    }
}
