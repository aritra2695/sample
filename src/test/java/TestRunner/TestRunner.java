package TestRunner;


import org.testng.annotations.DataProvider;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;




@CucumberOptions(
		tags = "",
		features = "src/test/resources/feature",
		glue = {"stepdefinition"},
		
		plugin = {"pretty",
					"html:target/htmlreport.html",
					"json:target/MyReports/report.json",
					"junit:target/MyReports/report.xml"
		},
		monochrome = true,
		publish = true
		)

public class TestRunner extends AbstractTestNGCucumberTests {
	
	@Override
	@DataProvider (parallel = true)
	public Object [][] scenarios() {
		return super.scenarios();
		
	}
	

}

//"html:target/cucumber-reports/cucumber-pretty",
//"json:target/cucumber-reports/CucumberTestReport.json",
//"rerun:target/cucumber-reports/rerun.txt",

//extends AbstractTestNGCucumberTests