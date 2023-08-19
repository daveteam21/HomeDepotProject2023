package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.BrowserHelper;

public class PersonalAccountPage {
	WebDriver driver;
	
	
	@FindBy(css = "div:nth-of-type(3) > div[role='button'] .col__12-12.u--paddingNone.u__bold.u__husky.u__text-align--center")
	public WebElement ProxtraAccount;
	
	@FindBy(css = ".myAccount--button.u--marginLarge-bottom > .button > .checkbox-btn__label-test.u__text-align--left")
	public WebElement Checkbox;

	@FindBy(xpath = "//*[@id=\"single-signin__body\"]/div/div[2]/form/div[5]/div/div/label/span[3]")
	public WebElement UnCheckbox;
	
	@FindBy(css = "#single-signin__body")
	public WebElement personalAcc; 
	
	@FindBy(xpath = "//*[@id=\"single-signin__body\"]/div/div[1]/div/div/div/p")
	public WebElement AccountTitle; 
	
	

	public PersonalAccountPage() {
		driver = BrowserHelper.driver;
		PageFactory.initElements(driver, this); 
	}

	public void loadPage() {
		String currentURL = driver.getCurrentUrl();
		if (currentURL != "https://www.homedepot.com/auth/view/createaccount/diy?redirect=/&ref=null") {  
			driver.get("https://www.homedepot.com/auth/view/createaccount/diy?redirect=/&ref=null");
		}
	}
}


