package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.WirelessRouterPage;

public class WirelessRoutersDefinitions {
	
	@Given("Open Home Depot home pages")
	public void open_home_depot_home_pages() {
		HomePage home = new HomePage ();
		home.loadPage();
	}

	@When("Click All Department link")
	public void click_all_department_link() {
		HomePage alldept = new HomePage();
		alldept.alldepartmentlink.click();
	}

	@When("Click on wireless routers")
	public void click_on_wireless_routers() {
		WirelessRouterPage wirelessrouters = new WirelessRouterPage();
		wirelessrouters.smartrouterslink.click();

	}

	@Then("All wireless routers for home appear")
	public void all_wireless_routers_for_home_appear() {
		WirelessRouterPage routers = new WirelessRouterPage();
		routers.smartrouterstitle.getText();
	}

}
