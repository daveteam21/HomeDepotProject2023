package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.BrowserHelper;

public class SearchPage {
	WebDriver driver;
	@FindBy(xpath = "//h1[contains(text(),'hammer')]")
	public WebElement hammer;
	
	@FindBy(xpath = "//*[@id=\"searchHistory\"]/div/div[1]")
	public WebElement RecentSearches;
	@FindBy(xpath = "//*[@id=\"searchHistory\"]/div/div[2]")
	
	public WebElement ClearHistory;
	
	public SearchPage() {
		driver = BrowserHelper.driver;
		PageFactory.initElements(driver, this); 
	}

	public void loadPage() {
		String currentURL = driver.getCurrentUrl();
		if (currentURL != "https://www.homedepot.com/") {  
			driver.get("https://www.homedepot.com/");
		}
	}
}

