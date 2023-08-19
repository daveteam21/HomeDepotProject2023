package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.BrowserHelper;

public class HomeDecorsPage {
	WebDriver driver;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div/div/h1")
	public WebElement homedecortile;

	@FindBy(xpath = "//*[@id=\"ColumnRail_thd_20cf\"]/div/div[7]/nav/a")
	public WebElement windowlink;

	@FindBy(xpath = "//*[@id=\"SideNavigation-1-4LkNldHanzGU7V7Ghcg4P6\"]/ul/li[3]/a")
	public WebElement curtain;

	@FindBy(xpath = "//*[@id=\"browse-search-dimensions\"]/div/div[1]/div/div[2]/div/div[3]/div/label")
	public WebElement nextdaydelivery;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div/div[5]/div[1]/div/button/span")
	public WebElement nextdaytitle;
	
	
	
	@FindBy(xpath ="//*[@id=\"footerEmail\"]")
	public WebElement emailinput;
	
	@FindBy(xpath ="//*[@id=\"footerEmailSignup\"]/fieldset/p[2]/button")
	public WebElement signupbutton;
	
	@FindBy(xpath ="/html/body/div[12]/div[2]/div/div/div/div")
	public WebElement Thankyoutitle;

	public HomeDecorsPage() {
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
