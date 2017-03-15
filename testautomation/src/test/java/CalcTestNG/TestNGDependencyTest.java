package CalcTestNG;

import org.testng.annotations.Test;

public class TestNGDependencyTest {

	@Test
    public void initEnvironmentTest() {
        System.out.println("This is initEnvironmentTest");
    }
 
    @Test(dependsOnMethods={"initEnvironmentTest"})
    public void testmethod() { // тестовый метод testmethod() зависит от тестового метода initEnvironmentTest() и будет выполнен только после того как отработает initEnvironmentTest() метод.
        System.out.println("This is testmethod");
    }
    
    //зависимость можно установить на группу тестов
    //Сначала выполнится группа тестов а потом зависимые от это группы тесты
    @Test(groups = { "init" })
    public void initEnvironmentTest1() {
        System.out.println("This is initEnvironmentTest1");
    }
 
    @Test(groups = { "init" })
    public void initEnvironmentTest2() {
        System.out.println("This is initEnvironmentTest2");
    }
 
    @Test(dependsOnGroups={"init"})
    public void testmethod1() {
        System.out.println("This is testmethod");
    }
}
