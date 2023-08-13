package stepdefinition;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class HomeDepotLogoDefinitions {
	
	@Given("Open Home Depot Homepage")
	public void open_home_depot_homepage() {
		 HomePage homepage = new HomePage();
		 homepage.loadPage();
	}

	@When("Click Home Depot Logo")
	public void click_home_depot_logo() throws InterruptedException {
	   HomePage homepage = new HomePage();
	   Thread.sleep(1000);
	   homepage.logo.click();
	}
	@Then("The page will refresh to home page.")
	public void the_page_will_refresh_to_home_page() {
	HomePage homepage = new HomePage();
	Assert.assertEquals(homepage.hdtitle.getText(), "The Home Depot Logo");
	}
}



