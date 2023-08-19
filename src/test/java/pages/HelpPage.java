package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.BrowserHelper;

public class HelpPage {
	WebDriver driver;

	@FindBy(css = ".section-heading__text--6fd88.section-heading__text--plain--6fd88")
	public WebElement cstitle;

	public HelpPage() {
		driver = BrowserHelper.driver;
		PageFactory.initElements(driver, this);
	}

	public void loadPage() {
		String currentURL = driver.getCurrentUrl();
		if (currentURL != "https://www.homedepot.com/c/customer_service/") {
			driver.get("https://www.homedepot.com/c/customer_service");
		}
	}
}
