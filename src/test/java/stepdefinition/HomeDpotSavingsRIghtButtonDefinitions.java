package stepdefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import Utils.BrowserHelper;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SmallKitchenAppliancesPage;

public class HomeDpotSavingsRIghtButtonDefinitions extends BrowserHelper {

	@When("Scrolldown to the savings banner.")
	public void scrolldown_to_the_savings_banner() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("scroll(0,document.body.scrollHeight)", "");
		js.executeScript("scroll(0,2050)", "");
	}

	@When("Click the right button.")
	public void click_the_right_button() throws InterruptedException {
		SmallKitchenAppliancesPage smallkitchenPage = new SmallKitchenAppliancesPage();
		smallkitchenPage.rightbutton.click();
		Thread.sleep(2000);
		smallkitchenPage.rightbutton.click();
		Thread.sleep(2000);
		smallkitchenPage.rightbutton.click();
		Thread.sleep(2000);
		smallkitchenPage.rightbutton.click();
		Thread.sleep(2000);
		smallkitchenPage.rightbutton.click();

	}

	@Then("see many other saving items.")
	public void see_many_other_saving_items() throws InterruptedException {
		SmallKitchenAppliancesPage smallkitchenPage = new SmallKitchenAppliancesPage();
		Thread.sleep(2000);
		Assert.assertEquals(smallkitchenPage.airflytitle.getText(), "16 qt. Air Fryer Oven Ariawave Mini Stainless Steel with Rotating Rotisserie");

	}

}
