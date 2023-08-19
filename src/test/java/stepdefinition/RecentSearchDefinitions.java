package stepdefinition;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.SearchPage;

public class RecentSearchDefinitions {
	@When("clicking on search box.")
	public void clicking_on_search_box() {
	 HomePage Box= new HomePage();
	 Box.searchbar.sendKeys("paint");
	 Box.searchbarclick.click();
	 Box.searchbar.clear();
	 Box.searchbar.click();
	}
	@Then("see all recent searches display.")
	public void see_all_recent_searches_display() {
	    
		SearchPage box1=new SearchPage(); 
		box1.RecentSearches.getText();
		org.testng.Assert.assertEquals(box1.RecentSearches.getText(), "Your recent searches"); 
		
		
				
		
	}
	
	
	
}
