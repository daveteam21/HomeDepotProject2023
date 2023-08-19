package stepdefinition;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.DIYPage;

public class VisitDIYProjectsandIdeasPageDefinitions {

	@Given("Open the Home Depot homepage")
	public void open_the_home_depot_homepage() {
		HomePage homepage = new HomePage();
		homepage.loadPage();
	}

	@When("Click the DIY Projects and Ideas link")
	public void click_the_diy_projects_and_ideas_link() throws InterruptedException {
		HomePage homepage = new HomePage();
		Thread.sleep(1000);
		homepage.DIYlink.click();
	}

	@Then("the DIY Projects and Ideas page appears")
	public void the_diy_projects_and_ideas_page_appears() {
		DIYPage diypage = new DIYPage();
		Assert.assertEquals(diypage.DIYpagevisit.getText(), "DIY Projects and Ideas");
	}

}
