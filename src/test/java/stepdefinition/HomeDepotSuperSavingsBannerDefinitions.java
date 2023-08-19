package stepdefinition;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.SmallKitchenAppliancesPage;

public class HomeDepotSuperSavingsBannerDefinitions {
	
	@Given("Open the Home Depot Homepage.")
	public void open_the_home_depot_homepage() {
		HomePage homepage = new HomePage();
		homepage.loadPage();
	}
	@When("Click on Home Décor, Furniture, and Kitchen.")
	public void click_on_home_décor_furniture_and_kitchen() throws InterruptedException {
		HomePage hdskapage = new HomePage ();
		hdskapage.homedecorlink.click();
		Thread.sleep(2000);
	}
	@When("Click on Small Kitchen Appliance")
	public void click_on_small_kitchen_appliance() throws InterruptedException {
		SmallKitchenAppliancesPage skapage = new SmallKitchenAppliancesPage ();
		skapage.smallkitchenlink.click();
		Thread.sleep(2000);
	}
	@When("Click the Super Savings Banner")
	public void click_the_super_savings_banner() throws InterruptedException {
		SmallKitchenAppliancesPage skapage = new SmallKitchenAppliancesPage ();
		skapage.sponserbannerimg.click();
		Thread.sleep(2000);
	}
	@Then("See only super-saving items.")
	public void see_only_super_saving_items() {
		SmallKitchenAppliancesPage skapage = new SmallKitchenAppliancesPage ();
		Assert.assertEquals(skapage.supersavingtxt.getText(), "SUPER SAVINGS");
		
	}

}
