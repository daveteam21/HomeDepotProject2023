package stepdefinition;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.SearchPage;

public class ClearHistoryDefinition {
	@When("typing hammer on the search bar and click the search button.")
	public void typing_hammer_on_the_search_bar_and_click_the_search_button() {
	   
		HomePage hp = new HomePage();
		hp.searchbar.sendKeys("hammer");
		hp.searchbarclick.click();
		hp.searchbar.clear();
		hp.searchbar.click();
				
	}
	@When("click on clear search history.")
	public void click_on_clear_search_history() throws Exception {
	  SearchPage clear= new SearchPage();
	  Thread.sleep(2000);
	  clear.ClearHistory.click();
	    
	}
	@Then("no recent view history .")
	public void no_recent_view_history() {
	    
		HomePage hp = new HomePage();	
		hp.searchbar.click();
		org.testng.Assert.assertEquals(hp.searchbar.getText(), ""); 
		
	}
	
	
	
}
