package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.SpecialsAndOffersPage;

public class ShopTodaysSpecialsDefinitions {
	@Given("Open Home depot home page")
	public void open_home_depot_home_page() {
	    HomePage homepage = new HomePage();
	    homepage.loadPage();
	}
	@When("Click  on the  specials and offers")
	public void click_on_the_specials_and_offers() {
		
		 HomePage homepage = new HomePage();
		  homepage.SpecialsAndOfferslink.click();
	}
	@When("Click on the shop today’s specials")
	public void click_on_the_shop_today_s_specials() {
		
	SpecialsAndOffersPage specials = new SpecialsAndOffersPage();
	specials.ShopTodaysButton.click();
	    
	}
	@Then("See all items from the specials buy of the day")
	public void see_all_items_from_the_specials_buy_of_the_day() {
	    
	}

}
