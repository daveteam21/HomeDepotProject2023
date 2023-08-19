package stepdefinition;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomeDecorsPage;

public class HomeDepotGetItFastNextDaysDeliveryDefinitions {
	
	@When("click Window Treatments.")
	public void click_window_treatments() throws InterruptedException {
	HomeDecorsPage abc = new HomeDecorsPage();
	abc.windowlink.click();
	Thread.sleep(2000);
	    
	}
	@When("click Curtains & Drapes.")
	public void click_curtains_drapes() throws InterruptedException {
	HomeDecorsPage abc = new HomeDecorsPage();
	abc.curtain.click();
	Thread.sleep(2000);
	   
	}
	@When("click Next Day Delivery.")
	public void click_next_day_delivery() throws InterruptedException {
	HomeDecorsPage abc = new HomeDecorsPage();
	abc.nextdaydelivery.click();
	Thread.sleep(2000);
	
	}
	@Then("see the item list for only next-day delivery.")
	public void see_the_item_list_for_only_next_day_delivery() {
	HomeDecorsPage abc = new HomeDecorsPage();
	abc.nextdaytitle.getText();
	Assert.assertEquals(abc.nextdaytitle.getText(), "Get It Fast: Next-Day Delivery");
	    
	}



}
