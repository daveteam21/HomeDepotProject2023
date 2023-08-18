package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.BrowserHelper;

public class SpecialsAndOffersPage {
	WebDriver driver;
	
	
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[2]/div/div[1]/div/div/h1")
	public WebElement SpecialsAndOfferstitle;
	
	@FindBy(xpath = "//*[@id=\"sbotdBanner\"]/section/a/span")
	public WebElement ShopTodaysButton;
	
	@FindBy(xpath = "//*[@id=\"EtchImage_thd_df32\"]/a/img")
	public WebElement SuperSavingImage;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div/div[2]/div/div/div/h1")
	public WebElement SuperSavings;
	
	

	public SpecialsAndOffersPage() {
		driver = BrowserHelper.driver;
		PageFactory.initElements(driver, this); 
	}

	public void loadPage() {
		String currentURL = driver.getCurrentUrl();
		if (currentURL != "https://www.homedepot.com/c/Savings_Center") {  
			driver.get("https://www.homedepot.com/c/Savings_Center");
		}
	}
}


