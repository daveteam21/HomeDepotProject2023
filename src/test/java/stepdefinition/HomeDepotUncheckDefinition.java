package stepdefinition;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.PersonalAccountPage;

public class HomeDepotUncheckDefinition {
	
	@Given("the personal account creation page")
	public void the_personal_account_creation_page() {
		
	   PersonalAccountPage pap = new PersonalAccountPage ();
	   pap.loadPage();
	}
	
	@When("I  click on the Keep me signed in checkbox")
	public void i_click_on_the_keep_me_signed_in_checkbox() {
		PersonalAccountPage pap = new PersonalAccountPage ();
		pap.Checkbox.click();
	}
	
	@Then("the Keep me signed in checkbox unchecked.")
	public void the_keep_me_signed_in_checkbox_unchecked() {
		PersonalAccountPage pap = new PersonalAccountPage ();
		Assert.assertEquals(pap.UnCheckbox.getText(), "Uncheck if using a public or shared device");
	}

}
