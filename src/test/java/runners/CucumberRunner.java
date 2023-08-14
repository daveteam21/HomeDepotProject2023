package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/resources/features/HomeDpotSavingsRIghtButton.feature" }, glue = {
		"stepdefinition" }, tags = "", plugin = { "html:target/cucumber-reports.html" })
public class CucumberRunner extends AbstractTestNGCucumberTests {

	
}

//HomeDepotSmallKitchenAppliance HomeDepotSuperSavingsBanner HomeDepotScrollDownBar

//HomeDepotTopButton.feature