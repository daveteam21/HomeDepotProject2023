package stepdefinition;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HelpPage;
import pages.HomePage;

public class HomeDepotHelpLinkDefinitions {

	@Given("OpenHome Depot home page")
	public void openhome_depot_home_page() {
		HomePage homepage = new HomePage ();
		homepage.loadPage();
	}   

	@When("Click on Help link")
	public void click_on_help_link() {
		HomePage homepage = new HomePage ();
		homepage.helplink.click();   
	}

	@Then("Help and Customer Service page open")
	public void help_and_customer_service_page_open() {
	    HelpPage helppage = new HelpPage ();
	    Assert.assertEquals(helppage.cstitle.getText(), "Help and Customer Service Center");
	    //String title = helppage.cstitle.getText();
	    //System.out.println(title + "This is the title page");
	}


}
