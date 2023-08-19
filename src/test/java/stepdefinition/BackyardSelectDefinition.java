package stepdefinition;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import Utils.BrowserHelper;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DIYPage;

public class BackyardSelectDefinition extends BrowserHelper{

@When("i click on the Backyard checkbox")
public void i_click_on_the_backyard_checkbox() throws InterruptedException {
	DIYPage diypage = new DIYPage();
	JavascriptExecutor js = (JavascriptExecutor) driver; 
	js.executeScript("scroll(0,300)", "");
	Thread.sleep(5000);
	diypage.backyardcheckbox.click(); 
	Thread.sleep(5000);
}

@Then("i see the message Home Area: Backyard")
public void i_see_the_message_home_area_backyard() {
	DIYPage diypage = new DIYPage();
	Assert.assertEquals(diypage.backyardcheckboxmessage.getText(),"Home Area: Backyard");
}

}
