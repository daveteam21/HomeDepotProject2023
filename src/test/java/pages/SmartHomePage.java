package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.BrowserHelper;

public class SmartHomePage {
	WebDriver driver;

	
	@FindBy(css= "p:nth-of-type(68) > a > strong")
	public WebElement smarthomelink ;
	
	@FindBy(css= ".sui-h1-display.sui-leading-none.sui-line-clamp-unset.sui-text-primary.sui-uppercase")
	public WebElement smarthometitle ;

	public SmartHomePage() {
		driver = BrowserHelper.driver;
		PageFactory.initElements(driver, this);
	}

	public void loadPage() {
		String currentURL = driver.getCurrentUrl();
		if (currentURL != "https://www.homedepot.com/c/site_map") {
			driver.get("https://www.homedepot.com/c/site_map");
		}
	}
}
