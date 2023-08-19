package stepdefinition;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.SearchPage;

public class SearchFunctionDefinitions {
	@Given("the Open Home Depot page.")
	public void the_open_home_depot_page() {
	    
	HomePage hp = new HomePage();
	hp.loadPage();
	   
	}
	@When("typing hammer on the search bar.")
	public void typing_hammer_on_the_search_bar() {
	HomePage hp = new HomePage();
	hp.searchbar.sendKeys("hammer");
	    
	}
	@When("click the search button.")
	public void click_the_search_button() {
		HomePage hp = new HomePage();
		hp.searchbarclick.click();
	    
	}
	@Then("see all items related to the hammer only.")
	public void see_all_items_related_to_the_hammer_only() {
	    SearchPage searchbar =new SearchPage();
	   String result = searchbar.hammer.getText(); 
	   System.out.println(result);
	  
	  org.testng.Assert.assertEquals(searchbar.hammer.getText(), "HAMMER");
	    
	   
	}
	
}
