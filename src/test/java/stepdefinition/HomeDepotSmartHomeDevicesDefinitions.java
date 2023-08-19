package stepdefinition;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.SmartHomePage;

public class HomeDepotSmartHomeDevicesDefinitions {
	
	@Given("Open Home Depot Page")
	public void open_home_depot_page() {
		HomePage home = new HomePage ();
		home.loadPage();
	}

	@When("Click All Department dropdown menu")
	public void click_all_department_dropdown_menu() {
	HomePage AllDept = new HomePage();
	AllDept.alldepartmentlink.click();
	}
	
	@When("Click on Smart Home")
	public void click_on_smart_home() {
	SmartHomePage smarthome = new SmartHomePage();
	smarthome.smarthomelink.click();
	}
	
	@Then("All smart devices for home appear")
	public void all_smart_devices_for_home_appear() {
	SmartHomePage shtitle = new SmartHomePage ();
	shtitle.smarthometitle.getText();
	
	Assert.assertEquals(shtitle.smarthometitle.getText(), "SMART HOME");
	}

	

}
