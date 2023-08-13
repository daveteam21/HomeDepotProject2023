package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.BrowserHelper;

public class HomePage {
	WebDriver driver;
	
	@FindBy(css = ".HeaderLogo")
	public WebElement logo;
	
	@FindBy(css ="a[title='The Home Depot']  title")
	public WebElement hdtitle;
	

	public HomePage() {
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


