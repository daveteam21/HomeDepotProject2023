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
	
	// Zia
	
	@FindBy(xpath = "//input[@id='headerSearch']")
	public WebElement searchbar;
	
	@FindBy(xpath = "//button[@id='headerSearchButton']")
	public WebElement searchbarclick;
	
	// Nusrat 
	
	@FindBy(css= "li:nth-of-type(8) > .TaskLinks__link")
	public WebElement helplink;
	
	@FindBy(css= "li:nth-of-type(1) > .ShoppingLinks__link")
	public WebElement alldepartmentlink ;
	
	// Shakil
	
	@FindBy(css ="li:nth-of-type(3) > .ShoppingLinks__link")
	public WebElement DIYlink;
	
	// Joni
	
	@FindBy(xpath = "//*[@id=\"header\"]/div[1]/div[4]/div/ul/li[6]/a")
	public WebElement SpecialsAndOfferslink;
	
	// Mr.Raton
	
	@FindBy(css = "[title] .MyAccount__label")
	public WebElement MyAccountIcon;
	
	@FindBy(css = "p#SPSORegister  .bttn__content")
	public WebElement CreateAccount;
	
	@FindBy(css = "div:nth-of-type(1) > div[role='button'] .col__12-12.u--paddingNone.u__bold.u__husky.u__text-align--center")
	public WebElement PersonalAccount;
	
	@FindBy(css = "div:nth-of-type(3) > div[role='button'] .col__12-12.u--paddingNone.u__bold.u__husky.u__text-align--center")
	public WebElement ProxtraAccount;
	
	

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


