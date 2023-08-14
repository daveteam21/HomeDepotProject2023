package pages;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import Utils.BrowserHelper;

	public class SmallKitchenAppliancesPage {
		
		WebDriver driver;
		
		@FindBy(xpath ="//*[@id=\"ColumnRail_thd_20cf\"]/div/div[11]/nav/a")
		public WebElement smallkitchenlink;
		
		@FindBy(xpath ="//h1[contains(text(),'Small Kitchen Appliances')]")
		public WebElement titlepage;
		
	// Sponser Banner	
		@FindBy(xpath ="//*[@id=\"default_banner_carousel\"]/a/img")
		public WebElement sponserbannerimg;
		
		@FindBy(xpath ="/html//div[@id='root']/div/div[3]/div[@class='col__12-12']/div[2]/div[@class='col__12-12']//h1[.='Super Savings ']")
		public WebElement supersavingtxt;
	
	// Scroll down
		
		@FindBy(css ="#footer [class] .u__legal:nth-child(1)")
		public WebElement copyrighttxt;
	
		// Top button
		@FindBy(css =".back-to-top--visible")
		public WebElement topbutton;
		
		@FindBy(xpath ="//*[@id=\"messageBar\"]/div/a/span")  
		public WebElement toptitle;
		
	// Right Button
		
		@FindBy(xpath ="//*[@id=\"column_thd_d61e\"]/div/div/div[2]/div/div/div[3]/button")  
		public WebElement rightbutton;
		
		@FindBy(xpath ="//*[@id=\"product-header_title_product-323845164\"]")  
		public WebElement airflytitle;
		
		
		
		
		public SmallKitchenAppliancesPage() {
			driver = BrowserHelper.driver;
			PageFactory.initElements(driver, this); 
		}

		public void loadPage() {
			String currentURL = driver.getCurrentUrl();
			if (currentURL != "https://www.homedepot.com/b/Appliances-Small-Kitchen-Appliances/N-5yc1vZbv48") {  
				driver.get("https://www.homedepot.com/b/Appliances-Small-Kitchen-Appliances/N-5yc1vZbv48");
			}
		}
	}
