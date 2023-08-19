package stepdefinition;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import Utils.BrowserHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.SmallKitchenAppliancesPage;

public class HomeDepotTopButtonDefinitions extends BrowserHelper {

	@Given("Open HomeDepot homepage.")
	public void open_home_depot_homepage() {
		HomePage homepage = new HomePage();
		homepage.loadPage();

	}

	@When("Click on Home Décor")
	public void click_on_home_décor() {
		HomePage hdskapage = new HomePage();
		hdskapage.homedecorlink.click();
	}

	@When("Click on Small Kitchen Applian.")
	public void click_on_small_kitchen_applian() {
		SmallKitchenAppliancesPage skapage = new SmallKitchenAppliancesPage();
		skapage.smallkitchenlink.click();

	}

	@When("Scrolldown to the bottom page.")
	public void scrolldown_to_the_bottom_page() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,6000)", "");
		Thread.sleep(2000);
		js.executeScript("scroll(0,12574)", "");

	}

	@When("Click the Top button.")
	public void click_the_top_button() {
		SmallKitchenAppliancesPage skapage = new SmallKitchenAppliancesPage();
		skapage.topbutton.click();

	}

	@Then("It will bring back to the top page.")
	public void it_will_bring_back_to_the_top_page() throws InterruptedException {
		SmallKitchenAppliancesPage skapage = new SmallKitchenAppliancesPage();
		Thread.sleep(2000);
		Assert.assertEquals(skapage.toptitle.getText(), "SUPER SAVINGS Up to 50% Off Select Items.");
	}
}
