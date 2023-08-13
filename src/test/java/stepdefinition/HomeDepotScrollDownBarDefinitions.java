package stepdefinition;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import Utils.BrowserHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.SmallKitchenAppliancesPage;

public class HomeDepotScrollDownBarDefinitions extends BrowserHelper {

	@Given("Open the HomeDepot page")
	public void open_the_home_depot_page() {
		HomePage homepage = new HomePage();
		homepage.loadPage();
	}

	@When("Click on Home Décor, Furniture")
	public void click_on_home_décor_furniture() {
		SmallKitchenAppliancesPage hdskapage = new SmallKitchenAppliancesPage();
		hdskapage.homedecorlink.click();
	}

	@When("Click on Small Kitchen Appliance.")
	public void click_on_small_kitchen_appliance() {
		SmallKitchenAppliancesPage skapage = new SmallKitchenAppliancesPage();
		skapage.smallkitchenlink.click();
	}

	@When("Scroll down to the bottom page.")
	public void scroll_down_to_the_bottom_page() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("scroll(0,document.body.scrollHeight)", "");
		js.executeScript("scroll(0,12574)", "");
		
	}

	@Then("See copyright print.")
	public void see_copyright_print() {
		SmallKitchenAppliancesPage skapage = new SmallKitchenAppliancesPage();
		Assert.assertEquals(skapage.copyrighttxt.getText(), "© 2000-2022 Home Depot. All Rights Reserved. Use of this site is subject to certain Terms Of Use.");
		
	}
}
