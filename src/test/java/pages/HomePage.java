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
	
	
	@FindBy(xpath = ".//*[@id=\"header\"]/div/div[4]/div/ul/li[2]/a")
	public WebElement homedecorlink;
	
	@FindBy(xpath = "//*[@id=\"header\"]/div[1]/div[4]/div/ul/li[6]/a")
	public WebElement SpecialsAndOfferslink;
	

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


