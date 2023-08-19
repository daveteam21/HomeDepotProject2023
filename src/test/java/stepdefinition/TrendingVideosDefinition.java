package stepdefinition;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DIYPage;

public class TrendingVideosDefinition {

	@Given("DIY Projects and Ideas page open")
	public void diy_projects_and_ideas_page_open() {
		DIYPage diypage = new DIYPage();
		diypage.loadDIYPage();
	}

	@When("i click on the first trending video")
	public void i_click_on_the_first_trending_video() {
		DIYPage diypage = new DIYPage();
		diypage.clickvideo.click(); 

	}

	@Then("video starts playing")
	public void video_starts_playing() throws InterruptedException {
		DIYPage diypage = new DIYPage();
		Assert.assertEquals(diypage.cancelvideo.isDisplayed(),true);
		Thread.sleep(10000);
		diypage.cancelvideo.click();
	}

}
