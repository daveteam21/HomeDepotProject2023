package stepdefinition;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DIYPage;

public class DIYWoodProjectspageDefinition {


	@When("Click the DIY Wood Projects link")
	public void Click_the_DIY_Wood_Projects_link() {
		DIYPage diypage = new DIYPage();
		diypage.clickwoodlink.click();
	}

	@Then("the DIY Wood Projects page appears")
	public void the_DIY_Wood_Projects_page_appears() throws InterruptedException {
		DIYPage diypage = new DIYPage();
		Assert.assertEquals(diypage.woodassert.getText(), "DIY Wood Projects");
		Thread.sleep(2000);
	}

}
