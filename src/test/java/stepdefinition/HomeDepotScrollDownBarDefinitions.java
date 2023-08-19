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
	public void click_on_home_décor_furniture() throws InterruptedException {
		HomePage hdskapage = new HomePage();
		hdskapage.homedecorlink.click();
		Thread.sleep(2000);
	}

	@When("Click on Small Kitchen Appliance.")
	public void click_on_small_kitchen_appliance() throws InterruptedException {
		SmallKitchenAppliancesPage skapage = new SmallKitchenAppliancesPage();
		skapage.smallkitchenlink.click();
		Thread.sleep(2000);
	}

	@When("Scroll down to the bottom page.")
	public void scroll_down_to_the_bottom_page() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("scroll(0,document.body.scrollHeight)", "");
		js.executeScript("scroll(0,12574)", "");
		Thread.sleep(2000);
		
	}

	@Then("See copyright print.")
	public void see_copyright_print() {
		SmallKitchenAppliancesPage skapage = new SmallKitchenAppliancesPage();
		Assert.assertEquals(skapage.copyrighttxt.getText(), "© 2000-2022 Home Depot. All Rights Reserved. Use of this site is subject to certain Terms Of Use.");
		
	}
}
