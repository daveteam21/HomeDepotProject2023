package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.BrowserHelper;

public class WirelessRouterPage {
	WebDriver driver;
	
	@FindBy(xpath = "/html//div[@id='column_thd_7bbe']//a[@href='/b/Smart-Home-Smart-Devices-Smart-Home-Systems-Smart-Routers/N-5yc1vZc21b']/span[@class='etchVisualNavigationStory__card__title']")
	public WebElement smartrouterslink;

	@FindBy(css = ".sui-h1-display.sui-leading-none.sui-line-clamp-unset.sui-text-primary.sui-uppercase")
	public WebElement smartrouterstitle;
	


	public WirelessRouterPage() {
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
