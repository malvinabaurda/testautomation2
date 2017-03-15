package CalcTestNG;

import org.testng.annotations.Test;

public class TestNGTimeTest {

	@Test(timeOut = 1000)
	public void waitLongTime() throws Exception {
		Thread.sleep(1001); //в данном случаем тестовый метод будет завален, так как лимит времени для его выполнения превышает заданный.

	}
}