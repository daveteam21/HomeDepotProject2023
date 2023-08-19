package stepdefinition;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import Utils.BrowserHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DIYPage;

public class BuyingGuidesSelectDefinition extends BrowserHelper {
	@Given("on the DIY Wood Projects page")
	public void on_the_diy_wood_projects_page() {
		DIYPage diypage = new DIYPage();
		diypage.loadDIYWoodsPage();
	}

	@When("i click on the Buying Guides checkbox")
	public void i_click_on_the_buying_guides_checkbox() throws InterruptedException {
		DIYPage diypage = new DIYPage();
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("scroll(0,300)", "");
		Thread.sleep(5000);
		diypage.buyingguidescheckbox.click(); 
		Thread.sleep(5000);
	}

	@Then("i see the message Information Type: Buying Guides")
	public void i_see_the_message_information_type_buying_guides() {
		DIYPage diypage = new DIYPage();
		Assert.assertEquals(diypage.buyingguidescheckboxmessage.getText(),"Information Type: Buying Guides");
	}

}
