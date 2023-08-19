package stepdefinition;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomeDecorsPage;
import pages.HomePage;

public class HomeDepotHomeDecorFurnitureandKitchenwareDefinitions {
	@Given("Open Home Depot page.")
	public void open_home_depot_page() {
	HomePage abc = new HomePage();
	abc.loadPage();	
		
	}
	@When("clicking on Home Decor, Furniture, and Kitchenware.")
	public void clicking_on_home_decor_furniture_and_kitchenware() {
	HomePage abc = new HomePage();
	abc.homedecorlink.click();
		
	    
	}
	@Then("see all items related to home decor, furniture, and kitchenware.")
	public void see_all_items_related_to_home_decor_furniture_and_kitchenware() {
	HomeDecorsPage abc = new HomeDecorsPage ();
	Assert.assertEquals(abc.homedecortile.getText(), "HOME DECOR");
			
	}

}
