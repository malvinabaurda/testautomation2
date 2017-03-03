package MavenTestAutomationProject.TAF;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class TestEnvironment {

	public static final String DATA_FILE = "C://Users//Пользователь//workspace_alla//TAF//ini//Taf.ini";
	public String pathToTestDataScripts = "";
	public String pathToTestCases = "";
	public String pathToReportFolder = "";
	public String databaseURL = "";
	public String databaseUser = "";
	public String databasePassword = "";
	//Конструктор
    public TestEnvironment () {
    	
    }
	
    private String getValueFromFile(String dataFile, String parameter) {
		String textValue = "";
		try {
			// Open the file that is the first
			// command line parameter
			FileInputStream fstream = new FileInputStream(dataFile);
			// Get the object of DataInputStream
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			// Read File Line By Line
			while ((strLine = br.readLine()) != null) {
				// Print the content on the console
				if (strLine.substring(0, parameter.length()).equals(parameter)) {
					textValue = strLine.substring(parameter.length() + 3, strLine.length());

				}

			}
			// Close the input stream
			in.close();
		} catch (Exception e) {// Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}
		return textValue;
	}

	
	public void initializeEnvironmentVariables() {
		pathToTestDataScripts = getValueFromFile(DATA_FILE, "pathToTestDataScripts");
		pathToTestCases = getValueFromFile(DATA_FILE, "pathToTestCases");
		pathToReportFolder = getValueFromFile(DATA_FILE, "pathToReportFolder");
		databaseURL = getValueFromFile(DATA_FILE, "databaseURL");
		databaseUser = getValueFromFile(DATA_FILE, "databaseUser");
		databasePassword = getValueFromFile(DATA_FILE, "databasePassword");
		
	}

	

	public void createEnvironment() {
		Database myDatabase = new Database(databaseURL, databaseUser, databasePassword);
		myDatabase.createTablesAndFillData(pathToTestDataScripts);
	}

	public void runTests() {
		Test myTest = new Test(pathToTestCases, pathToReportFolder, databaseURL, databaseUser, databasePassword);
		myTest.executeTestCasesAndGenerateReport();
		
	}

}
