package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(
		
		features= {"src/test/java/features/01_login.feature",
			    	"src/test/java/features/02_Addtocart.feature",
				    "src/test/java/features/03_checkout.feature",
				    "src/test/java/features/04_logOut.feature"},
		dryRun=!true,
		snippets= SnippetType.CAMELCASE,
		monochrome = true,
		glue= {"steps","hooks"},
		//plugin= {"pretty", "html:target/CucumberReports.html"} For HTML, JSON, XML REPORTS
		
	    plugin =  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" //For EXTENT REPORT
		)

public class Runner extends  AbstractTestNGCucumberTests{

}
