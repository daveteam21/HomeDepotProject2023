package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.SpecialsAndOffersPage;

public class SpecialsAndOffersDefinitions {

	@Given("Open Home Depo home page")
	public void open_home_depo_home_page() {

		HomePage homepage = new HomePage();
		homepage.loadPage();

	}

	@When("Click on  the specials and offers and click")
	public void click_on_the_specials_and_offers_and_click() {

		HomePage homepage1 = new HomePage();
		homepage1.SpecialsAndOfferslink.click();

	}

	@Then("Specials and offers page appears")
	public void specials_and_offers_page_appears() {
		SpecialsAndOffersPage SpecialsOffers = new SpecialsAndOffersPage();
		String specials = SpecialsOffers.SpecialsAndOfferstitle.getText();
	  System.out.println(specials);
	}

}
