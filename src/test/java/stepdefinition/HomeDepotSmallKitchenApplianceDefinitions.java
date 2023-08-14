package stepdefinition;

import org.testng.Assert;

import Utils.BrowserHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.HomePage;
import pages.SmallKitchenAppliancesPage;

public class HomeDepotSmallKitchenApplianceDefinitions extends BrowserHelper{
	

	@Given("Open the Home Depot Homepage")
	public void open_the_home_depot_homepage() {
		HomePage homepage = new HomePage();
		homepage.loadPage();
	}
	@When("Click on Home Décor, Furniture, and Kitchenware.")
	public void click_on_home_décor_furniture_and_kitchenware() {
		HomePage hdskapage = new HomePage ();
		hdskapage.homedecorlink.click();
	}
	@When("Click on Small Kitchen Appliances.")
	public void click_on_small_kitchen_appliances() {
		SmallKitchenAppliancesPage hdskapage = new SmallKitchenAppliancesPage ();
		hdskapage.smallkitchenlink.click();
		
	}
	   
	@Then("The item list should have only kitchen-related products.")
	public void the_item_list_should_have_only_kitchen_related_products() {
		SmallKitchenAppliancesPage hdskapage = new SmallKitchenAppliancesPage ();
		Assert.assertEquals(hdskapage.titlepage.getText(), "SMALL KITCHEN APPLIANCES");
		String title =	hdskapage.titlepage.getText();
		System.out.println("This is the title name :" + title);

	}
}