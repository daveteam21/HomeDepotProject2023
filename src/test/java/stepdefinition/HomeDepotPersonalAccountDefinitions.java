package stepdefinition;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PersonalAccountPage;

public class HomeDepotPersonalAccountDefinitions {
	
	@When("click the Personal Account.")
	public void click_the_personal_account() throws InterruptedException {
		PersonalAccountPage pa = new PersonalAccountPage();
		Thread.sleep(2000);
		pa.personalAcc.click();
		Thread.sleep(2000);
	}
	 
	
	@Then("navigate to the Create a Personal Account page.")
	public void navigate_to_the_create_a_personal_account_page() {
		PersonalAccountPage createaccount = new PersonalAccountPage();
		Assert.assertEquals(createaccount.AccountTitle.getText(), "Personal Account");
}
}