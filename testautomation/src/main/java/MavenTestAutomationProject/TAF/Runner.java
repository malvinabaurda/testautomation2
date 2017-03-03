package MavenTestAutomationProject.TAF;

public class Runner {

	public static void main(String[] args) {
		TestEnvironment myInstance = new TestEnvironment();
		myInstance.initializeEnvironmentVariables();
		myInstance.createEnvironment();
		myInstance.runTests();
		

	}

}
