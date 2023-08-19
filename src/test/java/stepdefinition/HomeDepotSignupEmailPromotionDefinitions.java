package stepdefinition;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomeDecorsPage;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
public class HomeDepotSignupEmailPromotionDefinitions {
	
	
    
	@When("enter a valid email address.")
	public void enter_a_valid_email_address() throws InterruptedException {
	HomeDecorsPage abc = new HomeDecorsPage();
	abc.emailinput.sendKeys("apply@yahoo.com");
	Thread.sleep(2000);
	abc.signupbutton.click();
	Thread.sleep(2000);
	   
	}
	@Then("see the Thank you for signing up message.")
	public void see_the_thank_you_for_signing_up_message() {
		HomeDecorsPage abc = new HomeDecorsPage(); 
		Assert.assertEquals(abc.Thankyoutitle.getText(), "Thank you for signing up. "
				+ "Your first email should arrive shortly.");
	}


}
