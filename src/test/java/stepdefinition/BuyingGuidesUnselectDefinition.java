package stepdefinition;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import Utils.BrowserHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DIYPage;

public class BuyingGuidesUnselectDefinition extends BrowserHelper {

	@Given("on the DIY Wood Projects page with the Buying Guides checkbox is selected")
	public void on_the_diy_wood_projects_page_with_the_buying_guides_checkbox_is_selected()
			throws InterruptedException {
		DIYPage diypage = new DIYPage();
		// synchronization issue due to the webdriver setup.
	}

	@When("i uncheck the Buying Guides checkbox")
	public void i_uncheck_the_buying_guides_checkbox() throws InterruptedException {
		DIYPage diypage = new DIYPage();
		// given condition
		diypage.loadDIYWoodsPage();
		diypage.loadDIYWoodsPage();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,300)", "");
		Thread.sleep(3000);
		diypage.buyingguidescheckbox.click();
		Thread.sleep(3000);
		// when condition
		js.executeScript("scroll(0,300)", "");
		Thread.sleep(3000);
		diypage.buyingguidescheckbox.click();
		Thread.sleep(3000);
	}

	@Then("i see the message Information Type: Buying Guides is gone")
	public boolean i_see_the_message_information_type_buying_guides_is_gone() {
		DIYPage diypage = new DIYPage();
		try {
			diypage.buyingguidescheckboxmessage.isDisplayed();
			return false;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return true;
		}
	}
}
