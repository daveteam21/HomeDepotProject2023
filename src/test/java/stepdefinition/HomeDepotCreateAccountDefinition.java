package stepdefinition;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class HomeDepotCreateAccountDefinition {
	
	@Given("the Open Home Depot pa.")
	public void the_open_home_depot_pa() throws InterruptedException {
	   HomePage hp = new HomePage();
	   hp.loadPage(); 
	   Thread.sleep(4000);
	}
	@When("clicking on the My Account Icon.")
	public void clicking_on_the_my_account_icon() throws InterruptedException {
		
		 HomePage hp1 = new HomePage();
		   hp1.MyAccountIcon.click();
		   Thread.sleep(2000);
	}
	@When("click the Create an Account button.")
	public void click_the_create_an_account_button() throws InterruptedException {
		 HomePage hp1 = new HomePage();
		   hp1.CreateAccount.click();
		   Thread.sleep(2000);
	}
	@Then("two personal and business account options.")
	public void two_personal_and_business_account_options() {
		 HomePage hp1 = new HomePage();
		   Assert.assertEquals(hp1.PersonalAccount.getText(),"Personal Account");
	}

}
