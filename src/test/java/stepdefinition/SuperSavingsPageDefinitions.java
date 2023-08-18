package stepdefinition;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SpecialsAndOffersPage;

public class SuperSavingsPageDefinitions {

@When("Click on the super savings image")
public void click_on_the_super_savings_image() {
	
	SpecialsAndOffersPage SuperImage = new SpecialsAndOffersPage();
	SuperImage.SuperSavingImage.click();
   
}
@Then("I can see all the super savings items")
public void i_can_see_all_the_super_savings_items() {
	
	SpecialsAndOffersPage SuperSavingsText = new SpecialsAndOffersPage();
	SuperSavingsText.SuperSavings.getText();
	
	Assert.assertEquals(SuperSavingsText.SuperSavings.getText(), "SUPER SAVINGS");
   
}

}
